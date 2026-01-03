package app.jackiey.jasper.frontend.sema;

import app.jackiey.jasper.frontend.ast.nodes.*;
import app.jackiey.jasper.frontend.diag.DiagnosticSink;
import app.jackiey.jasper.frontend.diag.ErrorCode;

import java.util.*;

/**
 * v0.0.04 语义检查：
 * - local variable definite assignment
 * - minimal nullability checks
 */
final class FunctionBodyChecker {

    private static final String NULL_TY = "<null>";

    private static final class VarInfo {
        final JType declared;
        final boolean isLate;
        boolean assignedInitially;

        VarInfo(JType declared, boolean isLate, boolean assignedInitially) {
            this.declared = declared;
            this.isLate = isLate;
            this.assignedInitially = assignedInitially;
        }
    }

    private static final class Flow {
        final Set<String> assigned;
        final Set<String> nonNull;

        Flow(Set<String> assigned, Set<String> nonNull) {
            this.assigned = assigned;
            this.nonNull = nonNull;
        }

        Flow copy() {
            return new Flow(new HashSet<>(assigned), new HashSet<>(nonNull));
        }

        static Flow intersect(Flow a, Flow b) {
            Set<String> as = new HashSet<>(a.assigned);
            as.retainAll(b.assigned);
            Set<String> nn = new HashSet<>(a.nonNull);
            nn.retainAll(b.nonNull);
            return new Flow(as, nn);
        }
    }

    public void check(FunctionDecl f, DiagnosticSink diag) {
        // 1) 收集 function 的类型参数 + where NonNull 约束
        Set<String> declaredTypeParams = new HashSet<>();
        if (f.typeParameters != null) {
            for (TypeParameter tp : f.typeParameters.params) {
                declaredTypeParams.add(tp.name);
            }
        }

        Set<String> nonNullTypeParams = new HashSet<>();
        if (f.whereClause != null) {
            for (WhereConstraint c : f.whereClause.constraints) {
                String tp = c.typeParam.text;
                String cons = c.constraint.text;
                if (!declaredTypeParams.contains(tp)) {
                    diag.error(ErrorCode.INVALID_WHERE_CONSTRAINT, "unknown type param in where: " + tp);
                    continue;
                }
                if (!"NonNull".equals(cons)) {
                    diag.error(ErrorCode.INVALID_WHERE_CONSTRAINT, "only supports constraint: NonNull");
                    continue;
                }
                nonNullTypeParams.add(tp);
            }
        }

        // 2) 局部变量表：参数先入表且视为已赋值
        Map<String, VarInfo> vars = new HashMap<>();
        Set<String> assigned0 = new HashSet<>();
        Set<String> nonNull0 = new HashSet<>();

        for (FunctionDecl.Param p : f.params) {
            // 无类型信息时也不阻断；本阶段仅用于 read-before-assign
            JType ty = p.type != null ? resolveType(p.type, declaredTypeParams, nonNullTypeParams) : JType.concrete("Any", true, false);
            vars.put(p.name, new VarInfo(ty, false, true));
            assigned0.add(p.name);
            // 参数若在语法层是非空类型，则默认在流里也 nonNull
            if (!ty.nullable) nonNull0.add(p.name);
        }

        Flow out = checkBlock(f.bodyAst, vars, new Flow(assigned0, nonNull0), declaredTypeParams, nonNullTypeParams, diag);
        // out 不使用；未来可用于函数后置条件/返回检查。
    }

    private Flow checkBlock(
            BlockStmt block,
            Map<String, VarInfo> vars,
            Flow in,
            Set<String> declaredTypeParams,
            Set<String> nonNullTypeParams,
            DiagnosticSink diag
    ) {
        Flow cur = in.copy();
        for (Stmt s : block.stmts) {
            cur = checkStmt(s, vars, cur, declaredTypeParams, nonNullTypeParams, diag);
        }
        return cur;
    }

