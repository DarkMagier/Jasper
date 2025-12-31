package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

public final class ExprStmt implements Stmt {
    public final Expr expr;
    public final Span span;

    public ExprStmt(Expr expr, Span span) {
        this.expr = expr;
        this.span = span;
    }

    @Override
    public Span span() {
        return span;
    }
}
