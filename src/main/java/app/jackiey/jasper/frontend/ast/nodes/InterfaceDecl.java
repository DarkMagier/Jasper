package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

import java.util.Collections;
import java.util.List;

/**
 * interface 声明（最小 AST 版本）。
 *
 * 支持：
 * - interface I { function f(x: int64): int64; }
 *
 * 说明：
 * - 接口成员在语法上非常丰富（常量、属性、嵌套类型等），本轮只收敛到 methodDeclaration(Function-style)。
 */
public final class InterfaceDecl implements Item {
    public final Identifier name;
    /** interface 的泛型参数（可能为空） */
    public final TypeParameters typeParameters;
    /** interface extends 列表（可能为空） */
    public final List<TypeRef> extendsTypes;
    public final List<MethodDecl> methods;
    public final Span span;

    public InterfaceDecl(Identifier name, TypeParameters typeParameters, List<TypeRef> extendsTypes, List<MethodDecl> methods, Span span) {
        this.name = name;
        this.typeParameters = typeParameters;
        this.extendsTypes = extendsTypes == null ? Collections.<TypeRef>emptyList() : Collections.unmodifiableList(extendsTypes);
        this.methods = methods == null ? Collections.<MethodDecl>emptyList() : Collections.unmodifiableList(methods);
        this.span = span;
    }
}