    private Flow checkStmt(
            Stmt stmt,
            Map<String, VarInfo> vars,
            Flow in,
            Set<String> declaredTypeParams,
            Set<String> nonNullTypeParams,
            DiagnosticSink diag
    ) {
        if (stmt instanceof BlockStmt) {
            // 语句块：顺序作用域（本阶段不引入 block scope shadowing）。
            return checkBlock((BlockStmt) stmt, vars, in, declaredTypeParams, nonNullTypeParams, diag);
        }
        if (stmt instanceof VarDeclStmt) {
            return checkVarDecl((VarDeclStmt) stmt, vars, in, declaredTypeParams, nonNullTypeParams, diag);
        }
        if (stmt instanceof ExprStmt) {
            ExprStmt es = (ExprStmt) stmt;
            evalExpr(es.expr, vars, in, nonNullTypeParams, diag);
            // assignment effects already handled in evalExpr
            return in;
        }
        if (stmt instanceof IfStmt) {
            return checkIf((IfStmt) stmt, vars, in, declaredTypeParams, nonNullTypeParams, diag);
        }
        // 其它语句本阶段不做语义
        return in;
    }

    private Flow checkIf(
            IfStmt ifs,
            Map<String, VarInfo> vars,
            Flow in,
            Set<String> declaredTypeParams,
            Set<String> nonNullTypeParams,
            DiagnosticSink diag
    ) {
        // 先检查条件
        evalExpr(ifs.condition, vars, in, nonNullTypeParams, diag);

        // 控制流收窄（最小）：识别 (x != null) / (x == null)
        Flow thenIn = in.copy();
        Flow elseIn = in.copy();

        Narrowing n = extractNarrowing(ifs.condition);
        if (n != null) {
            if (n.kind == NarrowingKind.NON_NULL) {
                thenIn.nonNull.add(n.varName);
            } else {
                elseIn.nonNull.add(n.varName);
            }
        }

        Flow thenOut = checkBlock(ifs.thenBlock, vars, thenIn, declaredTypeParams, nonNullTypeParams, diag);

        Flow elseOut;
        if (ifs.elseBranch == null) {
            elseOut = elseIn;
        } else if (ifs.elseBranch instanceof BlockStmt) {
            elseOut = checkBlock((BlockStmt) ifs.elseBranch, vars, elseIn, declaredTypeParams, nonNullTypeParams, diag);
        } else if (ifs.elseBranch instanceof IfStmt) {
            elseOut = checkIf((IfStmt) ifs.elseBranch, vars, elseIn, declaredTypeParams, nonNullTypeParams, diag);
        } else {
            elseOut = elseIn;
        }

        // if 之后：只有两边都赋值的变量才算 definitely assigned；nonNull 同理
        return Flow.intersect(thenOut, elseOut);
    }

    private Flow checkVarDecl(
            VarDeclStmt vd,
            Map<String, VarInfo> vars,
            Flow in,
            Set<String> declaredTypeParams,
            Set<String> nonNullTypeParams,
            DiagnosticSink diag
    ) {
        String name = vd.name.text;

        // 推导/解析变量类型
        JType declared;
        if (vd.type != null) {
            declared = resolveType(vd.type, declaredTypeParams, nonNullTypeParams);
        } else {
            if (vd.initializer == null) {
                // 允许：var x; 未来可做类型推断/局部类型默认 Any；这里选择 Any?
                declared = JType.concrete("Any", true, false);
            } else {
                JType initTy = evalExpr(vd.initializer, vars, in, nonNullTypeParams, diag);
                if (initTy != null && NULL_TY.equals(initTy.baseName)) {
                    diag.error(ErrorCode.CANNOT_INFER_TYPE_FROM_NULL, "cannot infer type from null; please add ': T?'");
                    declared = JType.concrete("Any", true, false);
                } else {
                    declared = initTy == null ? JType.concrete("Any", true, false) : initTy;
                }
            }
        }

        boolean assigned = false;

        if (vd.kind == VarDeclStmt.Kind.CONST) {
            if (vd.initializer == null) {
                diag.error(ErrorCode.CONST_REQUIRES_INITIALIZER, "const must have initializer");
            }
        }

        if (vd.initializer != null) {
            JType rhs = evalExpr(vd.initializer, vars, in, nonNullTypeParams, diag);
            if (rhs != null && !declared.isAssignableFrom(rhs)) {
                diag.error(ErrorCode.NULLABILITY_MISMATCH, "cannot assign '" + rhs + "' to '" + declared + "'");
            }
            assigned = true;
        }

        vars.put(name, new VarInfo(declared, vd.isLate, assigned));

        if (vd.isLate) {
            // late：允许未初始化读取（运行时错误），因此在 definite assignment 视角我们把它当作“可读”。
            in.assigned.add(name);
        } else if (assigned) {
            in.assigned.add(name);
        }

        if (!declared.nullable) {
            in.nonNull.add(name);
        }
        return in;
    }

