package app.jackiey.jasper.demo;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

import org.bytedeco.ffmpeg.global.avutil;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.PointerPointer;
import org.bytedeco.llvm.LLVM.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.LLVMAddFunction;
import static org.bytedeco.llvm.global.LLVM.LLVMAppendBasicBlock;
import static org.bytedeco.llvm.global.LLVM.LLVMBuildCall2;
import static org.bytedeco.llvm.global.LLVM.LLVMBuildGlobalStringPtr;
import static org.bytedeco.llvm.global.LLVM.LLVMBuildRet;
import static org.bytedeco.llvm.global.LLVM.LLVMConstInt;
import static org.bytedeco.llvm.global.LLVM.LLVMDisposeBuilder;
import static org.bytedeco.llvm.global.LLVM.LLVMDisposeMessage;
import static org.bytedeco.llvm.global.LLVM.LLVMDisposeModule;
import static org.bytedeco.llvm.global.LLVM.LLVMFunctionType;
import static org.bytedeco.llvm.global.LLVM.LLVMInt8Type;
import static org.bytedeco.llvm.global.LLVM.LLVMPointerType;
import static org.bytedeco.llvm.global.LLVM.LLVMPositionBuilderAtEnd;
import static org.bytedeco.llvm.global.LLVM.LLVMPrintModuleToFile;
import static org.bytedeco.llvm.global.LLVM.LLVMReturnStatusAction;
import static org.bytedeco.llvm.global.LLVM.LLVMVerifyModule;

public class inittest {

    public interface Greeter {
        String greet();
    }

    public static void main(String[] args) {
        System.out.println("== Byte Buddy (force Java 8 bytecode) ==");

        try {
            DynamicType.Unloaded<?> unloaded = new ByteBuddy(ClassFileVersion.JAVA_V8)
                    .subclass(Object.class)
                    .implement(Greeter.class)
                    .method(ElementMatchers.named("greet"))
                    .intercept(FixedValue.value("Hello from Byte Buddy (Java 8 bytecode)!"))
                    .make();

            // Java 8: 用 Paths.get，而不是 Path.of
            Path outDir = Paths.get("generated-classes");
            Files.createDirectories(outDir);

            unloaded.saveIn(outDir.toFile()); // 写出 .class 文件
            System.out.println("Saved classes under: " + outDir.toAbsolutePath());

            Class<? extends Greeter> type = unloaded
                    .load(inittest.class.getClassLoader())
                    .getLoaded()
                    .asSubclass(Greeter.class);

            Greeter g = type.getDeclaredConstructor().newInstance();
            System.out.println("Generated class: " + type.getName());
            System.out.println("greet(): " + g.greet());
            System.out.println("Byte Buddy OK ✅");
        } catch (Throwable t) {
            System.out.println("Byte Buddy FAILED ❌");
            t.printStackTrace();
        }

        System.out.println();
        System.out.println("== Bytedeco (FFmpeg native) ==");

        try {
            String ffmpegVersion = String.valueOf(avutil.av_version_info());
            System.out.println("FFmpeg av_version_info(): " + ffmpegVersion);
            System.out.println("Bytedeco OK ✅");
        } catch (UnsatisfiedLinkError e) {
            System.out.println("Bytedeco native load FAILED ❌（通常缺少 *-platform 或平台不匹配）");
            e.printStackTrace();
        } catch (Throwable t) {
            System.out.println("Bytedeco FAILED ❌");
            t.printStackTrace();
        }
        // 1) 直接打印 hello world
        System.out.println("hello, world");

        // 2) 生成一个 out.ll（里面也会 puts("hello, world")）
        LLVMModuleRef mod = LLVMModuleCreateWithName("jasper");
        LLVMBuilderRef builder = LLVMCreateBuilder();

        // ---- types ----
        LLVMTypeRef i32 = LLVMInt32Type();
        LLVMTypeRef i8 = LLVMInt8Type();
        LLVMTypeRef i8Ptr = LLVMPointerType(i8, 0);

        // ---- declare: i32 @puts(i8*) ----
        PointerPointer<LLVMTypeRef> putsParams = new PointerPointer<>(1);
        putsParams.put(0, i8Ptr);
        LLVMTypeRef putsTy = LLVMFunctionType(i32, putsParams, 1, 0);
        LLVMValueRef putsFn = LLVMAddFunction(mod, "puts", putsTy);

        // ---- define: i32 @main() ----
        LLVMTypeRef mainTy = LLVMFunctionType(i32, (PointerPointer<?>) null, 0, 0);
        LLVMValueRef mainFn = LLVMAddFunction(mod, "main", mainTy);
        LLVMBasicBlockRef entry = LLVMAppendBasicBlock(mainFn, "entry");
        LLVMPositionBuilderAtEnd(builder, entry);

        // ---- global string "hello, world" ----
        LLVMValueRef str = LLVMBuildGlobalStringPtr(builder, "hello, world", ".str");

        // call puts(str)
        PointerPointer<LLVMValueRef> callArgs = new PointerPointer<>(1);
        callArgs.put(0, str);

        LLVMBuildCall2(
                builder,
                putsTy,     // 函数类型
                putsFn,     // callee
                callArgs,   // 参数数组
                1,
                ""
        );

        // return 0
        LLVMBuildRet(builder, LLVMConstInt(i32, 0, 0));

        // verify
        BytePointer err = new BytePointer((Pointer) null);
        if (LLVMVerifyModule(mod, LLVMReturnStatusAction, err) != 0) {
            System.err.println("verify failed: " + err.getString());
            LLVMDisposeMessage(err);
            cleanup(builder, mod);
            return;
        }

        // print to out.ll
        BytePointer outErr = new BytePointer((Pointer) null);
        int rc = LLVMPrintModuleToFile(mod, "out.ll", outErr);
        if (rc != 0) {
            System.err.println("print failed: " + outErr.getString());
            LLVMDisposeMessage(outErr);
            cleanup(builder, mod);
            return;
        }

        cleanup(builder, mod);
        System.out.println("Wrote out.ll");
    }

    static void cleanup(LLVMBuilderRef builder, LLVMModuleRef mod) {
        LLVMDisposeBuilder(builder);
        LLVMDisposeModule(mod);
    }
}
