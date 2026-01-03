package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

/**
 * 赋值表达式：lhs = rhs。
 *
 * 本阶段仅支持最小子集：lhs 必须是 VarRefExpr。
 */
public final class AssignExpr implements Expr {
    public final VarRefExpr lhs;
    public final Expr rhs;
    private final Span span;

    public AssignExpr(VarRefExpr lhs, Expr rhs, Span span) {
        this.lhs = lhs;
        this.rhs = rhs;
        this.span = span;
    }

    @Override
    public Span span() {
        return span;
    }
}
