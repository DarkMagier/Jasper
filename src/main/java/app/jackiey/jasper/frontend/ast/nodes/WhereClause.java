package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

import java.util.List;

/**
 * 泛型 where 子句：where T is NonNull, ...
 *
 * 说明：本阶段仅建模 AST，不做复杂约束系统。
 */
public final class WhereClause {
    public final List<WhereConstraint> constraints;
    public final Span span;

    public WhereClause(List<WhereConstraint> constraints, Span span) {
        this.constraints = constraints;
        this.span = span;
    }
}