    private JType evalExpr(
            Expr expr,
            Map<String, VarInfo> vars,
            Flow flow,
            Set<String> nonNullTypeParams,
            DiagnosticSink diag
    ) {
        if (expr == null) return null;

        if (expr instanceof IntLitExpr) {
            return JType.concrete("int64", false, false);
        }
        if (expr instanceof NullLitExpr) {
            return JType.concrete(NULL_TY, true, false);
        }
        if (expr instanceof VarRefExpr) {
            String name = ((VarRefExpr) expr).name.text;
            VarInfo vi = vars.get(name);
            if (vi == null) {
                // 未来：名字解析；本阶段当 Any?
                return JType.concrete("Any", true, false);
            }

            // definite assignment：读之前必须赋值，除非 late
            if (!flow.assigned.contains(name) && !vi.isLate) {
                diag.error(ErrorCode.READ_BEFORE_ASSIGN, "read before assignment: " + name);
            }

            // flow-nonNull：若在收窄集合里，则视为非空
            if (flow.nonNull.contains(name)) {
                return vi.declared.withNonNull();
            }
            return vi.declared;
        }
        if (expr instanceof AssignExpr) {
            AssignExpr as = (AssignExpr) expr;
            JType rhs = evalExpr(as.rhs, vars, flow, nonNullTypeParams, diag);
            String name = as.lhs.name.text;
            VarInfo vi = vars.get(name);
            if (vi != null) {
                if (rhs != null && !vi.declared.isAssignableFrom(rhs)) {
                    diag.error(ErrorCode.NULLABILITY_MISMATCH, "cannot assign '" + rhs + "' to '" + vi.declared + "'");
                }
                flow.assigned.add(name);
                if (!vi.declared.nullable) {
                    flow.nonNull.add(name);
                }
                return vi.declared;
            }
            // 未声明变量：仍然让它通过（未来 name-resolve 会报错）
            flow.assigned.add(name);
            return rhs;
        }
        if (expr instanceof BinaryExpr) {
            BinaryExpr be = (BinaryExpr) expr;
            JType lt = evalExpr(be.left, vars, flow, nonNullTypeParams, diag);
            JType rt = evalExpr(be.right, vars, flow, nonNullTypeParams, diag);
            if (be.op == BinaryExpr.Op.ADD || be.op == BinaryExpr.Op.SUB) {
                return JType.concrete("int64", false, false);
            }
            // EQ/NE：返回 bool（本阶段不建模 bool 类型，退化为 Any non-null）
            return JType.concrete("bool", false, false);
        }
        if (expr instanceof CallExpr) {
            CallExpr call = (CallExpr) expr;
            for (Expr a : call.args) {
                evalExpr(a, vars, flow, nonNullTypeParams, diag);
            }
            return JType.concrete("Any", true, false);
        }
        if (expr instanceof MethodCallExpr) {
            MethodCallExpr mc = (MethodCallExpr) expr;
            JType base = evalExpr(mc.target, vars, flow, nonNullTypeParams, diag);
            if (!mc.isSafe) {
                // 非安全调用：base 不能是 nullable（除非已收窄）
                if (base != null && base.nullable) {
                    diag.error(ErrorCode.NULLABILITY_MISMATCH, "nullable dereference: " + base);
                }
            }
            for (Expr a : mc.args) {
                evalExpr(a, vars, flow, nonNullTypeParams, diag);
            }
            // 未做成员类型解析：返回 Any?；若 safe-call 则结果可空
            return JType.concrete("Any", mc.isSafe, false);
        }
        if (expr instanceof MemberAccessExpr) {
            MemberAccessExpr ma = (MemberAccessExpr) expr;
            JType base = evalExpr(ma.target, vars, flow, nonNullTypeParams, diag);
            if (!ma.isSafe) {
                if (base != null && base.nullable) {
                    diag.error(ErrorCode.NULLABILITY_MISMATCH, "nullable dereference: " + base);
                }
            }
            return JType.concrete("Any", ma.isSafe, false);
        }
        if (expr instanceof NotNullAssertExpr) {
            JType base = evalExpr(((NotNullAssertExpr) expr).base, vars, flow, nonNullTypeParams, diag);
            if (base == null) return null;
            return base.withNonNull();
        }
        if (expr instanceof NullCoalesceExpr) {
            NullCoalesceExpr nc = (NullCoalesceExpr) expr;
            JType lt = evalExpr(nc.left, vars, flow, nonNullTypeParams, diag);
            JType rt = evalExpr(nc.right, vars, flow, nonNullTypeParams, diag);
            if (lt == null) return rt;
            if (!lt.nullable) {
                return lt;
            }
            if (rt == null) return lt;
            // 如果 rhs 非空，则 coalesce 后结果可视为非空
            if (!rt.nullable) {
                return rt.withNonNull();
            }
            return rt;
        }

        // 其它表达式：递归地检查子项（若有）——本阶段不覆盖
        return JType.concrete("Any", true, false);
    }

