package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

/**
 * 类型引用（最小 AST 版本）。
 *
 * 约束说明（非常重要）：
 * - ASTBuilder 必须基于 ANTLR Visitor 从解析树构建 AST。
 * - typeExpr 在语法上非常丰富（泛型、数组、nullable 等），本轮先保留“原文本 + Span”。
 * - text 直接来自对应的 parse tree 节点（例如 ctx.typeExpr().getText()），
 *   这仍然是 parser 输出的 token 串，不是手写扫描/二次解析。
 */
public final class TypeRef {
    /** 例如：int64 / String / List<Int32>[]? */
    public final String text;
    public final Span span;

    public TypeRef(String text, Span span) {
        this.text = text;
        this.span = span;
    }
}
