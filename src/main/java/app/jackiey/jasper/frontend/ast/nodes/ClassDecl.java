package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

import java.util.Collections;
import java.util.List;

/**
 * class 声明（最小 AST 版本）。
 *
 * 支持：
 * - class Name [implements I1, I2] { field...; function method(...); }
 *
 * 说明：
 * - grammar 还支持 extends/superclass、泛型等，本轮保留实现接口列表与成员列表。
 */
public final class ClassDecl implements Item {
    public final Identifier name;
    public final List<TypeRef> implementsTypes;
    public final List<ClassMember> members;
    public final Span span;

    public ClassDecl(Identifier name, List<TypeRef> implementsTypes, List<ClassMember> members, Span span) {
        this.name = name;
        this.implementsTypes = implementsTypes == null ? Collections.<TypeRef>emptyList() : Collections.unmodifiableList(implementsTypes);
        this.members = members == null ? Collections.<ClassMember>emptyList() : Collections.unmodifiableList(members);
        this.span = span;
    }
}
