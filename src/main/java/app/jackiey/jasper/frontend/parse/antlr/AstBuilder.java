package app.jackiey.jasper.frontend.parse.antlr;

import app.jackiey.jasper.frontend.ast.nodes.*;
import app.jackiey.jasper.frontend.ast.span.Pos;
import app.jackiey.jasper.frontend.ast.span.Span;
import app.jackiey.jasper.frontend.diag.DiagnosticSink;
import app.jackiey.jasper.frontend.diag.ErrorCode;
import gen.antlr.jasper.JasperParser;
import gen.antlr.jasper.JasperParserBaseVisitor;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 从 ANTLR 解析树构建最小 AST。
 *
 * 重要约束（与用户要求对齐）：
 * - ASTBuilder 必须走 Visitor → AST，不允许通过 split/regex/拼 token 字符串模拟 AST。
 * - 本工程的 grammar 非常完整，但本阶段 lowering 只需要一小部分能力：
 *   1) 顶层：function foo(...) { print(a,b,a+b); } + 顶层 foo(1,2) 调用（兼容 day2 demo）
 *   2) 顶层：class/interface 的声明结构（用于本轮新增语法）
 * - 不在支持子集内的结构，统一通过 diag 报 UNSUPPORTED_SYNTAX。
 */
public final class AstBuilder {
    private final CommonTokenStream tokens;
    private final DiagnosticSink diag;

    public AstBuilder(CommonTokenStream tokens, DiagnosticSink diag) {
        this.tokens = tokens;
        this.diag = diag;
    }

    public Program build(JasperParser.SourceFileContext file) {
        BuildVisitor v = new BuildVisitor();
        List<Item> items = new ArrayList<>();

        for (JasperParser.TopLevelItemContext it : file.topLevelItem()) {
            Object o = v.visit(it);
            if (o == null) continue;
            if (o instanceof Item) {
                items.add((Item) o);
            } else {
                // 顶层一定应该收敛为 Item；否则视为内部错误
                diag.error(ErrorCode.INTERNAL_ERROR, "Top level visitor returned non-Item: " + o.getClass().getName(), span(it));
            }
        }

        return new Program(items);
    }

    /**
     * 单一 Visitor：不同 rule 返回不同 Java 类型。
     * - 顶层：返回 Item
     * - class 成员 fieldDeclaration：返回 List<FieldDecl>
     * - methodDeclaration(function-style)：返回 MethodDecl
     * - expression：返回 Expr
     */
    private final class BuildVisitor extends JasperParserBaseVisitor<Object> {

        // ===========================
        // 顶层入口
        // ===========================

        @Override
        public Object visitTopLevelDeclarationItem(JasperParser.TopLevelDeclarationItemContext ctx) {
            return visit(ctx.topLevelDecl());
        }

        @Override
        public Object visitTopLevelStatementItem(JasperParser.TopLevelStatementItemContext ctx) {
            // 只支持顶层 expression statement，并且 expression 必须是 call（兼容 day2 demo）
            JasperParser.StatementContext st = ctx.statement();
            if (!(st instanceof JasperParser.StatementExpressionStatementContext)) {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "only top-level expression statement is supported", span(st));
                return null;
            }

            JasperParser.ExpressionStatementContext est = ((JasperParser.StatementExpressionStatementContext) st).expressionStatement();
            JasperParser.StatementExpressionContext sex = est.statementExpression();
            if (!(sex instanceof JasperParser.StatementExpressionAnyContext)) {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "only simple expression is supported at top-level", span(sex));
                return null;
            }

