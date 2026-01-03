package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

/**
 * 变量/名字引用表达式。
 *
 * 说明：
 * - 目前仅用于支持 print(a,b,a+b) 模式检查，以及最小化表达式树的单元测试。
 */
public final class VarRefExpr implements Expr {
    public final Identifier name;
    private final Span span;

    public VarRefExpr(Identifier name, Span span) {
        this.name = name;
        this.span = span;
    }

    @Override
    public Span span() {
        return span;
    }
}
