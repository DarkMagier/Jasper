package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

/**
 * null 字面量。
 *
 * 说明：语言核心只保留 null（二态）。
 */
public final class NullLitExpr implements Expr {
    private final Span span;

    public NullLitExpr(Span span) {
        this.span = span;
    }

    @Override
    public Span span() {
        return span;
    }
}
