package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

/**
 * 类型引用（结构化 AST 版本）。
 *
 * 关键约束：
 * - ASTBuilder 必须基于 ANTLR Visitor/parse tree 构建结构化 AST。
 * - 禁止对 ctx.getText() 做 split/regex 来“模拟类型解析”。
 *
 * 说明：
 * - TypeRef 对应 grammar 的 typeExpr（支持 union：A | B）。
 * - 每个 union 分支是一个 TypePostfix（typeAtom + suffix + qualifier）。
 */
public final class TypeRef {
    public final TypeExpr expr;
    public final Span span;

    public TypeRef(TypeExpr expr, Span span) {
        this.expr = expr;
        this.span = span;
    }

    /**
     * 以“接近源码”的形式重建一个文本（用于调试/后端 name mangle）。
     *
     * 注意：
     * - 这里是从结构化节点拼回字符串，不涉及二次解析。
     */
    public String toDebugString() {
        return expr == null ? "<null>" : expr.toDebugString();
    }
}
