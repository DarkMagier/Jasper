package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

/**
 * 字段声明（支持 Var/Const/Pointer）。
 *
 * 注意：
 * - 语法层 fieldDeclaration 支持一行声明多个 varDeclarator：
 *     var a:int = 1, b:int = 2;
 *   ASTBuilder 会拆成多个 FieldDecl，便于后续 lowering。
 */
public final class FieldDecl implements ClassMember {
    public enum Kind {
        VAR,
        CONST,
        POINTER
    }

    public final Kind kind;
    public final Identifier name;
    /** 可为空：允许类型推导的写法 var x = 1; */
    public final TypeRef type;
    public final Span span;

    public FieldDecl(Kind kind, Identifier name, TypeRef type, Span span) {
        this.kind = kind;
        this.name = name;
        this.type = type;
        this.span = span;
    }
}
