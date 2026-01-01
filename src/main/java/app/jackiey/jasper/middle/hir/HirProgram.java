package app.jackiey.jasper.middle.hir;

/**
 * HIR program for the demo:
 * - contains foo declaration
 * - contains entry call (foo(callA, callB))
 */
public final class HirProgram {
    public final HirFunction foo;
    public final long callA;
    public final long callB;

    public HirProgram(HirFunction foo, long callA, long callB) {
        this.foo = foo;
        this.callA = callA;
        this.callB = callB;
    }
}