            Expr e = (Expr) visit(((JasperParser.StatementExpressionAnyContext) sex).expression());
            if (!(e instanceof CallExpr)) {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "top-level statement must be a call expression", span(sex));
                return null;
            }
            return new StmtItem(new ExprStmt(e, e.span()));
        }

        @Override
        public Object visitTopDeclarationFunction(JasperParser.TopDeclarationFunctionContext ctx) {
            // v0.0.04：保留原有最小 lowering 所需字段，同时把更多语法信息接入 AST。
            Identifier name = new Identifier(ctx.name.getText(), spanFromToken(ctx.name));

            TypeParameters tparams = ctx.tparams != null ? buildTypeParameters(ctx.tparams) : null;
            WhereClause whereClause = ctx.where != null ? buildWhereClause(ctx.where) : null;
            TypeRef returnType = ctx.ret != null ? buildTypeRef(ctx.ret.typeExpr()) : null;

            List<FunctionDecl.Param> params = new ArrayList<>();
            for (JasperParser.TypedBindingContext p : ctx.params) {
                String pn = p.Identifier().getText();
                String tyName = p.typeExpr().getText();
                TypeRef ty = buildTypeRef(p.typeExpr());
                params.add(new FunctionDecl.Param(pn, tyName, ty));
            }

            BlockStmt bodyAst = null;
            if (ctx.body instanceof JasperParser.MethodBodyBlockContext) {
                JasperParser.BlockContext block = ((JasperParser.MethodBodyBlockContext) ctx.body).block();
                bodyAst = (BlockStmt) visit(block);
            }

            boolean patternOk = isPrintFooPattern(ctx.body, params);
            return new FunctionDecl(name, params, patternOk, tparams, whereClause, returnType, bodyAst, span(ctx));
        }

        @Override
        public Object visitTopDeclarationClass(JasperParser.TopDeclarationClassContext ctx) {
            if (ctx.normalClassDeclaration() != null) {
                return visit(ctx.normalClassDeclaration());
            }
            if (ctx.enumDeclaration() != null) {
                return visit(ctx.enumDeclaration());
            }
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "unknown top-level class-like declaration", span(ctx));
            return null;
        }

        @Override
        public Object visitTopDeclarationInterface(JasperParser.TopDeclarationInterfaceContext ctx) {
            if (ctx.normalInterfaceDeclaration() != null) {
                return visit(ctx.normalInterfaceDeclaration());
            }
            // annotationType 暂不支持
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "annotation type not supported yet", span(ctx));
            return null;
        }

        @Override
        public Object visitTopDeclarationEmptyDeclaration(JasperParser.TopDeclarationEmptyDeclarationContext ctx) {
            // 忽略顶层空声明 ';'
            return null;
        }

        @Override
        public Object visitTopDeclarationVariable(JasperParser.TopDeclarationVariableContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "top-level variable declaration not supported yet", span(ctx));
            return null;
        }

        // ===========================
        // class / interface
        // ===========================

        @Override
        public Object visitNormalClassDeclaration(JasperParser.NormalClassDeclarationContext ctx) {
            Identifier name = new Identifier(ctx.name.getText(), spanFromToken(ctx.name));

            TypeParameters tparams = null;
            if (ctx.tparams != null) {
                tparams = (TypeParameters) visit(ctx.tparams);
            }

            List<TypeRef> impls = new ArrayList<>();
            if (ctx.sis != null) {
                // superinterfaces: Implements typePostfix (',' typePostfix)* ','?
                for (JasperParser.TypePostfixContext t : ctx.sis.typePostfix()) {
                    impls.add(buildTypeRefFromPostfix(t));
                }
            }

            List<ClassMember> members = new ArrayList<>();
            for (JasperParser.ClassBodyDeclarationContext d : ctx.body.classBodyDeclaration()) {
                if (d instanceof JasperParser.MemberFieldContext) {
                    JasperParser.FieldDeclarationContext fd = ((JasperParser.MemberFieldContext) d).decl;
                    @SuppressWarnings("unchecked")
                    List<FieldDecl> fields = (List<FieldDecl>) visit(fd);
                    members.addAll(fields);
                } else if (d instanceof JasperParser.MemberMethodContext) {
                    JasperParser.MethodDeclarationContext md = ((JasperParser.MemberMethodContext) d).decl;
                    Object m = visit(md);
                    if (m instanceof MethodDecl) {
                        members.add((MethodDecl) m);
                    } else if (m != null) {
                        diag.error(ErrorCode.INTERNAL_ERROR, "method visitor returned unexpected type", span(md));
                    }
                } else if (d instanceof JasperParser.MemberEmptyContext) {
                    // ignore
                } else if (d instanceof JasperParser.MemberEnumContext) {
                    JasperParser.EnumDeclarationContext ed = ((JasperParser.MemberEnumContext) d).decl;
                    Object e = visit(ed);
                    if (e instanceof EnumDecl) {
                        members.add((EnumDecl) e);
                    } else if (e != null) {
                        diag.error(ErrorCode.INTERNAL_ERROR, "enum visitor returned unexpected type", span(ed));
                    }
                } else {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "unsupported class member (only field/method supported in this stage)", span(d));
                }
            }

            return new ClassDecl(name, tparams, impls, members, span(ctx));
        }

        @Override
        public Object visitNormalInterfaceDeclaration(JasperParser.NormalInterfaceDeclarationContext ctx) {
            Identifier name = new Identifier(ctx.name.getText(), spanFromToken(ctx.name));

            TypeParameters tparams = null;
            if (ctx.tparams != null) {
                tparams = (TypeParameters) visit(ctx.tparams);
            }

            List<TypeRef> exts = new ArrayList<>();
            if (ctx.exts != null) {
                for (JasperParser.TypePostfixContext t : ctx.exts.typePostfix()) {
                    exts.add(buildTypeRefFromPostfix(t));
                }
            }

            List<MethodDecl> methods = new ArrayList<>();
            for (JasperParser.InterfaceMemberDeclarationContext d : ctx.body.interfaceMemberDeclaration()) {
                if (d instanceof JasperParser.InterfaceMemberMethodContext) {
                    JasperParser.MethodDeclarationContext md = ((JasperParser.InterfaceMemberMethodContext) d).decl;
                    Object m = visit(md);
                    if (m instanceof MethodDecl) {
                        methods.add((MethodDecl) m);
                    } else if (m != null) {
                        diag.error(ErrorCode.INTERNAL_ERROR, "method visitor returned unexpected type", span(md));
                    }
                } else if (d instanceof JasperParser.InterfaceMemberEmptyContext) {
                    // ignore
                } else if (d instanceof JasperParser.InterfaceMemberEnumContext) {
                    JasperParser.EnumDeclarationContext ed = ((JasperParser.InterfaceMemberEnumContext) d).decl;
                    // 允许接口内嵌 enum（Java 类似写法）
                    Object e = visit(ed);
                    if (e instanceof EnumDecl) {
                        // interface 目前只保存方法列表，为简化：暂不挂载到 methods 中。
                        // 若未来需要，可扩展 InterfaceDecl 增加 members 列表。
                    } else if (e != null) {
                        diag.error(ErrorCode.INTERNAL_ERROR, "enum visitor returned unexpected type", span(ed));
                    }
                } else {
                    // 其他接口成员（常量、抽象方法 header、属性等）本轮不做
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "unsupported interface member (only function-style methodDeclaration supported)", span(d));
                }
            }

            return new InterfaceDecl(name, tparams, exts, methods, span(ctx));
        }

        @Override
        public Object visitFieldDeclaration(JasperParser.FieldDeclarationContext ctx) {
            FieldDecl.Kind kind;
            String k = ctx.kind.getText();
            if ("var".equals(k)) kind = FieldDecl.Kind.VAR;
            else if ("const".equals(k)) kind = FieldDecl.Kind.CONST;
            else kind = FieldDecl.Kind.POINTER;

            List<FieldDecl> out = new ArrayList<>();
            for (JasperParser.VarDeclaratorContext vd : ctx.decls) {
                JasperParser.MaybeTypedBindingContext b = vd.maybeTypedBinding();
                Identifier n = new Identifier(b.name.getText(), spanFromToken(b.name));
                TypeRef ty = null;
                if (b.typeRef != null) {
                    ty = buildTypeRef(b.typeRef);
                }
                out.add(new FieldDecl(kind, n, ty, span(vd)));
            }
            return out;
        }

        @Override
        public Object visitMethodDeclarationFunctionStyle(JasperParser.MethodDeclarationFunctionStyleContext ctx) {
            Identifier name = new Identifier(ctx.name.getText(), spanFromToken(ctx.name));

            List<MethodDecl.Param> params = new ArrayList<>();
            for (JasperParser.TypedBindingContext p : ctx.params) {
                Identifier pn = new Identifier(p.Identifier().getText(), spanFromToken(p.Identifier().getSymbol()));
                TypeRef ty = buildTypeRef(p.typeExpr());
                params.add(new MethodDecl.Param(pn, ty));
            }

            TypeRef ret = null;
            if (ctx.ret != null) {
                ret = buildTypeRef(ctx.ret.typeExpr());
            }

            boolean hasBlock = (ctx.body instanceof JasperParser.MethodBodyBlockContext);
            return new MethodDecl(name, params, ret, hasBlock, span(ctx));
        }

        @Override
        public Object visitMethodDeclarationJavaStyle(JasperParser.MethodDeclarationJavaStyleContext ctx) {
            // 本轮只支持 function-style（符合你给的测试要求）
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "java-style methodDeclaration not supported yet (use function-style)", span(ctx));
            return null;
        }

        // ===========================
        // enum
        // ===========================

        @Override
        public Object visitEnumDeclaration(JasperParser.EnumDeclarationContext ctx) {
            Identifier name = new Identifier(ctx.name.getText(), spanFromToken(ctx.name));

            List<TypeRef> impls = new ArrayList<>();
            if (ctx.sis != null) {
                for (JasperParser.TypePostfixContext t : ctx.sis.typePostfix()) {
                    impls.add(buildTypeRefFromPostfix(t));
                }
            }

            List<EnumDecl.EnumConstant> constants = new ArrayList<>();
            List<ClassMember> bodyMembers = new ArrayList<>();

            JasperParser.EnumBodyContext body = ctx.body;
            if (body != null) {
                if (body.enumConstant() != null) {
                    for (JasperParser.EnumConstantContext ec : body.enumConstant()) {
                        Object c = visit(ec);
                        if (c instanceof EnumDecl.EnumConstant) {
                            constants.add((EnumDecl.EnumConstant) c);
                        }
                    }
                }

                if (body.enumBodyDeclarations() != null) {
                    @SuppressWarnings("unchecked")
                    List<ClassMember> ms = (List<ClassMember>) visit(body.enumBodyDeclarations());
                    bodyMembers.addAll(ms);
                }
            }

            return new EnumDecl(name, impls, constants, bodyMembers, span(ctx));
        }

        @Override
        public Object visitEnumConstant(JasperParser.EnumConstantContext ctx) {
            // modifier* Identifier arguments? classBody?
            Identifier name = new Identifier(ctx.Identifier().getText(), spanFromToken(ctx.Identifier().getSymbol()));
            boolean hasArgs = ctx.arguments() != null;
            boolean hasBody = ctx.classBody() != null;
            return new EnumDecl.EnumConstant(name, hasArgs, hasBody);
        }

        @Override
        public Object visitEnumBodyDeclarations(JasperParser.EnumBodyDeclarationsContext ctx) {
            // ';' classBodyDeclaration*
            List<ClassMember> members = new ArrayList<>();
            for (JasperParser.ClassBodyDeclarationContext d : ctx.classBodyDeclaration()) {
                if (d instanceof JasperParser.MemberFieldContext) {
                    JasperParser.FieldDeclarationContext fd = ((JasperParser.MemberFieldContext) d).decl;
                    @SuppressWarnings("unchecked")
                    List<FieldDecl> fields = (List<FieldDecl>) visit(fd);
                    members.addAll(fields);
                } else if (d instanceof JasperParser.MemberMethodContext) {
                    JasperParser.MethodDeclarationContext md = ((JasperParser.MemberMethodContext) d).decl;
                    Object m = visit(md);
                    if (m instanceof MethodDecl) {
                        members.add((MethodDecl) m);
                    }
                } else if (d instanceof JasperParser.MemberEnumContext) {
                    JasperParser.EnumDeclarationContext ed = ((JasperParser.MemberEnumContext) d).decl;
                    Object e = visit(ed);
                    if (e instanceof EnumDecl) {
                        members.add((EnumDecl) e);
                    }
                } else if (d instanceof JasperParser.MemberEmptyContext) {
                    // ignore
                } else {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "unsupported enum body member", span(d));
                }
            }
            return members;
        }

        // ===========================
        // types (泛型/类型参数/类型实参)
        // ===========================

        private TypeRef buildTypeRef(JasperParser.TypeExprContext ctx) {
            TypeExpr e = (TypeExpr) visit(ctx);
            return new TypeRef(e, span(ctx));
        }

        private TypeRef buildTypeRefFromPostfix(JasperParser.TypePostfixContext ctx) {
            TypePostfix p = (TypePostfix) visit(ctx);
            return new TypeRef(new TypeExpr(java.util.Arrays.asList(p)), span(ctx));
        }

        /**
         * v0.0.04：函数/类/接口的泛型参数入口。
         *
         * 说明：这只是一个薄包装，底层仍然... a real TypeParameters AST.
         */
        private TypeParameters buildTypeParameters(JasperParser.TypeParametersContext ctx) {
            return (TypeParameters) visit(ctx);
        }

        /**
         * v0.0.04：where 子句入口：where T is NonNull, ...
         */
        private WhereClause buildWhereClause(JasperParser.WhereClauseContext ctx) {
            return (WhereClause) visit(ctx);
        }

        @Override
        public Object visitTypeExpression(JasperParser.TypeExpressionContext ctx) {
            List<TypePostfix> alts = new ArrayList<>();
            for (JasperParser.TypePostfixContext p : ctx.typePostfix()) {
                alts.add((TypePostfix) visit(p));
            }
            return new TypeExpr(alts);
        }

        @Override
        public Object visitTypePostfix(JasperParser.TypePostfixContext ctx) {
            TypeAtom atom = (TypeAtom) visit(ctx.typeAtom());
            List<TypeSuffix> suffixes = new ArrayList<>();
            for (JasperParser.TypeSuffixContext s : ctx.typeSuffix()) {
                suffixes.add((TypeSuffix) visit(s));
            }
            List<TypeQualifierKind> qs = new ArrayList<>();
            for (JasperParser.TypeQualifierContext q : ctx.typeQualifier()) {
                qs.add((TypeQualifierKind) visit(q));
            }
            return new TypePostfix(atom, suffixes, qs);
        }

        @Override
        public Object visitTypeAtomNode(JasperParser.TypeAtomNodeContext ctx) {
            String prefix = null;
            if (ctx.typePrefix() != null) {
                prefix = ctx.typePrefix().getText();
            }
            List<String> sms = new ArrayList<>();
            for (JasperParser.TypeSoftModifierContext sm : ctx.typeSoftModifier()) {
                sms.add(sm.getText());
            }
            TypeAtomBase base = (TypeAtomBase) visit(ctx.typeAtomBase());
            return new TypeAtom(prefix, sms, base);
        }

        @Override
        public Object visitTypeAtomNodePrimitive(JasperParser.TypeAtomNodePrimitiveContext ctx) {
            return new TypeAtomBase.Primitive(ctx.primitiveType().getText());
        }

        @Override
        public Object visitTypeAtomNodeString(JasperParser.TypeAtomNodeStringContext ctx) {
            return new TypeAtomBase.Primitive("String");
        }

        @Override
        public Object visitTypeAtomNodeBytes(JasperParser.TypeAtomNodeBytesContext ctx) {
            return new TypeAtomBase.Primitive("Bytes");
        }

        @Override
        public Object visitTypeAtomNodeRegex(JasperParser.TypeAtomNodeRegexContext ctx) {
            return new TypeAtomBase.Primitive("Regex");
        }

        @Override
        public Object visitTypeAtomNodeAny(JasperParser.TypeAtomNodeAnyContext ctx) {
            return new TypeAtomBase.Primitive("Any");
        }

        @Override
        public Object visitTypeAtomNodeUnit(JasperParser.TypeAtomNodeUnitContext ctx) {
            return new TypeAtomBase.Primitive("Unit");
        }

        @Override
        public Object visitTypeAtomNodeGroup(JasperParser.TypeAtomNodeGroupContext ctx) {
            return new TypeAtomBase.Group((TypeExpr) visit(ctx.typeExpr()));
        }

        @Override
        public Object visitTypeAtomNodeTuple(JasperParser.TypeAtomNodeTupleContext ctx) {
            List<TypeExpr> elems = new ArrayList<>();
            for (JasperParser.TypeExprContext t : ctx.typeExpr()) {
                elems.add((TypeExpr) visit(t));
            }
            return new TypeAtomBase.Tuple(elems);
        }

        @Override
        public Object visitTypeAtomNodeIdentifier(JasperParser.TypeAtomNodeIdentifierContext ctx) {
            TypeArguments args = null;
            if (ctx.typeArguments() != null) {
                args = (TypeArguments) visit(ctx.typeArguments());
            }
            return new TypeAtomBase.Identifier(ctx.Identifier().getText(), args);
        }

        @Override
        public Object visitTypeSuffixDot(JasperParser.TypeSuffixDotContext ctx) {
            TypeArguments args = null;
            if (ctx.typeArguments() != null) {
                args = (TypeArguments) visit(ctx.typeArguments());
            }
            return new TypeSuffix.Dot(ctx.Identifier().getText(), args);
        }

        @Override
        public Object visitTypeSuffixArray(JasperParser.TypeSuffixArrayContext ctx) {
            return new TypeSuffix.Array();
        }

        @Override
        public Object visitTypeQualNullCoalesceToken(JasperParser.TypeQualNullCoalesceTokenContext ctx) {
            return TypeQualifierKind.NULL_COALESCE;
        }

        @Override
        public Object visitTypeQualNullCoalesceSplit(JasperParser.TypeQualNullCoalesceSplitContext ctx) {
            return TypeQualifierKind.NULL_COALESCE;
        }

        @Override
        public Object visitTypeQualNullable(JasperParser.TypeQualNullableContext ctx) {
            return TypeQualifierKind.NULLABLE;
        }

        @Override
        public Object visitTypeQualNonNull(JasperParser.TypeQualNonNullContext ctx) {
            return TypeQualifierKind.NON_NULL;
        }

        @Override
        public Object visitTypeArguments(JasperParser.TypeArgumentsContext ctx) {
            List<TypeArgument> args = new ArrayList<>();
            for (JasperParser.TypeArgumentContext a : ctx.typeArgument()) {
                args.add((TypeArgument) visit(a));
            }
            return new TypeArguments(args);
        }

        @Override
        public Object visitTypeArgumentType(JasperParser.TypeArgumentTypeContext ctx) {
            return new TypeArgument.Type((TypeExpr) visit(ctx.typeExpr()));
        }

        @Override
        public Object visitTypeArgumentWildcard(JasperParser.TypeArgumentWildcardContext ctx) {
            return new TypeArgument.Wildcard((WildcardType) visit(ctx.wildcard()));
        }

        @Override
        public Object visitTypeWildcard(JasperParser.TypeWildcardContext ctx) {
            // '?' ((Extends|Super) typeExpr)?
            if (ctx.typeExpr() == null) {
                return new WildcardType(null, null);
            }
            String kw = ctx.getChild(1).getText();
            WildcardType.BoundKind bk = "extends".equals(kw) ? WildcardType.BoundKind.EXTENDS : WildcardType.BoundKind.SUPER;
            return new WildcardType(bk, (TypeExpr) visit(ctx.typeExpr()));
        }

        @Override
        public Object visitTypeParameters(JasperParser.TypeParametersContext ctx) {
            List<TypeParameter> ps = new ArrayList<>();
            for (JasperParser.TypeParameterContext p : ctx.typeParameter()) {
                ps.add((TypeParameter) visit(p));
            }
            return new TypeParameters(ps);
        }

        @Override
        public Object visitTypeParam(JasperParser.TypeParamContext ctx) {
            TypeBound b = null;
            if (ctx.typeBound() != null) {
                b = (TypeBound) visit(ctx.typeBound());
            }
            return new TypeParameter(ctx.Identifier().getText(), b);
        }

        @Override
        public Object visitTypeBoundAlternative(JasperParser.TypeBoundAlternativeContext ctx) {
            String kw = ctx.getChild(0).getText();
            TypeBound.Kind k = "extends".equals(kw) ? TypeBound.Kind.EXTENDS : TypeBound.Kind.SUPER;
            List<TypeExpr> bounds = new ArrayList<>();
            for (JasperParser.TypeExprContext t : ctx.typeExpr()) {
                bounds.add((TypeExpr) visit(t));
            }
            return new TypeBound(k, bounds);
        }

