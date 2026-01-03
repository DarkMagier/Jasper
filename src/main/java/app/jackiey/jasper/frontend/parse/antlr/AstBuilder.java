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
            // 维持原有最小 function AST（FunctionDecl），但 body pattern check 改为 parse-tree 驱动
            Identifier name = new Identifier(ctx.name.getText(), spanFromToken(ctx.name));

            List<FunctionDecl.Param> params = new ArrayList<>();
            for (JasperParser.TypedBindingContext p : ctx.params) {
                String pn = p.Identifier().getText();
                String ty = p.typeExpr().getText();
                params.add(new FunctionDecl.Param(pn, ty));
            }

            boolean patternOk = isPrintFooPattern(ctx.body, params);
            return new FunctionDecl(name, params, patternOk, span(ctx));
        }

        @Override
        public Object visitTopDeclarationClass(JasperParser.TopDeclarationClassContext ctx) {
            if (ctx.normalClassDeclaration() != null) {
                return visit(ctx.normalClassDeclaration());
            }
            // enum 暂不支持（本轮目标是 class/interface）
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "enum not supported yet", span(ctx));
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

            List<TypeRef> impls = new ArrayList<>();
            if (ctx.sis != null) {
                // superinterfaces: Implements typePostfix (',' typePostfix)* ','?
                for (JasperParser.TypePostfixContext t : ctx.sis.typePostfix()) {
                    impls.add(new TypeRef(t.getText(), span(t)));
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
                } else {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "unsupported class member (only field/method supported in this stage)", span(d));
                }
            }

            return new ClassDecl(name, impls, members, span(ctx));
        }

        @Override
        public Object visitNormalInterfaceDeclaration(JasperParser.NormalInterfaceDeclarationContext ctx) {
            Identifier name = new Identifier(ctx.name.getText(), spanFromToken(ctx.name));

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
                } else {
                    // 其他接口成员（常量、抽象方法 header、属性等）本轮不做
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "unsupported interface member (only function-style methodDeclaration supported)", span(d));
                }
            }

            return new InterfaceDecl(name, methods, span(ctx));
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
                    ty = new TypeRef(b.typeRef.getText(), span(b.typeRef));
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
                TypeRef ty = new TypeRef(p.typeExpr().getText(), span(p.typeExpr()));
                params.add(new MethodDecl.Param(pn, ty));
            }

            TypeRef ret = null;
            if (ctx.ret != null) {
                ret = new TypeRef(ctx.ret.typeExpr().getText(), span(ctx.ret.typeExpr()));
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
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "assignment is not supported in this stage", span(ctx));
            return null;
        }

        @Override
        public Object visitCondBinary(JasperParser.CondBinaryContext ctx) {
            return visit(ctx.binaryExpression());
        }

        @Override
        public Object visitCondTernary(JasperParser.CondTernaryContext ctx) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "ternary is not supported in this stage", span(ctx));
            return null;
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
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "equality is not supported in this stage", span(ctx));
            return null;
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
            // 只实现最小子集：
            // - primaryAtomName (qualifiedName) + arguments  => CallExpr
            // - primaryAtomName (qualifiedName)             => VarRefExpr
            // - literal decimal                              => IntLitExpr
            Expr base = (Expr) visit(ctx.primaryAtom());
            if (base == null) return null;

            // 目前仅支持“名字/字面量作为 base”，再接一个 call 后缀
            if (ctx.primarySuffix().isEmpty()) {
                return base;
            }

            // 只允许一个后缀，并且必须是 call
            if (ctx.primarySuffix().size() != 1 || !(ctx.primarySuffix(0) instanceof JasperParser.PrimarySuffixCallContext)) {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "only a single call suffix is supported in this stage", span(ctx));
                return null;
            }

            if (!(base instanceof VarRefExpr)) {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "call base must be a name", span(ctx));
                return null;
            }

            JasperParser.PrimarySuffixCallContext call = (JasperParser.PrimarySuffixCallContext) ctx.primarySuffix(0);
            List<Expr> args = new ArrayList<>();
            if (call.arguments().exprList() != null) {
                for (JasperParser.ExpressionContext ectx : call.arguments().exprList().expression()) {
                    Expr a = (Expr) visit(ectx);
                    if (a == null) return null;
                    args.add(a);
                }
            }

            Identifier callee = ((VarRefExpr) base).name;
            return new CallExpr(callee, args, span(ctx));
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
            // 只支持十进制整数：DEC_LITERAL（对应 grammar 的 DEC_LITERAL token）
            JasperParser.LiteralContext lit = ctx.literal();
            if (!(lit instanceof JasperParser.DecimalLiteralContext)) {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "only decimal integer literal supported", span(ctx));
                return null;
            }
            String text = ((JasperParser.DecimalLiteralContext) lit).DEC_LITERAL().getText();
            try {
                long v = Long.parseLong(text);
                return new IntLitExpr(v, span(ctx));
            } catch (NumberFormatException nfe) {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "integer literal out of range: " + text, span(ctx));
                return null;
            }
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
