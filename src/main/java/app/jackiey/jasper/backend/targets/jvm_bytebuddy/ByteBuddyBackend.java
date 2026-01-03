package app.jackiey.jasper.backend.targets.jvm_bytebuddy;

import app.jackiey.jasper.backend.api.Artifact;
import app.jackiey.jasper.backend.cgir.*;
import app.jackiey.jasper.backend.lower.AstToCgir;
import app.jackiey.jasper.cli.JasperMain;
import app.jackiey.jasper.runtime.lib.JasperInternalLib;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.description.modifier.Ownership;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.MethodCall;
import net.bytebuddy.implementation.StubMethod;

import java.lang.reflect.Method;

public final class ByteBuddyBackend {
    private static final String GEN_CLASS = "app.jackiey.jasper.generated.JasperProgram";
    private Class<?> generatedMain;

    public Artifact emit(CgProgram cg, JasperMain.CliOptions opt) {
        try {
            Method printFoo = JasperInternalLib.class.getMethod("printFoo", long.class, long.class);
            Method call0 = JasperInternalLib.class.getMethod("callGeneratedStatic", String.class, String.class);
            Method call2 = JasperInternalLib.class.getMethod("callGeneratedStatic2Long", String.class, String.class, long.class, long.class);

            DynamicType.Builder<?> b = new ByteBuddy()
                    .subclass(Object.class)
                    .name(GEN_CLASS);

            for (CgFunction fn : cg.functions) {
                Implementation impl = StubMethod.INSTANCE;

                if ("foo".equals(fn.name)) {
                    // foo(long a, long b) { JasperInternalLib.printFoo(a,b); }
                    impl = MethodCall.invoke(printFoo).withArgument(0).withArgument(1);
                    b = b.defineMethod("foo", void.class, Visibility.PUBLIC, Ownership.STATIC)
                            .withParameters(long.class, long.class)
                            .intercept(impl);
                    continue;
                }

                if (AstToCgir.ENTRY.equals(fn.name)) {
                    // __entry()：若 IR 中含 Call2I64 则执行调用；否则为空函数（RetVoid）。
                    Long a = null, bb = null;
                    for (CgInst inst : fn.body) {
                        if (inst instanceof CgInst.Call2I64) {
                            CgInst.Call2I64 c = (CgInst.Call2I64) inst;
                            a = c.a;
                            bb = c.b;
                        }
                    }

                    if (a != null && bb != null) {
                        impl = MethodCall.invoke(call2).with(GEN_CLASS, "foo", a, bb);
                    } else {
                        impl = StubMethod.INSTANCE;
                    }

                    b = b.defineMethod(AstToCgir.ENTRY, void.class, Visibility.PUBLIC, Ownership.STATIC)
                            .intercept(impl);
                    continue;
                }

                // default: ignore
                b = b.defineMethod(fn.name, void.class, Visibility.PUBLIC, Ownership.STATIC)
                        .intercept(StubMethod.INSTANCE);
            }

            // main calls __entry
            b = b.defineMethod("main", void.class, Visibility.PUBLIC, Ownership.STATIC)
                    .withParameters(String[].class)
                    .intercept(MethodCall.invoke(call0).with(GEN_CLASS, AstToCgir.ENTRY));

            generatedMain = b.make()
                    .load(JasperInternalLib.class.getClassLoader(), ClassLoadingStrategy.Default.INJECTION)
                    .getLoaded();

            return new Artifact(null, this);
        } catch (Exception e) {
            throw new RuntimeException("ByteBuddy backend failed: " + e.getMessage(), e);
        }
    }

    public void runMain() {
        if (generatedMain == null) throw new IllegalStateException("No class generated yet.");
        try {
            generatedMain.getMethod("main", String[].class).invoke(null, (Object) new String[0]);
        } catch (Exception e) {
            throw new RuntimeException("Failed to run generated main: " + e.getMessage(), e);
        }
    }
}