// ---------------------------
// v0.0.04：where 子句（where T is NonNull, ...）
// ---------------------------

@Override
public Object visitWhereClause(JasperParser.WhereClauseContext ctx) {
    List<WhereConstraint> cs = new ArrayList<>();
    for (JasperParser.WhereConstraintContext c : ctx.whereConstraint()) {
        cs.add((WhereConstraint) visit(c));
    }
    return new WhereClause(cs, span(ctx));
}

@Override
public Object visitWhereConstraint(JasperParser.WhereConstraintContext ctx) {
    Identifier tp = new Identifier(ctx.name.getText(), spanFromToken(ctx.name));
    Identifier cons = new Identifier(ctx.constraint.getText(), spanFromToken(ctx.constraint));
    return new WhereConstraint(tp, cons, span(ctx));
}

        // ===========================
        // statements / blocks (v0.0.04)
        // ===========================

        @Override
        public Object visitBlock(JasperParser.BlockContext ctx) {
            // block : '{' blockStatement* '}'
            List<Stmt> stmts = new ArrayList<>();
            for (JasperParser.BlockStatementContext bs : ctx.blockStatement()) {
                Object o = visit(bs);
                if (o == null) continue;
                if (o instanceof Stmt) {
                    stmts.add((Stmt) o);
                } else if (o instanceof List) {
                    @SuppressWarnings("unchecked")
                    List<Stmt> ss = (List<Stmt>) o;
                    stmts.addAll(ss);
                } else {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "unsupported block statement", span(bs));
                }
            }
            return new BlockStmt(stmts, span(ctx));
        }

        @Override
        public Object visitBlockStatementLocalVariable(JasperParser.BlockStatementLocalVariableContext ctx) {
            // localVariableDeclarationStatement -> localVariableDeclaration
            return visit(ctx.localVariableDeclarationStatement());
        }

        @Override
        public Object visitBlockStatementStatement(JasperParser.BlockStatementStatementContext ctx) {
            return visit(ctx.statement());
        }

        @Override
        public Object visitBlockStatementClassDeclaration(JasperParser.BlockStatementClassDeclarationContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "local class/enum declaration in block not supported in this stage", span(ctx));
            return null;
        }

        @Override
        public Object visitStatementBlock(JasperParser.StatementBlockContext ctx) {
            return visit(ctx.block());
        }

        @Override
        public Object visitStatementEmpty(JasperParser.StatementEmptyContext ctx) {
            // 空语句；忽略
            return null;
        }

        @Override
        public Object visitStatementExpressionStatement(JasperParser.StatementExpressionStatementContext ctx) {
            JasperParser.StatementExpressionContext sex = ctx.expressionStatement().statementExpression();
            if (!(sex instanceof JasperParser.StatementExpressionAnyContext)) {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "only simple expression statement supported in this stage", span(sex));
                return null;
            }
            Expr e = (Expr) visit(((JasperParser.StatementExpressionAnyContext) sex).expression());
            if (e == null) return null;
            return new ExprStmt(e, span(ctx));
        }

        @Override
        public Object visitStatementIf(JasperParser.StatementIfContext ctx) {
            return visit(ctx.ifStatement());
        }

        @Override
        public Object visitIfStatement(JasperParser.IfStatementContext ctx) {
            Expr cond = (Expr) visit(ctx.expression());
            BlockStmt thenBlk = (BlockStmt) visit(ctx.block());
            Stmt elseBranch = null;
            if (ctx.elseClause() != null) {
                elseBranch = (Stmt) visit(ctx.elseClause());
            }
            if (cond == null || thenBlk == null) return null;
            return new IfStmt(cond, thenBlk, elseBranch, span(ctx));
        }

        @Override
        public Object visitElseClause(JasperParser.ElseClauseContext ctx) {
            // Else (ifStatement | block)
            if (ctx.ifStatement() != null) {
                return visit(ctx.ifStatement());
            }
            if (ctx.block() != null) {
                return visit(ctx.block());
            }
            return null;
        }

        @Override
        public Object visitLocalVariableDeclarationStatement(JasperParser.LocalVariableDeclarationStatementContext ctx) {
            return visit(ctx.localVariableDeclaration());
        }

        @Override
        public Object visitLocalVariableDeclaration(JasperParser.LocalVariableDeclarationContext ctx) {
            boolean isLate = false;
            for (JasperParser.ModifierContext m : ctx.modifier()) {
                if (m.softLate() != null) {
                    isLate = true;
                }
            }

            VarDeclStmt.Kind kind;
            if (ctx.kind.getType() == JasperParser.Var) {
                kind = VarDeclStmt.Kind.VAR;
            } else if (ctx.kind.getType() == JasperParser.Const) {
                kind = VarDeclStmt.Kind.CONST;
            } else {
                kind = VarDeclStmt.Kind.POINTER;
            }

            List<Stmt> decls = new ArrayList<>();
            for (JasperParser.VarDeclaratorContext vd : ctx.decls) {
                JasperParser.MaybeTypedBindingContext b = vd.maybeTypedBinding();
                Identifier name = new Identifier(b.name.getText(), spanFromToken(b.name));

                TypeRef ty = null;
                if (b.typeRef != null) {
                    ty = buildTypeRef(b.typeRef);
                }

                Expr init = null;
                if (vd.expression() != null) {
                    init = (Expr) visit(vd.expression());
                }

                decls.add(new VarDeclStmt(kind, isLate, name, ty, init, span(vd)));
            }
            return decls;
        }

        // ===========================
        // expression 子集（用于：顶层 foo(1,2) 与 print(a,b,a+b) 模式检查）
        // ===========================

        @Override
        public Object visitExprLambda(JasperParser.ExprLambdaContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "lambda is not supported in this stage", span(ctx));
            return null;
        }
        
        @Override
        public Object visitExprAssignment(JasperParser.ExprAssignmentContext ctx) {
            return visit(ctx.assignmentExpression());
        }

        @Override
        public Object visitAssignExprConditional(JasperParser.AssignExprConditionalContext ctx) {
            return visit(ctx.conditionalExpression());
        }

        @Override
        public Object visitAssignExprAssignment(JasperParser.AssignExprAssignmentContext ctx) {
            // v0.0.04：仅支持最小赋值：Identifier '=' expression。
            JasperParser.AssignmentContext a = ctx.assignment();
            if (!(a.leftHandSide() instanceof JasperParser.LeftHandSideExpressionNameContext)) {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "only name assignment supported", span(ctx));
                return null;
            }
            JasperParser.LeftHandSideExpressionNameContext lhs = (JasperParser.LeftHandSideExpressionNameContext) a.leftHandSide();
            String qn = lhs.qualifiedName().getText();
            if (qn.indexOf('.') >= 0) {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "qualified assignment not supported yet: " + qn, span(ctx));
                return null;
            }
            // only '='
            if (!"=".equals(a.assignmentOperator().getText())) {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "only '=' assignment supported", span(ctx));
                return null;
            }
            Identifier id = new Identifier(qn, span(lhs));
            VarRefExpr l = new VarRefExpr(id, span(lhs));
            Expr rhs = (Expr) visit(a.expression());
            if (rhs == null) return null;
            return new AssignExpr(l, rhs, span(ctx));
        }
