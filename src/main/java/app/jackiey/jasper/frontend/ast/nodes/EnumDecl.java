package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

import java.util.Collections;
import java.util.List;

/**
 * enum 声明（结构化 AST）。
 *
 * 对应 grammar: enumDeclaration
 *   mods=modifier* Enum name=Identifier sis=superinterfaces? body=enumBody
 *
 * 本阶段语义仍然是 demo 级：
 * - 只抽取：名称、implements(superinterfaces)、常量列表、以及 ';' 后的 body declarations（classBodyDeclaration*）。
 * - enumConstant 的 arguments/classBody 仅记录“是否存在”，不深入展开。
 */
public final class EnumDecl implements Item, ClassMember {
    public final Identifier name;
    public final List<TypeRef> implementsTypes;
    public final List<EnumConstant> constants;
    /** enumBodyDeclarations: ';' classBodyDeclaration* */
    public final List<ClassMember> bodyMembers;
    public final Span span;

    public EnumDecl(Identifier name,
                    List<TypeRef> implementsTypes,
                    List<EnumConstant> constants,
                    List<ClassMember> bodyMembers,
                    Span span) {
        this.name = name;
        this.implementsTypes = implementsTypes == null ? Collections.<TypeRef>emptyList() : Collections.unmodifiableList(implementsTypes);
        this.constants = constants == null ? Collections.<EnumConstant>emptyList() : Collections.unmodifiableList(constants);
        this.bodyMembers = bodyMembers == null ? Collections.<ClassMember>emptyList() : Collections.unmodifiableList(bodyMembers);
        this.span = span;
    }

    public static final class EnumConstant {
        public final Identifier name;
        public final boolean hasArgs;
        public final boolean hasClassBody;

        public EnumConstant(Identifier name, boolean hasArgs, boolean hasClassBody) {
            this.name = name;
            this.hasArgs = hasArgs;
            this.hasClassBody = hasClassBody;
        }
    }
}
