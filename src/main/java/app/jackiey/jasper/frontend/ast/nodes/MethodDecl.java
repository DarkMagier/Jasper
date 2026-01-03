package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

import java.util.Collections;
import java.util.List;

/**
 * 方法声明（目前仅支持 grammar 中的 function-style：
 *   function name(p1: T1, p2: T2): Ret { ... }
 * 或
 *   function name(...): Ret;
 *
 * 说明：
 * - 为满足“统一 lowering”目标，本轮只保留签名信息与 body 形态（block/empty）。
 * - 具体语句/表达式的完整 lowering 以后再扩展。
 */
public final class MethodDecl implements ClassMember {
    public final Identifier name;
    public final List<Param> params;
    /** 可为空：未写 return type 时表示 void/Unit 语义由后续 checker 决定 */
    public final TypeRef retType;
    /** body 是否为 block（否则为 ';'） */
    public final boolean hasBodyBlock;
    public final Span span;

    public MethodDecl(Identifier name, List<Param> params, TypeRef retType, boolean hasBodyBlock, Span span) {
        this.name = name;
        this.params = params == null ? Collections.<Param>emptyList() : Collections.unmodifiableList(params);
        this.retType = retType;
        this.hasBodyBlock = hasBodyBlock;
        this.span = span;
    }

    public static final class Param {
        public final Identifier name;
        public final TypeRef type;

        public Param(Identifier name, TypeRef type) {
            this.name = name;
            this.type = type;
        }
    }
}
