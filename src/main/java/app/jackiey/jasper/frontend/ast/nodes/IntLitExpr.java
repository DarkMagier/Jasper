package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

public final class IntLitExpr implements Expr {
    public final long value;
    public final Span span;

    public IntLitExpr(long value, Span span) {
        this.value = value;
        this.span = span;
    }

    @Override
    public Span span() {
        return span;
    }
}