@Override
        public Object visitCondBinary(JasperParser.CondBinaryContext ctx) {
            // v0.0.04：conditionalExpression 的最底层现在是 nullFallbackExpression
            // - nullFallbackExpression: a else b 语法糖（等价于 (a) ?? b）
            // - nullCoalesceExpression: x ?? y
            return visit(ctx.nullFallbackExpression());
        }

@Override
        public Object visitCondTernary(JasperParser.CondTernaryContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "ternary is not supported in this stage", span(ctx));
            return null;
        }

        

        // ---------------------------
        // v0.0.04：空值相关表达式：?? 与 `else` 语法糖
        // ---------------------------

        @Override
        public Object visitNullFallbackExpression(JasperParser.NullFallbackExpressionContext ctx) {
            // nullFallbackExpression : nullCoalesceExpression (Else nullCoalesceExpression)?
            Expr left = (Expr) visit(ctx.nullCoalesceExpression(0));
            if (left == null) return null;
            if (ctx.Else() == null) {
                return left;
            }
            Expr right = (Expr) visit(ctx.nullCoalesceExpression(1));
            if (right == null) return null;
            // 语法糖：a else b  ≡ (a) ?? b
            return new NullCoalesceExpr(left, right, span(ctx));
        }

        @Override
        public Object visitNullCoalesceExpression(JasperParser.NullCoalesceExpressionContext ctx) {
            // nullCoalesceExpression : binaryExpression (NULL_COALESCE binaryExpression)*
            Expr cur = (Expr) visit(ctx.binaryExpression(0));
            if (cur == null) return null;
            for (int i = 1; i < ctx.binaryExpression().size(); i++) {
                Expr rhs = (Expr) visit(ctx.binaryExpression(i));
                if (rhs == null) return null;
                cur = new NullCoalesceExpr(cur, rhs, span(ctx));
            }
            return cur;
        }
