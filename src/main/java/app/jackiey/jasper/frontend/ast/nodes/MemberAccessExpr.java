package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

/**
 * 成员访问：a.b / a?.b
 */
public final class MemberAccessExpr implements Expr {
    public final Expr target;
    public final Identifier member;
    /** 是否为安全访问（?.）。 */
    public final boolean isSafe;
    private final Span span;

    public MemberAccessExpr(Expr target, Identifier member, boolean isSafe, Span span) {
        this.target = target;
        this.member = member;
        this.isSafe = isSafe;
        this.span = span;
    }

    @Override
    public Span span() {
        return span;
    }
}
