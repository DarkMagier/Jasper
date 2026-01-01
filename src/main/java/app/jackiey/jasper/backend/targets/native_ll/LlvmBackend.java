package app.jackiey.jasper.backend.targets.native_ll;

import app.jackiey.jasper.backend.api.Artifact;
import app.jackiey.jasper.backend.api.Target;
import app.jackiey.jasper.cli.JasperMain;
import app.jackiey.jasper.middle.mir.MirFunction;
import app.jackiey.jasper.middle.mir.MirInstruction;
import app.jackiey.jasper.middle.mir.MirProgram;
import app.jackiey.jasper.middle.mir.MirType;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.PointerPointer;
import org.bytedeco.llvm.LLVM.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static org.bytedeco.llvm.global.LLVM.*;

/**
 * LLVM backend (ByteDeco LLVM C API).
 * - Target.LL: emits an .ll file
 * - Target.NATIVE: emits a native binary by clang'ing the generated .ll
 */
public final class LlvmBackend {

    public Artifact emit(MirProgram mir, JasperMain.CliOptions opt) throws IOException, InterruptedException {
        Path out = opt.out;
        if (out == null) {
            Files.createDirectories(Paths.get("target", "jasper"));
            out = Paths.get("target", "jasper", opt.target == Target.NATIVE ? "a.out" : "out.ll");
        } else {
            Path parent = out.toAbsolutePath().getParent();
            if (parent != null) Files.createDirectories(parent);
        }

        Path llPath = (opt.target == Target.NATIVE)
                ? Paths.get(out.toAbsolutePath().toString() + ".ll")
                : out;

        writeLlWithLlvmApi(llPath, mir);

        if (opt.target == Target.LL) {
            return new Artifact(llPath, this);
        }

        Path binPath = out.toAbsolutePath();
        compileWithClang(llPath, binPath);
        return new Artifact(binPath, this);
    }

