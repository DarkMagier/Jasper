package app.jackiey.jasper.backend.targets.jvm_bytebuddy;

import app.jackiey.jasper.backend.api.Artifact;
import app.jackiey.jasper.cli.JasperMain;
import app.jackiey.jasper.middle.mir.MirFunction;
import app.jackiey.jasper.middle.mir.MirInstruction;
import app.jackiey.jasper.middle.mir.MirProgram;
import app.jackiey.jasper.runtime.lib.JasperInternalLib;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.modifier.Ownership;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.jar.asm.Opcodes;

import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * JVM backend using ByteBuddy.
 *
 * Takes MIR and emits Java 8 bytecode.
 */
public final class ByteBuddyBackend {

    public static final String GEN_CLASS = "app.jackiey.jasper.generated.JasperProgram";

    private Class<?> generatedMain;

    public Artifact emit(MirProgram mir, JasperMain.CliOptions opt) {
        try {
            DynamicType.Builder<?> b = new ByteBuddy(ClassFileVersion.JAVA_V8)
                    .subclass(Object.class)
                    .name(GEN_CLASS);

            for (MirFunction fn : mir.functions) {
                Class<?>[] params = new Class<?>[fn.params.size()];
                for (int i = 0; i < params.length; i++) params[i] = long.class;

                b = b.defineMethod(fn.name, void.class, Visibility.PUBLIC, Ownership.STATIC)
                        .withParameters(params)
                        .intercept(new MirBodyImplementation(fn));
            }

            // public static void main(String[] args) { __entry(); }
            b = b.defineMethod("main", void.class, Visibility.PUBLIC, Ownership.STATIC)
                    .withParameters(String[].class)
                    .intercept(new MainImplementation());

            DynamicType.Unloaded<?> unloaded = b.make();

            // Optional: write out .class for inspection
            Path outDir = Paths.get("target", "jasper", "generated-classes");
            try {
                Files.createDirectories(outDir);
                unloaded.saveIn(outDir.toFile());
            } catch (Throwable ignored) {
                // ignore I/O problems in demo mode
            }

            generatedMain = unloaded
                    .load(JasperInternalLib.class.getClassLoader(), ClassLoadingStrategy.Default.INJECTION)
                    .getLoaded();

            return new Artifact(null, this);
        } catch (Throwable t) {
            throw new RuntimeException("ByteBuddy backend failed", t);
        }
    }

    public void runMain() {
        if (generatedMain == null) throw new IllegalStateException("No class generated yet.");
        try {
            generatedMain.getMethod("main", String[].class).invoke(null, (Object) new String[0]);
        } catch (Throwable t) {
            throw new RuntimeException("Failed to run generated main", t);
        }
    }

    // ---------------- implementation details ----------------

    private static final class MainImplementation implements Implementation {
        @Override
        public InstrumentedType prepare(InstrumentedType instrumentedType) {
            return instrumentedType;
        }

        @Override
        public ByteCodeAppender appender(Target implementationTarget) {
            return new ByteCodeAppender() {
                @Override
                public Size apply(MethodVisitor mv, Context ctx, MethodDescription md) {
                    String owner = implementationTarget.getInstrumentedType().getInternalName();

                    // invoke __entry()
                    mv.visitMethodInsn(Opcodes.INVOKESTATIC, owner, MirProgram.ENTRY, "()V", false);
                    mv.visitInsn(Opcodes.RETURN);

                    return new Size(0, 1);
                }
            };
        }
    }

    private static final class MirBodyImplementation implements Implementation {
        private final MirFunction fn;

        private MirBodyImplementation(MirFunction fn) {
            this.fn = fn;
        }

        @Override
        public InstrumentedType prepare(InstrumentedType instrumentedType) {
            return instrumentedType;
        }

        @Override
        public ByteCodeAppender appender(final Target implementationTarget) {
            return new ByteCodeAppender() {
                @Override
                public Size apply(MethodVisitor mv, Context ctx, MethodDescription md) {
                    String owner = implementationTarget.getInstrumentedType().getInternalName();

                    // All registers are i64 for the demo. Map rN -> local slot (N*2)
                    int maxStack = 0;

                    for (MirInstruction inst : fn.body) {
                        if (inst instanceof MirInstruction.ConstInt64) {
                            MirInstruction.ConstInt64 c = (MirInstruction.ConstInt64) inst;
                            mv.visitLdcInsn(Long.valueOf(c.value));
                            mv.visitVarInsn(Opcodes.LSTORE, c.dest * 2);
                            maxStack = Math.max(maxStack, 2);
                        } else if (inst instanceof MirInstruction.AddInt64) {
                            MirInstruction.AddInt64 a = (MirInstruction.AddInt64) inst;
                            mv.visitVarInsn(Opcodes.LLOAD, a.left * 2);
                            mv.visitVarInsn(Opcodes.LLOAD, a.right * 2);
                            mv.visitInsn(Opcodes.LADD);
                            mv.visitVarInsn(Opcodes.LSTORE, a.dest * 2);
                            maxStack = Math.max(maxStack, 4);
                        } else if (inst instanceof MirInstruction.PrintInt64Triple) {
                            MirInstruction.PrintInt64Triple p = (MirInstruction.PrintInt64Triple) inst;
                            mv.visitVarInsn(Opcodes.LLOAD, p.a * 2);
                            mv.visitVarInsn(Opcodes.LLOAD, p.b * 2);
                            mv.visitVarInsn(Opcodes.LLOAD, p.c * 2);

                            mv.visitMethodInsn(
                                    Opcodes.INVOKESTATIC,
                                    "app/jackiey/jasper/runtime/lib/JasperInternalLib",
                                    "print3",
                                    "(JJJ)V",
                                    false
                            );
                            maxStack = Math.max(maxStack, 6);
                        } else if (inst instanceof MirInstruction.CallVoid) {
                            MirInstruction.CallVoid call = (MirInstruction.CallVoid) inst;

                            String desc = buildDesc(call.args.length);
                            for (int i = 0; i < call.args.length; i++) {
                                mv.visitVarInsn(Opcodes.LLOAD, call.args[i] * 2);
                            }
                            mv.visitMethodInsn(Opcodes.INVOKESTATIC, owner, call.callee, desc, false);
                            maxStack = Math.max(maxStack, call.args.length * 2);
                        } else if (inst instanceof MirInstruction.ReturnVoid) {
                            mv.visitInsn(Opcodes.RETURN);
                        } else {
                            throw new IllegalStateException("Unknown MIR instruction: " + inst);
                        }
                    }

                    int maxLocals = fn.localCount * 2;
                    // Note: long local uses 2 slots. ByteBuddy will compute frames for us.
                    return new Size(maxStack, maxLocals);
                }
            };
        }

        private static String buildDesc(int argCount) {
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            for (int i = 0; i < argCount; i++) sb.append('J');
            sb.append(")V");
            return sb.toString();
        }
    }
}
