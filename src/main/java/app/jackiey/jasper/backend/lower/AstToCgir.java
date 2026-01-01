package app.jackiey.jasper.backend.lower;

import app.jackiey.jasper.backend.cgir.*;
import app.jackiey.jasper.frontend.diag.DiagnosticSink;
import app.jackiey.jasper.frontend.diag.ErrorCode;
import app.jackiey.jasper.frontend.ast.nodes.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Today's goal lowering:
 *
 * Accepts:
 *   fn foo(a:int64, b:int64) { print(a,b,a+b); }
 *   foo(1,2)
 *
 * Produces CGIR:
 *   void foo(i64,i64) { PrintFooParams; ret }
 *   void __entry() { Call2I64(foo, 1,2); ret }
 */
public final class AstToCgir {
    public static final String ENTRY = "__entry";

    public CgProgram lower(Program program, DiagnosticSink diag) {
        boolean hasFooDecl = false;
        long callA = 1;
        long callB = 2;
        boolean hasCall = false;

        for (Item it : program.items) {
            if (it instanceof FunctionDecl) {
                FunctionDecl fd = (FunctionDecl) it;
                if (!"foo".equals(fd.name.text)) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "Today only supports function name: foo");
                    return new CgProgram(Collections.<CgFunction>emptyList());
                }
                // 只支持两个参数、类型 int64，并且 body 是 print(a,b,a+b)
                if (fd.params.size() != 2) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "foo must have exactly 2 params");
                    return new CgProgram(Collections.<CgFunction>emptyList());
                }
                if (!"int64".equals(fd.params.get(0).typeName) || !"int64".equals(fd.params.get(1).typeName)) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "param types must be int64");
                    return new CgProgram(Collections.<CgFunction>emptyList());
                }
                // body pattern check
                if (!fd.bodyIsPrintFooPattern) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "body must be: print(a,b,a+b)");
                    return new CgProgram(Collections.<CgFunction>emptyList());
                }
                hasFooDecl = true;
            } else if (it instanceof StmtItem) {
                StmtItem si = (StmtItem) it;
                if (!(si.stmt instanceof ExprStmt)) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "Today only supports a top-level call statement");
                    return new CgProgram(Collections.<CgFunction>emptyList());
                }
                Expr e = ((ExprStmt) si.stmt).expr;
                if (!(e instanceof CallExpr)) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "Today only supports a top-level call: foo(1,2)");
                    return new CgProgram(Collections.<CgFunction>emptyList());
                }
                CallExpr c = (CallExpr) e;
                if (!"foo".equals(c.callee.text)) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "Today only supports calling foo");
                    return new CgProgram(Collections.<CgFunction>emptyList());
                }
                if (c.args.size() != 2 || !(c.args.get(0) instanceof IntLitExpr) || !(c.args.get(1) instanceof IntLitExpr)) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "Today only supports foo(<int>,<int>)");
                    return new CgProgram(Collections.<CgFunction>emptyList());
                }
                callA = ((IntLitExpr) c.args.get(0)).value;
                callB = ((IntLitExpr) c.args.get(1)).value;
                hasCall = true;
            } else {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "Unknown item type");
                return new CgProgram(Collections.<CgFunction>emptyList());
            }
        }

        if (!hasFooDecl) {
            diag.error(ErrorCode.PARSE_ERROR, "Missing foo declaration");
            return new CgProgram(Collections.<CgFunction>emptyList());
        }
        if (!hasCall) {
            diag.error(ErrorCode.PARSE_ERROR, "Missing foo(?,?) call");
            return new CgProgram(Collections.<CgFunction>emptyList());
        }

        List<CgFunction> out = new ArrayList<>();

        // foo(i64,i64): runtime prints a b a+b
        out.add(new CgFunction(
                "foo",
                Arrays.asList(CgType.I64, CgType.I64),
                Arrays.<CgInst>asList(
                        new CgInst.PrintFooParams(),
                        new CgInst.RetVoid()
                )
        ));

        // __entry(): call foo(constA,constB)
        out.add(new CgFunction(
                ENTRY,
                Collections.<CgType>emptyList(),
                Arrays.<CgInst>asList(
                        new CgInst.Call2I64("foo", callA, callB),
                        new CgInst.RetVoid()
                )
        ));

        return new CgProgram(out);
    }
}
