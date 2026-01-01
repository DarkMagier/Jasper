package app.jackiey.jasper.middle.mir;

import java.util.Arrays;

/**
 * MIR instruction set: small, RISC-like but with descriptive names.
 *
 * Registers are integer indices.
 * Parameters occupy register 0..(paramCount-1).
 */
public abstract class MirInstruction {
    private MirInstruction() {}

    public static final class ConstInt64 extends MirInstruction {
        public final int dest;
        public final long value;
        public ConstInt64(int dest, long value) { this.dest = dest; this.value = value; }
        @Override public String toString() { return "r"+dest+" = const_i64 "+value; }
    }

    public static final class AddInt64 extends MirInstruction {
        public final int dest;
        public final int left;
        public final int right;
        public AddInt64(int dest, int left, int right) {
            this.dest = dest; this.left = left; this.right = right;
        }
        @Override public String toString() { return "r"+dest+" = add_i64 r"+left+", r"+right; }
    }

    public static final class PrintInt64Triple extends MirInstruction {
        public final int a;
        public final int b;
        public final int c;
        public PrintInt64Triple(int a, int b, int c) { this.a=a; this.b=b; this.c=c; }
        @Override public String toString() { return "print_i64_triplet r"+a+", r"+b+", r"+c; }
    }

    public static final class CallVoid extends MirInstruction {
        public final String callee;
        public final int[] args;
        public CallVoid(String callee, int[] args) {
            this.callee = callee;
            this.args = args == null ? new int[0] : args;
        }
        @Override public String toString() { return "call_void " + callee + "(" + Arrays.toString(args) + ")"; }
    }

    public static final class ReturnVoid extends MirInstruction {
        public ReturnVoid() {}
        @Override public String toString() { return "return_void"; }
    }
}