    private JType resolveType(TypeRef tr, Set<String> declaredTypeParams, Set<String> nonNullTypeParams) {
        if (tr == null || tr.expr == null || tr.expr.alts.isEmpty()) {
            return JType.concrete("Any", true, false);
        }

        // v0.0.04 约束：当前类型系统测试只覆盖最小子集：
        // - 不处理 union（A|B）；出现 union 时退化为 Any?
        // - pointer：*T（FFI/raw pointer），默认可为 null
        // - nullability：T? / T!（目前只用到 ?）
        if (tr.expr.alts.size() != 1) {
            return JType.concrete("Any", true, false);
        }

        TypePostfix p = tr.expr.alts.get(0);
        if (p == null || p.atom == null || p.atom.base == null) {
            return JType.concrete("Any", true, false);
        }

        boolean pointer = p.atom.prefixText != null && p.atom.prefixText.contains("*");

        // 资格符：? / !
        boolean nullableQual = false;
        for (TypeQualifierKind q : p.qualifiers) {
            if (q == TypeQualifierKind.NULLABLE) {
                nullableQual = true;
            } else if (q == TypeQualifierKind.NON_NULL) {
                nullableQual = false;
            }
        }

        String baseRaw;
        if (p.atom.base instanceof TypeAtomBase.Primitive) {
            baseRaw = ((TypeAtomBase.Primitive) p.atom.base).name;
        } else if (p.atom.base instanceof TypeAtomBase.Identifier) {
            baseRaw = ((TypeAtomBase.Identifier) p.atom.base).name;
        } else {
            baseRaw = "Any";
        }

        // 语言层 Int -> sema 内部 int64（与 IntLitExpr 对齐）
        String base = "Int".equals(baseRaw) ? "int64" : baseRaw;

        // 类型参数：
        // - unconstrained T：默认可能为 null
        // - where T is NonNull：在函数体内视为非空
        if (declaredTypeParams.contains(base)) {
            boolean constrainedNonNull = nonNullTypeParams.contains(base);
            boolean effectiveNullable = nullableQual;
            if (!constrainedNonNull) {
                effectiveNullable = true;
            }
            return JType.typeVar(base, effectiveNullable);
        }

        return JType.concrete(base, nullableQual, pointer);
    }

    private enum NarrowingKind { NON_NULL, IS_NULL }
    private static final class Narrowing {
        final String varName;
        final NarrowingKind kind;
        Narrowing(String varName, NarrowingKind kind) { this.varName = varName; this.kind = kind; }
    }

    private Narrowing extractNarrowing(Expr cond) {
        if (!(cond instanceof BinaryExpr)) return null;
        BinaryExpr be = (BinaryExpr) cond;
        if (be.op != BinaryExpr.Op.NE && be.op != BinaryExpr.Op.EQ) return null;

        // 识别：VarRef (==|!=) Null
        if (be.left instanceof VarRefExpr && be.right instanceof NullLitExpr) {
            String v = ((VarRefExpr) be.left).name.text;
            if (be.op == BinaryExpr.Op.NE) return new Narrowing(v, NarrowingKind.NON_NULL);
            return new Narrowing(v, NarrowingKind.IS_NULL);
        }
        if (be.right instanceof VarRefExpr && be.left instanceof NullLitExpr) {
            String v = ((VarRefExpr) be.right).name.text;
            if (be.op == BinaryExpr.Op.NE) return new Narrowing(v, NarrowingKind.NON_NULL);
            return new Narrowing(v, NarrowingKind.IS_NULL);
        }
        return null;
    }
}
