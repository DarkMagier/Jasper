package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

/**
 * 非空断言：x!
 *
 * 语义：运行时断言 x != null；失败则抛错。
 */
public final class NotNullAssertExpr implements Expr {
    public final Expr base;
    private final Span span;

    public NotNullAssertExpr(Expr base, Span span) {
        this.base = base;
        this.span = span;
    }

    @Override
    public Span span() {
        return span;
    }
}
