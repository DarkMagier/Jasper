package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

/**
 * 局部变量声明：var/const/pointer。
 *
 * 支持：
 * - 默认非空：T
 * - 可空：T?
 * - late：允许声明时不初始化（非空仍非空），读未初始化为运行时错误。
 */
public final class VarDeclStmt implements Stmt {
    public enum Kind {
        VAR,
        CONST,
        POINTER
    }

    public final Kind kind;
    public final boolean isLate;
    public final Identifier name;
    /** 可缺省：通过 initializer 推导（除 null 外）。 */
    public final TypeRef type;
    /** 可缺省：late var / 允许不初始化。 */
    public final Expr initializer;
    private final Span span;

    public VarDeclStmt(Kind kind, boolean isLate, Identifier name, TypeRef type, Expr initializer, Span span) {
        this.kind = kind;
        this.isLate = isLate;
        this.name = name;
        this.type = type;
        this.initializer = initializer;
        this.span = span;
    }

    @Override
    public Span span() {
        return span;
    }
}
