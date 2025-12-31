package app.jackiey.jasper.backend.cgir;

public abstract class CgInst {
    private CgInst() {}

    // foo(a:int64,b:int64){ print(a,b,a+b); }
    public static final class PrintFooParams extends CgInst {
        public PrintFooParams() {}
    }

    // __entry: call foo(immA, immB)
    public static final class Call2I64 extends CgInst {
        public final String callee;
        public final long a;
        public final long b;

        public Call2I64(String callee, long a, long b) {
            this.callee = callee;
            this.a = a;
            this.b = b;
        }
    }

    public static final class RetVoid extends CgInst {
        public RetVoid() {}
    }
}
