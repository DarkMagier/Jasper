package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

/**
 * 二元表达式（最小版本）。
 *
 * 目前只在两处用到：
 * - 支持解析/构建 a + b 这样的表达式。
 * - 用于 function foo 的 body 模式检查：print(a,b,a+b)。
 */
public final class BinaryExpr implements Expr {
    public enum Op {
        ADD,
        SUB,
        EQ,
        NE
    }

    public final Expr left;
    public final Expr right;
    public final Op op;
    private final Span span;

    public BinaryExpr(Expr left, Op op, Expr right, Span span) {
        this.left = left;
        this.op = op;
        this.right = right;
        this.span = span;
    }

    @Override
    public Span span() {
        return span;
    }
}
