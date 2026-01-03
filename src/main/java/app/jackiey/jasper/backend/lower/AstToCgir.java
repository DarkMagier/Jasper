package app.jackiey.jasper.backend.lower;

import app.jackiey.jasper.backend.cgir.*;
import app.jackiey.jasper.frontend.ast.nodes.*;
import app.jackiey.jasper.frontend.diag.DiagnosticSink;
import app.jackiey.jasper.frontend.diag.ErrorCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * AST -> CGIR lowering（统一内部调用/内部表示）。
 *
 * 本工程 day2 的后端仍然是 demo 级别：
 * - 原有 demo：function foo(a:int64,b:int64) { print(a,b,a+b); } + 顶层 foo(1,2)
 * - 本轮新增：class/interface 语法支持（解析 → AST → lowering → 测试）
 *
 * 关键策略：
 * - 不为 class/interface 在后端引入特例分支；而是在 lowering 阶段把它们统一“降为一组内部函数调用”。
 * - 这些内部函数的“存在”就是语义载体：后端只需处理 CgFunction/CgInst 的统一形态。
 */
public final class AstToCgir {
    public static final String ENTRY = "__entry";

    public CgProgram lower(Program program, DiagnosticSink diag) {
        boolean hasFooDecl = false;
        boolean hasCall = false;
        long callA = 1;
        long callB = 2;

        List<CgFunction> out = new ArrayList<>();

        for (Item it : program.items) {
            if (it instanceof FunctionDecl) {
                FunctionDecl fd = (FunctionDecl) it;
                // demo 兼容：目前仍只“真正实现” foo
                if (!"foo".equals(fd.name.text)) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "Today only supports function name: foo");
                    return new CgProgram(Collections.<CgFunction>emptyList());
                }
                if (fd.params.size() != 2) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "foo must have exactly 2 params");
                    return new CgProgram(Collections.<CgFunction>emptyList());
                }
                if (!"int64".equals(fd.params.get(0).typeName) || !"int64".equals(fd.params.get(1).typeName)) {
                    diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "param types must be int64");
                    return new CgProgram(Collections.<CgFunction>emptyList());
                }
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
            } else if (it instanceof ClassDecl) {
                emitClassStubs((ClassDecl) it, out);
            } else if (it instanceof InterfaceDecl) {
                emitInterfaceStubs((InterfaceDecl) it, out);
            } else {
                diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "Unknown item type");
                return new CgProgram(Collections.<CgFunction>emptyList());
            }
        }

        // demo 兼容：如果用户写了 foo 但没有 call（或反之），视为错误；
        // 但如果两者都没写（例如仅写 class/interface），则不报错。
        if (hasFooDecl != hasCall) {
            if (!hasFooDecl) {
                diag.error(ErrorCode.PARSE_ERROR, "Missing foo declaration");
            } else {
                diag.error(ErrorCode.PARSE_ERROR, "Missing foo(?,?) call");
            }
            return new CgProgram(Collections.<CgFunction>emptyList());
        }

        if (hasFooDecl) {
            // foo(i64,i64): runtime prints a b a+b
            out.add(new CgFunction(
                    "foo",
                    Arrays.asList(CgType.I64, CgType.I64),
                    Arrays.<CgInst>asList(
                            new CgInst.PrintFooParams(),
                            new CgInst.RetVoid()
                    )
            ));
        }

        // __entry：统一存在。
        // - demo 情况：包含 Call2I64
        // - 仅 class/interface 情况：空函数（RetVoid）
        if (hasCall) {
            out.add(new CgFunction(
                    ENTRY,
                    Collections.<CgType>emptyList(),
                    Arrays.<CgInst>asList(
                            new CgInst.Call2I64("foo", callA, callB),
                            new CgInst.RetVoid()
                    )
            ));
        } else {
            out.add(new CgFunction(
                    ENTRY,
                    Collections.<CgType>emptyList(),
                    Arrays.<CgInst>asList(new CgInst.RetVoid())
            ));
        }

        return new CgProgram(out);
    }

    // ==========================
    // class/interface lowering: 统一降为一组“内部函数”
    // ==========================

    private void emitClassStubs(ClassDecl cd, List<CgFunction> out) {
        String c = mangle(cd.name.text);

        // class 本体 marker
        out.add(stub("__type$" + c));

        // implements markers
        for (TypeRef t : cd.implementsTypes) {
            out.add(stub("__implements$" + c + "$" + mangle(t.text)));
        }

        // members
        for (ClassMember m : cd.members) {
            if (m instanceof FieldDecl) {
                FieldDecl f = (FieldDecl) m;
                out.add(stub("__field$" + c + "$" + mangle(f.name.text)));
            } else if (m instanceof MethodDecl) {
                MethodDecl md = (MethodDecl) m;
                out.add(stub("__method$" + c + "$" + mangle(md.name.text)));
            }
        }
    }

    private void emitInterfaceStubs(InterfaceDecl id, List<CgFunction> out) {
        String i = mangle(id.name.text);

        // interface marker
        out.add(stub("__iface$" + i));

        for (MethodDecl m : id.methods) {
            out.add(stub("__ifaceMethod$" + i + "$" + mangle(m.name.text)));
        }
    }

    private CgFunction stub(String name) {
        return new CgFunction(
                name,
                Collections.<CgType>emptyList(),
                Arrays.<CgInst>asList(new CgInst.RetVoid())
        );
    }

    /**
     * 将任意名字（可能含泛型、数组、点号等）mangle 成后端安全的标识符片段。
     *
     * 规则：保留 [A-Za-z0-9_]，其它字符统一替换为 '$'。
     */
    private static String mangle(String s) {
        if (s == null || s.isEmpty()) return "_";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == '_') {
                sb.append(c);
            } else {
                sb.append('$');
            }
        }
        return sb.toString();
    }
}
