package app.jackiey.jasper.middle.checker;

import app.jackiey.jasper.frontend.ast.nodes.*;
import app.jackiey.jasper.frontend.diag.DiagnosticSink;
import app.jackiey.jasper.frontend.diag.ErrorCode;

/**
 * AST Checker.
 *
 * Validates the current demo subset accepted by ParseFacade:
 *   fn foo(a:int64, b:int64) { print(a,b,a+b); }
 *   foo(<int64>,<int64>)
 */
public final class AstChecker {

    public CheckedProgram check(Program program, DiagnosticSink diag) {
        FunctionDecl fooDecl = null;
        Long callA = null;
        Long callB = null;

        for (Item it : program.items) {
            if (it instanceof FunctionDecl) {
                FunctionDecl fd = (FunctionDecl) it;
                if (!"foo".equals(fd.name.text)) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "Today only supports function name: foo");
                    continue;
                }
                if (fd.params.size() != 2) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "foo must have exactly 2 params");
                    continue;
                }
                if (!"int64".equals(fd.params.get(0).typeName) || !"int64".equals(fd.params.get(1).typeName)) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "param types must be int64");
                    continue;
                }
                if (!fd.bodyIsPrintFooPattern) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "body must be: print(a,b,a+b)");
                    continue;
                }
                fooDecl = fd;
            } else if (it instanceof StmtItem) {
                StmtItem si = (StmtItem) it;
                if (!(si.stmt instanceof ExprStmt)) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "Today only supports a top-level call statement");
                    continue;
                }
                Expr e = ((ExprStmt) si.stmt).expr;
                if (!(e instanceof CallExpr)) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "Today only supports a top-level call: foo(1,2)");
                    continue;
                }
                CallExpr c = (CallExpr) e;
                if (!"foo".equals(c.callee.text)) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "Today only supports calling foo");
                    continue;
                }
                if (c.args.size() != 2 || !(c.args.get(0) instanceof IntLitExpr) || !(c.args.get(1) instanceof IntLitExpr)) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "Today only supports foo(<int>,<int>)");
                    continue;
                }
                callA = ((IntLitExpr) c.args.get(0)).value;
                callB = ((IntLitExpr) c.args.get(1)).value;
            } else {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "Unknown item type");
            }
        }

        if (fooDecl == null) diag.error(ErrorCode.PARSE_ERROR, "Missing foo declaration");
        if (callA == null || callB == null) diag.error(ErrorCode.PARSE_ERROR, "Missing foo(?,?) call");

        long a = callA == null ? 0L : callA.longValue();
        long b = callB == null ? 0L : callB.longValue();
        return new CheckedProgram(program, fooDecl, a, b);
    }

    public static final class CheckedProgram {
        public final Program program;
        public final FunctionDecl fooDecl;
        public final long callA;
        public final long callB;

        public CheckedProgram(Program program, FunctionDecl fooDecl, long callA, long callB) {
            this.program = program;
            this.fooDecl = fooDecl;
            this.callA = callA;
            this.callB = callB;
        }
    }
}
