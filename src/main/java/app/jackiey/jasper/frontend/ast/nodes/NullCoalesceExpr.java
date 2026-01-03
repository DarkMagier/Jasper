package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

/**
 * 空合并：x ?? y。
 *
 * 语义：若 x 为 null，则返回 y；否则返回 x（短路）。
 */
public final class NullCoalesceExpr implements Expr {
    public final Expr left;
    public final Expr right;
    private final Span span;

    public NullCoalesceExpr(Expr left, Expr right, Span span) {
        this.left = left;
        this.right = right;
        this.span = span;
    }

    @Override
    public Span span() {
        return span;
    }
}
