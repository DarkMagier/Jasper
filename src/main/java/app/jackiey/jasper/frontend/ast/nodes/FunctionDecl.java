package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

import java.util.Collections;
import java.util.List;

/**
 * 顶层 function 声明（最小版本）。
 *
 * day2 backend 仍然只“真正支持” demo：
 *   function foo(a:int64, b:int64) { print(a,b,a+b); }
 *
 * 但前端允许解析更多形态，并为后续类型系统/变量控制流分析预留字段。
 */
public final class FunctionDecl implements Item {
    public final Identifier name;
    public final List<Param> params;
    public final boolean bodyIsPrintFooPattern;
    public final Span span;

    // --- 新增（v0.0.04）：类型/约束/函数体 AST（可为空） ---
    /** 可选：function 的泛型参数，例如 <T, U>。 */
    public final TypeParameters typeParameters;
    /** 可选：where 子句（例如 where T is NonNull）。 */
    public final WhereClause whereClause;
    /** 可选：返回类型（若省略则为 null，表示由语义层推断或默认 Unit）。 */
    public final TypeRef returnType;
    /** 可选：方法体的语句块 AST（仅对 block body 有意义）。 */
    public final BlockStmt bodyAst;

    /**
     * 旧构造：保持 backend/demo 的兼容。
     */
    public FunctionDecl(Identifier name, List<Param> params, boolean bodyIsPrintFooPattern, Span span) {
        this(name, params, bodyIsPrintFooPattern, null, null, null, null, span);
    }

    public FunctionDecl(
            Identifier name,
            List<Param> params,
            boolean bodyIsPrintFooPattern,
            TypeParameters typeParameters,
            WhereClause whereClause,
            TypeRef returnType,
            BlockStmt bodyAst,
            Span span
    ) {
        this.name = name;
        this.params = params == null ? Collections.<Param>emptyList() : Collections.unmodifiableList(params);
        this.bodyIsPrintFooPattern = bodyIsPrintFooPattern;
        this.typeParameters = typeParameters;
        this.whereClause = whereClause;
        this.returnType = returnType;
        this.bodyAst = bodyAst;
        this.span = span;
    }

    public static final class Param {
        public final String name;
        /**
         * 旧字段：用于 day2 backend 的 demo 校验（today: "int64"）。
         *
         * 注意：这是“源码文本”的直出（语法层），不是类型系统内部表示。
         */
        public final String typeName;

        /** 新字段：结构化类型 AST。 */
        public final TypeRef type;

        public Param(String name, String typeName) {
            this(name, typeName, null);
        }

        public Param(String name, String typeName, TypeRef type) {
            this.name = name;
            this.typeName = typeName;
            this.type = type;
        }
    }
}