@Override
        public Object visitBinaryUnary(JasperParser.BinaryUnaryContext ctx) {
            return visit(ctx.unaryExpression());
        }

        @Override
        public Object visitBinaryAddition(JasperParser.BinaryAdditionContext ctx) {
            Expr left = (Expr) visit(ctx.binaryExpression());
            Expr right = (Expr) visit(ctx.unaryExpression());
            if (left == null || right == null) return null;

            BinaryExpr.Op op = ctx.op.getType() == JasperParser.PLUS ? BinaryExpr.Op.ADD : BinaryExpr.Op.SUB;
            return new BinaryExpr(left, op, right, span(ctx));
        }

        @Override
        public Object visitBinaryMultiplication(JasperParser.BinaryMultiplicationContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "multiplication is not supported in this stage", span(ctx));
            return null;
        }

        @Override
        public Object visitBinaryShift(JasperParser.BinaryShiftContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "shift is not supported in this stage", span(ctx));
            return null;
        }

        @Override
        public Object visitBinaryRelational(JasperParser.BinaryRelationalContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "relational is not supported in this stage", span(ctx));
            return null;
        }

        @Override
        public Object visitBinaryEquality(JasperParser.BinaryEqualityContext ctx) {
            // v0.0.04：支持 == / != (用于空值收窄)
            Expr left = (Expr) visit(ctx.binaryExpression());
            Expr right = (Expr) visit(ctx.unaryExpression());
            if (left == null || right == null) return null;

            BinaryExpr.Op op;
            if (ctx.op.getType() == JasperParser.EQUAL_EQUAL) {
                op = BinaryExpr.Op.EQ;
            } else if (ctx.op.getType() == JasperParser.NOT_EQUAL) {
                op = BinaryExpr.Op.NE;
            } else {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "unknown equality operator", span(ctx));
                return null;
            }
            return new BinaryExpr(left, op, right, span(ctx));
        }

