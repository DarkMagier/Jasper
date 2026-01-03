package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

import java.util.List;

/**
 * 方法调用：a.f(...) / a?.f(...)
 */
public final class MethodCallExpr implements Expr {
    public final Expr target;
    public final Identifier method;
    public final List<Expr> args;
    /** 是否为安全调用（?.）。 */
    public final boolean isSafe;
    private final Span span;

    public MethodCallExpr(Expr target, Identifier method, List<Expr> args, boolean isSafe, Span span) {
        this.target = target;
        this.method = method;
        this.args = args;
        this.isSafe = isSafe;
        this.span = span;
    }

    @Override
    public Span span() {
        return span;
    }
}
