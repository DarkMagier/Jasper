package app.jackiey.jasper.frontend.parse.antlr;

import app.jackiey.jasper.frontend.ast.nodes.*;
import app.jackiey.jasper.frontend.ast.span.Pos;
import app.jackiey.jasper.frontend.ast.span.Span;
import app.jackiey.jasper.frontend.diag.DiagnosticSink;
import app.jackiey.jasper.frontend.diag.ErrorCode;
import gen.antlr.jasper.JasperParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Builds the project’s *minimal* AST from the full Jasper grammar.
 *
 * Today we only lower a tiny subset (see AstToCgir):
 *   - one function declaration: function foo(a:int64, b:int64) { print(a,b,a+b); }
 *   - one top-level call statement: foo(1,2);
 *
 * Everything else is accepted by the parser but flagged as UNSUPPORTED_SYNTAX at AST-build time.
 */
public final class AstBuilder {
    private final CommonTokenStream tokens;
    private final DiagnosticSink diag;

    public AstBuilder(CommonTokenStream tokens, DiagnosticSink diag) {
        this.tokens = tokens;
        this.diag = diag;
    }

    public Program build(JasperParser.SourceFileContext file) {
        List<Item> items = new ArrayList<Item>();

        for (JasperParser.TopLevelItemContext it : file.topLevelItem()) {
            if (it instanceof JasperParser.TopLevelDeclarationItemContext) {
                JasperParser.TopLevelDeclContext decl = ((JasperParser.TopLevelDeclarationItemContext) it).topLevelDecl();
                Item built = buildTopLevelDecl(decl);
                if (built != null) items.add(built);
            } else if (it instanceof JasperParser.TopLevelStatementItemContext) {
                Item built = buildTopLevelStmt(((JasperParser.TopLevelStatementItemContext) it).statement());
                if (built != null) items.add(built);
            } else {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "unknown top level item", span(it));
            }
        }

        return new Program(items);
    }

    private Item buildTopLevelDecl(JasperParser.TopLevelDeclContext decl) {
        if (decl instanceof JasperParser.TopDeclarationFunctionContext) {
            return buildTopFunction((JasperParser.TopDeclarationFunctionContext) decl);
        }
        diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "top level declaration not supported yet", span(decl));
        return null;
    }

    private FunctionDecl buildTopFunction(JasperParser.TopDeclarationFunctionContext fn) {
        String nameText = fn.name.getText();
        Identifier name = new Identifier(nameText, spanFromToken(fn.name));

        List<FunctionDecl.Param> params = new ArrayList<FunctionDecl.Param>();
        for (JasperParser.TypedBindingContext p : fn.params) {
            String pn = p.Identifier().getText();
            String ty = p.typeExpr().getText();
            params.add(new FunctionDecl.Param(pn, ty));
        }

        // Pattern check: body must be { print(a,b,a+b); }
        boolean patternOk = isPrintFooPattern(fn.body, params);

        return new FunctionDecl(name, params, patternOk, span(fn));
    }

    private boolean isPrintFooPattern(JasperParser.MethodBodyContext body, List<FunctionDecl.Param> params) {
        if (!(body instanceof JasperParser.MethodBodyBlockContext)) {
            return false;
        }
        if (params.size() != 2) {
            return false;
        }

        // Extract the first (and only) expression statement inside the block.
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
        String exprText = ((JasperParser.StatementExpressionAnyContext) sex).expression().getText();

        CallParts call = CallParts.tryParse(exprText);
        if (call == null) return false;
        if (!"print".equals(call.name)) return false;
        if (call.args.size() != 3) return false;

        String a = params.get(0).name;
        String b = params.get(1).name;

        // Normalize away whitespace (ANTLR getText already strips it), but keep it robust.
        String arg0 = call.args.get(0);
        String arg1 = call.args.get(1);
        String arg2 = call.args.get(2);
        return a.equals(arg0) && b.equals(arg1) && (a + "+" + b).equals(arg2);
    }

    private Item buildTopLevelStmt(JasperParser.StatementContext stmt) {
        if (!(stmt instanceof JasperParser.StatementExpressionStatementContext)) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "only expression statements are supported at top level", span(stmt));
            return null;
        }
        JasperParser.ExpressionStatementContext est = ((JasperParser.StatementExpressionStatementContext) stmt).expressionStatement();
        JasperParser.StatementExpressionContext sex = est.statementExpression();
        if (!(sex instanceof JasperParser.StatementExpressionAnyContext)) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "only simple expressions are supported at top level", span(stmt));
            return null;
        }

        String exprText = ((JasperParser.StatementExpressionAnyContext) sex).expression().getText();
        CallParts call = CallParts.tryParse(exprText);
        if (call == null) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "only call expressions are supported at top level", span(stmt));
            return null;
        }

        Identifier callee = new Identifier(call.name, span(stmt));
        List<Expr> args = new ArrayList<Expr>();
        for (int i = 0; i < call.args.size(); i++) {
            String a = call.args.get(i);
            try {
                long v = Long.parseLong(a);
                args.add(new IntLitExpr(v, span(stmt)));
            } catch (NumberFormatException nfe) {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "only integer literal args are supported: " + a, span(stmt));
                return null;
            }
        }
        CallExpr ce = new CallExpr(callee, args, span(stmt));
        return new StmtItem(new ExprStmt(ce,ce.span));
    }

    private Span span(ParserRuleContext ctx) {
        if (ctx == null || ctx.getStart() == null || ctx.getStop() == null) {
            return null;
        }
        int start = Math.max(0, ctx.getStart().getStartIndex());
        int end = Math.max(start, ctx.getStop().getStopIndex() + 1);
        return new Span(new Pos(start), new Pos(end));
    }

    private Span spanFromToken(org.antlr.v4.runtime.Token t) {
        if (t == null) return null;
        int start = Math.max(0, t.getStartIndex());
        int end = Math.max(start, t.getStopIndex() + 1);
        return new Span(new Pos(start), new Pos(end));
    }

    /**
     * Tiny call parser for a restricted subset.
     *
     * Input format is the ANTLR getText() string, so it’s whitespace-free.
     */
    private static final class CallParts {
        final String name;
        final List<String> args;

        private CallParts(String name, List<String> args) {
            this.name = name;
            this.args = args;
        }

        static CallParts tryParse(String text) {
            if (text == null) return null;
            int lp = text.indexOf('(');
            int rp = text.lastIndexOf(')');
            if (lp <= 0 || rp <= lp) return null;

            String name = text.substring(0, lp);
            if (!isIdent(name)) return null;

            String inside = text.substring(lp + 1, rp);
            if (inside.isEmpty()) {
                return new CallParts(name, Collections.<String>emptyList());
            }
            List<String> parts = splitTopLevelComma(inside);
            return new CallParts(name, parts);
        }

        private static boolean isIdent(String s) {
            if (s.isEmpty()) return false;
            char c0 = s.charAt(0);
            if (!(c0 == '_' || Character.isLetter(c0))) return false;
            for (int i = 1; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!(c == '_' || Character.isLetterOrDigit(c))) return false;
            }
            return true;
        }

        private static List<String> splitTopLevelComma(String inside) {
            List<String> out = new ArrayList<String>();
            int depth = 0;
            int last = 0;
            for (int i = 0; i < inside.length(); i++) {
                char c = inside.charAt(i);
                if (c == '(' || c == '[' || c == '{') depth++;
                else if (c == ')' || c == ']' || c == '}') depth--;
                else if (c == ',' && depth == 0) {
                    out.add(inside.substring(last, i));
                    last = i + 1;
                }
            }
            out.add(inside.substring(last));
            return out;
        }
    }
}