    private void writeLlWithLlvmApi(Path llPath, MirProgram mir) throws IOException {
        LLVMModuleRef mod = LLVMModuleCreateWithName("jasper");
        LLVMBuilderRef builder = LLVMCreateBuilder();

        LLVMTypeRef i32 = LLVMInt32Type();
        LLVMTypeRef i64 = LLVMInt64Type();
        LLVMTypeRef i8 = LLVMInt8Type();
        LLVMTypeRef i8Ptr = LLVMPointerType(i8, 0);

        // declare: i32 @printf(i8*, ...)
        PointerPointer<LLVMTypeRef> printfParams = new PointerPointer<LLVMTypeRef>(1);
        printfParams.put(0, i8Ptr);
        LLVMTypeRef printfTy = LLVMFunctionType(i32, printfParams, 1, 1);
        LLVMValueRef printfFn = LLVMAddFunction(mod, "printf", printfTy);

        // global fmt: "%ld %ld %ld\n\0"
        String fmt = "%ld %ld %ld\n";
        int fmtSize = fmt.length() + 1;

        LLVMTypeRef fmtArrTy = LLVMArrayType(i8, fmtSize);
        LLVMValueRef fmtGlobal = LLVMAddGlobal(mod, fmtArrTy, ".fmt");
        LLVMSetLinkage(fmtGlobal, LLVMPrivateLinkage);
        LLVMSetGlobalConstant(fmtGlobal, 1);
        LLVMValueRef fmtInit = LLVMConstString(new BytePointer(fmt), fmt.length(), 0);
        LLVMSetInitializer(fmtGlobal, fmtInit);

        LLVMValueRef zero64 = LLVMConstInt(i64, 0, 0);
        PointerPointer<LLVMValueRef> idx = new PointerPointer<LLVMValueRef>(2);
        idx.put(0, zero64);
        idx.put(1, zero64);
        LLVMValueRef fmtPtr = LLVMConstInBoundsGEP2(fmtArrTy, fmtGlobal, idx, 2);

        // function prototypes from MIR
        Map<String, LLVMValueRef> fnMap = new HashMap<String, LLVMValueRef>();

        for (MirFunction fn : mir.functions) {
            PointerPointer<LLVMTypeRef> params = null;
            int paramCount = fn.params.size();
            if (paramCount > 0) {
                params = new PointerPointer<LLVMTypeRef>(paramCount);
                for (int i = 0; i < paramCount; i++) params.put(i, i64);
            }

            LLVMTypeRef retTy = (fn.returnType == MirType.VOID) ? LLVMVoidType() : i64;
            LLVMTypeRef fnTy = LLVMFunctionType(retTy, (PointerPointer<?>) params, paramCount, 0);
            LLVMValueRef f = LLVMAddFunction(mod, fn.name, fnTy);
            fnMap.put(fn.name, f);
        }

        // always generate main(): i32 main(){ __entry(); return 0; }
        LLVMTypeRef mainTy = LLVMFunctionType(i32, (PointerPointer<?>) null, 0, 0);
        LLVMValueRef mainFn = LLVMAddFunction(mod, "main", mainTy);
        fnMap.put("main", mainFn);

        // emit MIR bodies
        for (MirFunction fn : mir.functions) {
            LLVMValueRef f = fnMap.get(fn.name);
            LLVMBasicBlockRef entry = LLVMAppendBasicBlock(f, "entry");
            LLVMPositionBuilderAtEnd(builder, entry);

            // register -> LLVMValueRef
            Map<Integer, LLVMValueRef> regs = new HashMap<Integer, LLVMValueRef>();

            // params are r0..rN-1
            for (int i = 0; i < fn.params.size(); i++) {
                regs.put(Integer.valueOf(i), LLVMGetParam(f, i));
            }

            for (MirInstruction inst : fn.body) {
                if (inst instanceof MirInstruction.ConstInt64) {
                    MirInstruction.ConstInt64 c = (MirInstruction.ConstInt64) inst;
                    regs.put(Integer.valueOf(c.dest), LLVMConstInt(i64, c.value, 1));
                } else if (inst instanceof MirInstruction.AddInt64) {
                    MirInstruction.AddInt64 a = (MirInstruction.AddInt64) inst;
                    LLVMValueRef l = regs.get(Integer.valueOf(a.left));
                    LLVMValueRef r = regs.get(Integer.valueOf(a.right));
                    LLVMValueRef sum = LLVMBuildAdd(builder, l, r, "sum");
                    regs.put(Integer.valueOf(a.dest), sum);
                } else if (inst instanceof MirInstruction.PrintInt64Triple) {
                    MirInstruction.PrintInt64Triple p = (MirInstruction.PrintInt64Triple) inst;
                    LLVMValueRef va = regs.get(Integer.valueOf(p.a));
                    LLVMValueRef vb = regs.get(Integer.valueOf(p.b));
                    LLVMValueRef vc = regs.get(Integer.valueOf(p.c));

                    PointerPointer<LLVMValueRef> args = new PointerPointer<LLVMValueRef>(4);
                    args.put(0, fmtPtr);
                    args.put(1, va);
                    args.put(2, vb);
                    args.put(3, vc);

                    LLVMBuildCall2(builder, printfTy, printfFn, args, 4, "");
                } else if (inst instanceof MirInstruction.CallVoid) {
                    MirInstruction.CallVoid call = (MirInstruction.CallVoid) inst;
                    LLVMValueRef callee = fnMap.get(call.callee);
                    int ac = call.args.length;

                    PointerPointer<LLVMValueRef> args = null;
                    if (ac > 0) {
                        args = new PointerPointer<LLVMValueRef>(ac);
                        for (int i = 0; i < ac; i++) args.put(i, regs.get(Integer.valueOf(call.args[i])));
                    }

                    PointerPointer<LLVMTypeRef> calleeParams = null;
                    if (ac > 0) {
                        calleeParams = new PointerPointer<LLVMTypeRef>(ac);
                        for (int i = 0; i < ac; i++) calleeParams.put(i, i64);
                    }
                    LLVMTypeRef calleeTy = LLVMFunctionType(LLVMVoidType(), (PointerPointer<?>) calleeParams, ac, 0);
                    LLVMBuildCall2(builder, calleeTy, callee, (PointerPointer<?>) args, ac, "");

                } else if (inst instanceof MirInstruction.ReturnVoid) {
                    LLVMBuildRetVoid(builder);
                } else {
                    throw new IllegalStateException("Unknown MIR instruction: " + inst);
                }
            }
        }

        // emit main body
        {
            LLVMBasicBlockRef entry = LLVMAppendBasicBlock(mainFn, "entry");
            LLVMPositionBuilderAtEnd(builder, entry);

            LLVMValueRef entryFn = fnMap.get(MirProgram.ENTRY);
            LLVMTypeRef entryTy = LLVMFunctionType(LLVMVoidType(), (PointerPointer<?>) null, 0, 0);
            LLVMBuildCall2(builder, entryTy, entryFn, (PointerPointer<?>) null, 0, "");
            LLVMBuildRet(builder, LLVMConstInt(i32, 0, 0));
        }

        // verify
        BytePointer err = new BytePointer((Pointer) null);
        if (LLVMVerifyModule(mod, LLVMReturnStatusAction, err) != 0) {
            String msg = err.getString();
            LLVMDisposeMessage(err);
            cleanup(builder, mod);
            throw new IOException("LLVM verify failed: " + msg);
        }

        // print to file
        BytePointer outErr = new BytePointer((Pointer) null);
        int rc = LLVMPrintModuleToFile(mod, llPath.toAbsolutePath().toString(), outErr);
        if (rc != 0) {
            String msg = outErr.getString();
            LLVMDisposeMessage(outErr);
            cleanup(builder, mod);
            throw new IOException("LLVMPrintModuleToFile failed: " + msg);
        }

        cleanup(builder, mod);
    }

    private void cleanup(LLVMBuilderRef builder, LLVMModuleRef mod) {
        LLVMDisposeBuilder(builder);
        LLVMDisposeModule(mod);
    }

    private void compileWithClang(Path llPath, Path outBin) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder(
                "clang",
                llPath.toAbsolutePath().toString(),
                "-O0",
                "-o",
                outBin.toAbsolutePath().toString()
        );
        pb.inheritIO();
        Process p = pb.start();
        int code = p.waitFor();
        if (code != 0) throw new IOException("clang failed with exit code " + code + " (" + llPath + ")");
        outBin.toFile().setExecutable(true, false);
    }
}
