package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

import java.util.Collections;
import java.util.List;

public final class CallExpr implements Expr {
    public final Identifier callee;
    public final List<Expr> args;
    public final Span span;

    public CallExpr(Identifier callee, List<Expr> args, Span span) {
        this.callee = callee;
        this.args = (args == null) ? Collections.<Expr>emptyList() : Collections.unmodifiableList(args);
        this.span = span;
    }

    @Override
    public Span span() {
        return span;
    }
}