@Override
        public Object visitBinaryBitAnd(JasperParser.BinaryBitAndContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "bitand is not supported in this stage", span(ctx));
            return null;
        }

        @Override
        public Object visitBinaryBitExclusiveOr(JasperParser.BinaryBitExclusiveOrContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "xor is not supported in this stage", span(ctx));
            return null;
        }

        @Override
        public Object visitBinaryBitOr(JasperParser.BinaryBitOrContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "bitor is not supported in this stage", span(ctx));
            return null;
        }

        @Override
        public Object visitBinaryAnd(JasperParser.BinaryAndContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "and is not supported in this stage", span(ctx));
            return null;
        }

        @Override
        public Object visitBinaryOr(JasperParser.BinaryOrContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "or is not supported in this stage", span(ctx));
            return null;
        }

        @Override
        public Object visitUnaryOther(JasperParser.UnaryOtherContext ctx) {
            return visit(ctx.unaryExpressionNotPlusMinus());
        }

        @Override
        public Object visitUnaryPlus(JasperParser.UnaryPlusContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "unary plus not supported", span(ctx));
            return null;
        }

        @Override
        public Object visitUnaryMinus(JasperParser.UnaryMinusContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "unary minus not supported", span(ctx));
            return null;
        }

        @Override
        public Object visitUnaryPostfix(JasperParser.UnaryPostfixContext ctx) {
            return visit(ctx.postfixExpression());
        }

        @Override
        public Object visitPostfixExpression(JasperParser.PostfixExpressionContext ctx) {
            return visit(ctx.postfixBase());
        }

        @Override
        public Object visitPostfixBasePrimary(JasperParser.PostfixBasePrimaryContext ctx) {
            return visit(ctx.primary());
        }

        @Override
        public Object visitPrimaryChain(JasperParser.PrimaryChainContext ctx) {
            // v0.0.04：扩展 primary 链，支持：
            // - 顶层函数调用：foo(...)
            // - 成员访问/安全访问：a.b / a?.b
            // - 方法调用/安全调用：a.f(...) / a?.f(...)
            // - 非空断言后缀：x!
            Expr cur = (Expr) visit(ctx.primaryAtom());
            if (cur == null) return null;

            for (JasperParser.PrimarySuffixContext s : ctx.primarySuffix()) {
                if (s instanceof JasperParser.PrimarySuffixCallContext) {
                    // foo(...)：仅允许 name 作为 callee（兼容 day2 demo/backend）
                    if (!(cur instanceof VarRefExpr)) {
                        diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "call base must be a name", span(s));
                        return null;
                    }
                    JasperParser.PrimarySuffixCallContext call = (JasperParser.PrimarySuffixCallContext) s;
                    List<Expr> args = new ArrayList<>();
                    if (call.arguments().exprList() != null) {
                        for (JasperParser.ExpressionContext ectx : call.arguments().exprList().expression()) {
                            Expr a = (Expr) visit(ectx);
                            if (a == null) return null;
                            args.add(a);
                        }
                    }
                    Identifier callee = ((VarRefExpr) cur).name;
                    cur = new CallExpr(callee, args, span(s));
                    continue;
                }

                if (s instanceof JasperParser.PrimarySuffixDotContext || s instanceof JasperParser.PrimarySuffixSafeDotContext) {
                    boolean isSafe = s instanceof JasperParser.PrimarySuffixSafeDotContext;

                    Token idTok;
                    JasperParser.ArgumentsContext argsCtx;
                    if (s instanceof JasperParser.PrimarySuffixDotContext) {
                        JasperParser.PrimarySuffixDotContext d = (JasperParser.PrimarySuffixDotContext) s;
                        idTok = d.Identifier().getSymbol();
                        argsCtx = d.arguments();
                    } else {
                        JasperParser.PrimarySuffixSafeDotContext d = (JasperParser.PrimarySuffixSafeDotContext) s;
                        idTok = d.Identifier().getSymbol();
                        argsCtx = d.arguments();
                    }

                    Identifier member = new Identifier(idTok.getText(), spanFromToken(idTok));

                    if (argsCtx == null) {
                        cur = new MemberAccessExpr(cur, member, isSafe, span(s));
                    } else {
                        List<Expr> args = new ArrayList<>();
                        if (argsCtx.exprList() != null) {
                            for (JasperParser.ExpressionContext ectx : argsCtx.exprList().expression()) {
                                Expr a = (Expr) visit(ectx);
                                if (a == null) return null;
                                args.add(a);
                            }
                        }
                        cur = new MethodCallExpr(cur, member, args, isSafe, span(s));
                    }
                    continue;
                }

                if (s instanceof JasperParser.PrimarySuffixNotNullAssertContext) {
                    cur = new NotNullAssertExpr(cur, span(s));
                    continue;
                }

                // 其它后缀（索引/new-after-dot...）本阶段不支持
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "primary suffix not supported in this stage", span(s));
                return null;
            }

            return cur;
        }



        @Override
        public Object visitPrimaryAtomName(JasperParser.PrimaryAtomNameContext ctx) {
            // qualifiedName 目前只支持单段 Identifier（用于本轮 demo/测试）。
            // 若出现 a.b 或更复杂的 qualifiedName，本轮先报 UNSUPPORTED。
            String qn = ctx.qualifiedName().getText();
            if (qn.indexOf('.') >= 0) {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "qualifiedName with '.' not supported yet: " + qn, span(ctx));
                return null;
            }
            Identifier id = new Identifier(qn, span(ctx));
            return new VarRefExpr(id, span(ctx));
        }

        @Override
        public Object visitPrimaryAtomLiteral(JasperParser.PrimaryAtomLiteralContext ctx) {
            JasperParser.LiteralContext lit = ctx.literal();
            // v0.0.04：支持 int 字面量 + null
            if (lit instanceof JasperParser.DecimalLiteralContext) {
                String text = ((JasperParser.DecimalLiteralContext) lit).DEC_LITERAL().getText();
                try {
                    long v = Long.parseLong(text);
                    return new IntLitExpr(v, span(ctx));
                } catch (NumberFormatException nfe) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "integer literal out of range: " + text, span(ctx));
                    return null;
                }
            }
            if (lit instanceof JasperParser.NullLiteralContext) {
                return new NullLitExpr(span(ctx));
            }
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "literal not supported in this stage", span(ctx));
            return null;
        }

        @Override
        public Object visitPrimaryAtomParen(JasperParser.PrimaryAtomParenContext ctx) {
            return visit(ctx.expression());
        }

        @Override
        public Object visitPrimaryMethodReference(JasperParser.PrimaryMethodReferenceContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "method reference not supported", span(ctx));
            return null;
        }

        // 其他 primaryAtom 形态（new/this/super/array 等）本轮不支持
        @Override
        public Object visitPrimaryAtomNew(JasperParser.PrimaryAtomNewContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "new not supported in this stage", span(ctx));
            return null;
        }

        @Override
        public Object visitPrimaryAtomThis(JasperParser.PrimaryAtomThisContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "this not supported in this stage", span(ctx));
            return null;
        }

        @Override
        public Object visitPrimaryAtomSuper(JasperParser.PrimaryAtomSuperContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "super not supported in this stage", span(ctx));
            return null;
        }
    }

    // ===========================
    // 模式检查：print(a,b,a+b)
    // ===========================

    private boolean isPrintFooPattern(JasperParser.MethodBodyContext body, List<FunctionDecl.Param> params) {
        if (!(body instanceof JasperParser.MethodBodyBlockContext)) {
            return false;
        }
        if (params.size() != 2) {
            return false;
        }

        JasperParser.BlockContext block = ((JasperParser.MethodBodyBlockContext) body).block();
        List<JasperParser.BlockStatementContext> stmts = block.blockStatement();
        if (stmts.size() != 1) {
            return false;
        }
        JasperParser.BlockStatementContext bs = stmts.get(0);
        if (!(bs instanceof JasperParser.BlockStatementStatementContext)) {
            return false;
        }
        JasperParser.StatementContext st = ((JasperParser.BlockStatementStatementContext) bs).statement();
        if (!(st instanceof JasperParser.StatementExpressionStatementContext)) {
            return false;
        }

        JasperParser.ExpressionStatementContext est = ((JasperParser.StatementExpressionStatementContext) st).expressionStatement();
        JasperParser.StatementExpressionContext sex = est.statementExpression();
        if (!(sex instanceof JasperParser.StatementExpressionAnyContext)) {
            return false;
        }

        Expr e = (Expr) new BuildVisitor().visit(((JasperParser.StatementExpressionAnyContext) sex).expression());
        if (!(e instanceof CallExpr)) {
            return false;
        }
        CallExpr c = (CallExpr) e;
        if (!"print".equals(c.callee.text)) return false;
        if (c.args.size() != 3) return false;

        String a = params.get(0).name;
        String b = params.get(1).name;

        // arg0: a
        if (!(c.args.get(0) instanceof VarRefExpr)) return false;
        if (!a.equals(((VarRefExpr) c.args.get(0)).name.text)) return false;

        // arg1: b
        if (!(c.args.get(1) instanceof VarRefExpr)) return false;
        if (!b.equals(((VarRefExpr) c.args.get(1)).name.text)) return false;

        // arg2: a + b
        if (!(c.args.get(2) instanceof BinaryExpr)) return false;
        BinaryExpr be = (BinaryExpr) c.args.get(2);
        if (be.op != BinaryExpr.Op.ADD) return false;
        if (!(be.left instanceof VarRefExpr) || !(be.right instanceof VarRefExpr)) return false;
        if (!a.equals(((VarRefExpr) be.left).name.text)) return false;
        if (!b.equals(((VarRefExpr) be.right).name.text)) return false;

        return true;
    }

    private Span span(ParserRuleContext ctx) {
        if (ctx == null || ctx.getStart() == null || ctx.getStop() == null) {
            return null;
        }
        int start = Math.max(0, ctx.getStart().getStartIndex());
        int end = Math.max(start, ctx.getStop().getStopIndex() + 1);
        return new Span(new Pos(start), new Pos(end));
    }

    private Span span(Token t) {
        if (t == null) return null;
        int start = Math.max(0, t.getStartIndex());
        int end = Math.max(start, t.getStopIndex() + 1);
        return new Span(new Pos(start), new Pos(end));
    }

    private Span spanFromToken(Token t) {
        return span(t);
    }
}
