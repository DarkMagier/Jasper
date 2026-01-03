package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

/**
 * 单条 where 约束：T is NonNull。
 */
public final class WhereConstraint {
    public final Identifier typeParam;
    public final Identifier constraint;
    public final Span span;

    public WhereConstraint(Identifier typeParam, Identifier constraint, Span span) {
        this.typeParam = typeParam;
        this.constraint = constraint;
        this.span = span;
    }
}
