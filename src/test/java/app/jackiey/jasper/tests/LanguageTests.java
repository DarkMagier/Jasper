package app.jackiey.jasper.tests;

import app.jackiey.jasper.backend.cgir.CgFunction;
import app.jackiey.jasper.backend.cgir.CgInst;
import app.jackiey.jasper.backend.cgir.CgProgram;
import app.jackiey.jasper.backend.lower.AstToCgir;
import app.jackiey.jasper.frontend.ast.nodes.*;
import app.jackiey.jasper.frontend.diag.Diagnostic;
import app.jackiey.jasper.frontend.diag.DiagnosticSink;
import app.jackiey.jasper.frontend.diag.ErrorCode;
import app.jackiey.jasper.frontend.parse.ParseFacade;
import app.jackiey.jasper.frontend.parse.ParseResult;

import java.util.ArrayList;
import java.util.List;

/**
 * 轻量测试入口：不依赖 JUnit（容器可能没有 Maven/依赖）。
 *
 * 运行方式：
 *   java -ea -cp ... app.jackiey.jasper.tests.LanguageTests
 */
public final class LanguageTests {

    public static void main(String[] args) {
        testClassEmpty();
        testClassFields();
        testClassMethods();
        testInterfaceEmpty();
        testInterfaceMethods();
        testClassImplementsInterface();
        testGenericClassTypeParams();
        testGenericTypeArgumentsInField();
        testGenericImplementsTypeArguments();
        testEnumBasics();
        testEnumBodyDeclarations();

        // v0.0.04：类型系统/空安全/赋值/控制流
        testVarNullabilityOk();
        testNullOnlyAssignableToNullable();
        testReadBeforeAssign();
        testLateVarAllowsRead();
        testIfNarrowingNonNull();
        testNullCoalesceAndAssert();
        testSafeAccessElseSugar();
        testPointerTypeAllowsNull();
        testGenericTypeParamDefaultsNullable();
        testGenericNonNullConstraintRejectsNull();

        testParseFailure();
        System.out.println("[LanguageTests] OK");
    }

    private static void testClassEmpty() {
        Program p = parseOk("class A { }");
        assert p.items.size() == 1;
        assert p.items.get(0) instanceof ClassDecl;
        ClassDecl c = (ClassDecl) p.items.get(0);
        assert "A".equals(c.name.text);
        assert c.members.isEmpty();
        assert c.implementsTypes.isEmpty();
        assert c.typeParameters == null;

        CgProgram cg = lowerOk(p);
        assert hasFn(cg, "__type$A");
        assert hasFn(cg, AstToCgir.ENTRY);
        assert entryIsStub(cg);
    }

    private static void testClassFields() {
        Program p = parseOk("class A { var x: int64; const y: int64; pointer p: int64; }");
        ClassDecl c = (ClassDecl) p.items.get(0);
        assert c.members.size() == 3;

        FieldDecl fx = (FieldDecl) c.members.get(0);
        assert fx.kind == FieldDecl.Kind.VAR;
        assert "x".equals(fx.name.text);
        assert fx.type != null;
        assert "int64".equals(asPrimitive(fx.type).name);

        FieldDecl fy = (FieldDecl) c.members.get(1);
        assert fy.kind == FieldDecl.Kind.CONST;
        assert "y".equals(fy.name.text);

        FieldDecl fp = (FieldDecl) c.members.get(2);
        assert fp.kind == FieldDecl.Kind.POINTER;
        assert "p".equals(fp.name.text);

        CgProgram cg = lowerOk(p);
        assert hasFn(cg, "__field$A$x");
        assert hasFn(cg, "__field$A$y");
        assert hasFn(cg, "__field$A$p");
    }

    private static void testClassMethods() {
        Program p = parseOk("class A { function f(x: int64): int64; function g(): int64 { } }");
        ClassDecl c = (ClassDecl) p.items.get(0);
        assert c.members.size() == 2;

        MethodDecl f = (MethodDecl) c.members.get(0);
        assert "f".equals(f.name.text);
        assert f.params.size() == 1;
        assert "x".equals(f.params.get(0).name.text);
        assert "int64".equals(asPrimitive(f.params.get(0).type).name);
        assert f.retType != null && "int64".equals(asPrimitive(f.retType).name);
        assert !f.hasBodyBlock;

        MethodDecl g = (MethodDecl) c.members.get(1);
        assert "g".equals(g.name.text);
        assert g.params.isEmpty();
        assert g.retType != null && "int64".equals(asPrimitive(g.retType).name);
        assert g.hasBodyBlock;

        CgProgram cg = lowerOk(p);
        assert hasFn(cg, "__method$A$f");
        assert hasFn(cg, "__method$A$g");
    }

    private static void testInterfaceEmpty() {
        Program p = parseOk("interface I { }");
        assert p.items.size() == 1;
        assert p.items.get(0) instanceof InterfaceDecl;
        InterfaceDecl i = (InterfaceDecl) p.items.get(0);
        assert "I".equals(i.name.text);
        assert i.methods.isEmpty();
        assert i.typeParameters == null;
        assert i.extendsTypes.isEmpty();

        CgProgram cg = lowerOk(p);
        assert hasFn(cg, "__iface$I");
        assert entryIsStub(cg);
    }

    private static void testInterfaceMethods() {
        Program p = parseOk("interface I { function a(): int64; function b(x: int64): int64; }");
        InterfaceDecl i = (InterfaceDecl) p.items.get(0);
        assert i.methods.size() == 2;
        assert "a".equals(i.methods.get(0).name.text);
        assert "b".equals(i.methods.get(1).name.text);

        CgProgram cg = lowerOk(p);
        assert hasFn(cg, "__ifaceMethod$I$a");
        assert hasFn(cg, "__ifaceMethod$I$b");
    }

    private static void testClassImplementsInterface() {
        String src = "interface I { function f(): int64; }\n" +
                "class C implements I { function f(): int64; }";
        Program p = parseOk(src);
        assert p.items.size() == 2;
        assert p.items.get(0) instanceof InterfaceDecl;
        assert p.items.get(1) instanceof ClassDecl;

        ClassDecl c = (ClassDecl) p.items.get(1);
        assert "C".equals(c.name.text);
        assert c.implementsTypes.size() == 1;
        assert "I".equals(asIdentifier(c.implementsTypes.get(0)).name);

        CgProgram cg = lowerOk(p);
        assert hasFn(cg, "__implements$C$I");
        assert hasFn(cg, "__iface$I");
        assert hasFn(cg, "__type$C");
    }

    private static void testParseFailure() {
        parseErr("class { }");
        parseErr("interface I { function f(): int64 }"); // missing ';'
        parseErr("class Box<T { }"); // missing '>'
    }

    // ----------------------- v0.0.04：类型系统/空安全/赋值/控制流 -----------------------

    private static void testVarNullabilityOk() {
        // 默认非空：Int；可空：Int?
        Program p = parseOk(
                "function f() {\n" +
                "  var a: Int = 1;\n" +
                "  var b: Int? = null;\n" +
                "}"
        );

        FunctionDecl f = firstFunction(p);
        assert f.bodyAst != null;
        assert f.bodyAst.stmts.size() == 2;
        assert f.bodyAst.stmts.get(0) instanceof VarDeclStmt;
        VarDeclStmt a = (VarDeclStmt) f.bodyAst.stmts.get(0);
        assert !isNullableType(a.type) : "a should be non-null type";
        VarDeclStmt b = (VarDeclStmt) f.bodyAst.stmts.get(1);
        assert isNullableType(b.type) : "b should be nullable type";
        assert b.initializer instanceof NullLitExpr;
    }

    private static void testNullOnlyAssignableToNullable() {
        // null 只能赋给 T?（这里 Int 为 non-null）
        expectError(
                "function f() { var c: Int = null; }",
                ErrorCode.NULLABILITY_MISMATCH
        );
    }

    private static void testReadBeforeAssign() {
        // definite assignment：首次读取前必须在所有路径赋值
        expectError(
                "function f() { var x: Int; print(x); }",
                ErrorCode.READ_BEFORE_ASSIGN
        );
    }

    private static void testLateVarAllowsRead() {
        // late：允许声明时不初始化；读取未初始化应是运行时错误（本阶段不报编译错）
        Program p = parseOk("function f() { late var x: Int; print(x); }");
        FunctionDecl f = firstFunction(p);
        VarDeclStmt x = (VarDeclStmt) f.bodyAst.stmts.get(0);
        assert x.isLate;
        assert x.initializer == null;
    }

    private static void testIfNarrowingNonNull() {
        // if (x != null) then 分支收窄：允许把 x 视为 non-null
        Program p = parseOk(
                "function f() {\n" +
                "  var a: Int? = null;\n" +
                "  if (a != null) {\n" +
                "    var b: Int = a;\n" +
                "  }\n" +
                "}"
        );
        // 结构断言：IfStmt + BinaryExpr(NE) + then 内 VarDeclStmt
        FunctionDecl f = firstFunction(p);
        assert f.bodyAst.stmts.get(1) instanceof IfStmt;
        IfStmt ifs = (IfStmt) f.bodyAst.stmts.get(1);
        assert ifs.condition instanceof BinaryExpr;
        assert ((BinaryExpr) ifs.condition).op == BinaryExpr.Op.NE;
        assert ifs.thenBlock.stmts.get(0) instanceof VarDeclStmt;
    }

    private static void testNullCoalesceAndAssert() {
        // x ?? y：若 x 为 null，则返回 y；否则返回 x
        // x!：运行时断言非空，语义层把类型收窄为 non-null
        Program p = parseOk(
                "function f() {\n" +
                "  var a: Int? = null;\n" +
                "  var x: Int = (a ?? 3)!;\n" +
                "}"
        );

        FunctionDecl f = firstFunction(p);
        VarDeclStmt x = (VarDeclStmt) f.bodyAst.stmts.get(1);
        assert x.initializer instanceof NotNullAssertExpr;
        NotNullAssertExpr nn = (NotNullAssertExpr) x.initializer;
        assert nn.base instanceof NullCoalesceExpr;
    }

    private static void testSafeAccessElseSugar() {
        // a?.b else 7  ≡ (a?.b) ?? 7
        Program p = parseOk(
                "function f() {\n" +
                "  var a: Int? = null;\n" +
                "  var x: Int = a?.b else 7;\n" +
                "}"
        );
        FunctionDecl f = firstFunction(p);
        VarDeclStmt x = (VarDeclStmt) f.bodyAst.stmts.get(1);
        assert x.initializer instanceof NullCoalesceExpr;
        NullCoalesceExpr nc = (NullCoalesceExpr) x.initializer;
        assert nc.left instanceof MemberAccessExpr;
        assert ((MemberAccessExpr) nc.left).isSafe;
    }

    private static void testPointerTypeAllowsNull() {
        // *T：FFI/raw pointer，默认可为 null
        Program p = parseOk(
                "function f() {\n" +
                "  var p: *Int = null;\n" +
                "}"
        );
        FunctionDecl f = firstFunction(p);
        VarDeclStmt vd = (VarDeclStmt) f.bodyAst.stmts.get(0);
        assert isPointerType(vd.type);
        assert vd.initializer instanceof NullLitExpr;
    }

    private static void testGenericTypeParamDefaultsNullable() {
        // 路线A：T 默认允许可空实例化，因此在函数体内视为“可能为 null”
        Program p = parseOk(
                "function f<T>(x: T) {\n" +
                "  var y: T = null;\n" +
                "}"
        );
        FunctionDecl f = firstFunction(p);
        assert f.typeParameters != null && f.typeParameters.params.size() == 1;
        assert f.whereClause == null;
        VarDeclStmt y = (VarDeclStmt) f.bodyAst.stmts.get(0);
        assert y.initializer instanceof NullLitExpr;
    }

    private static void testGenericNonNullConstraintRejectsNull() {
        // where T is NonNull：T 不能实例化为 U?；函数体内按非空对待
        // 因此 var y: T = null 应报错
        expectError(
                "function f<T>(x: T) where T is NonNull { var y: T = null; }",
                ErrorCode.NULLABILITY_MISMATCH
        );
    }

    private static void testGenericClassTypeParams() {
        Program p = parseOk("class Box<T> { var value: T; }");
        ClassDecl c = (ClassDecl) p.items.get(0);
        assert c.typeParameters != null;
        assert c.typeParameters.params.size() == 1;
        assert "T".equals(c.typeParameters.params.get(0).name);

        FieldDecl f = (FieldDecl) c.members.get(0);
        TypeAtomBase.Identifier id = asIdentifier(f.type);
        assert "T".equals(id.name);
    }

    private static void testGenericTypeArgumentsInField() {
        Program p = parseOk("class A { var xs: List<int32>; }");
        ClassDecl c = (ClassDecl) p.items.get(0);
        FieldDecl f = (FieldDecl) c.members.get(0);
        TypeAtomBase.Identifier id = asIdentifier(f.type);
        assert "List".equals(id.name);
        assert id.typeArgs != null;
        assert id.typeArgs.args.size() == 1;
        assert id.typeArgs.args.get(0) instanceof TypeArgument.Type;
        TypeExpr inner = ((TypeArgument.Type) id.typeArgs.args.get(0)).type;
        assert "int32".equals(asPrimitive(inner).name);
    }

    private static void testGenericImplementsTypeArguments() {
        String src = "interface I<T> { function f(x: T): T; }\n" +
                "class C implements I<int32> { function f(x: int32): int32; }";
        Program p = parseOk(src);
        ClassDecl c = (ClassDecl) p.items.get(1);
        assert c.implementsTypes.size() == 1;
        TypeAtomBase.Identifier id = asIdentifier(c.implementsTypes.get(0));
        assert "I".equals(id.name);
        assert id.typeArgs != null && id.typeArgs.args.size() == 1;
        TypeExpr inner = ((TypeArgument.Type) id.typeArgs.args.get(0)).type;
        assert "int32".equals(asPrimitive(inner).name);

        CgProgram cg = lowerOk(p);
        assert hasFn(cg, "__implements$C$I$int32");
    }

    private static void testEnumBasics() {
        Program p = parseOk("enum Color { Red, Green, Blue }");
        assert p.items.size() == 1;
        assert p.items.get(0) instanceof EnumDecl;
        EnumDecl e = (EnumDecl) p.items.get(0);
        assert "Color".equals(e.name.text);
        assert e.constants.size() == 3;
        assert "Red".equals(e.constants.get(0).name.text);
        assert "Green".equals(e.constants.get(1).name.text);
        assert "Blue".equals(e.constants.get(2).name.text);

        CgProgram cg = lowerOk(p);
        assert hasFn(cg, "__enum$Color");
        assert hasFn(cg, "__enumConst$Color$Red");
        assert hasFn(cg, "__enumConst$Color$Green");
        assert hasFn(cg, "__enumConst$Color$Blue");
    }

    private static void testEnumBodyDeclarations() {
        String src = "enum E { A; var x: int32; function f(a: int32): int32; }";
        Program p = parseOk(src);
        EnumDecl e = (EnumDecl) p.items.get(0);
        assert e.constants.size() == 1;
        assert "A".equals(e.constants.get(0).name.text);
        assert e.bodyMembers.size() == 2;
        assert e.bodyMembers.get(0) instanceof FieldDecl;
        assert e.bodyMembers.get(1) instanceof MethodDecl;

        CgProgram cg = lowerOk(p);
        assert hasFn(cg, "__enum$E");
        assert hasFn(cg, "__enumField$E$x");
        assert hasFn(cg, "__enumMethod$E$f");
    }

    // ----------------------- helpers -----------------------

    private static Program parseOk(String src) {
        DiagnosticSink diag = new DiagnosticSink();
        ParseResult r = new ParseFacade().parse(src, diag);
        assert !diag.hasErrors() : render(diag);
        return r.program;
    }

    private static void expectError(String src, ErrorCode code) {
        DiagnosticSink diag = new DiagnosticSink();
        new ParseFacade().parse(src, diag);
        assert diag.hasErrors() : "expected error: " + code;
        boolean ok = false;
        for (Diagnostic d : diag.all()) {
            if (d.code == code) {
                ok = true;
                break;
            }
        }
        assert ok : "expected error code " + code + " but got:\n" + render(diag);
    }

    private static void parseErr(String src) {
        DiagnosticSink diag = new DiagnosticSink();
        new ParseFacade().parse(src, diag);
        assert diag.hasErrors() : "expected parse error but got none";
    }

    private static CgProgram lowerOk(Program p) {
        DiagnosticSink diag = new DiagnosticSink();
        CgProgram cg = new AstToCgir().lower(p, diag);
        assert !diag.hasErrors() : render(diag);
        return cg;
    }

    private static boolean hasFn(CgProgram cg, String name) {
        for (CgFunction f : cg.functions) {
            if (name.equals(f.name)) return true;
        }
        return false;
    }

    private static boolean entryIsStub(CgProgram cg) {
        for (CgFunction f : cg.functions) {
            if (AstToCgir.ENTRY.equals(f.name)) {
                return f.body.size() == 1 && (f.body.get(0) instanceof CgInst.RetVoid);
            }
        }
        return false;
    }

    private static String render(DiagnosticSink diag) {
        List<String> lines = new ArrayList<>();
        for (Diagnostic d : diag.all()) {
            lines.add(d.renderOneLine());
        }
        return String.join("\n", lines);
    }

    // ----------------------- type helpers (断言结构，不用 split/regex) -----------------------

    private static TypeAtomBase.Primitive asPrimitive(TypeRef ref) {
        return asPrimitive(ref.expr);
    }

    private static TypeAtomBase.Primitive asPrimitive(TypeExpr expr) {
        assert expr != null && expr.alts.size() == 1;
        TypePostfix p = expr.alts.get(0);
        assert p.atom != null && p.atom.base instanceof TypeAtomBase.Primitive;
        return (TypeAtomBase.Primitive) p.atom.base;
    }

    private static TypeAtomBase.Identifier asIdentifier(TypeRef ref) {
        assert ref != null && ref.expr != null && ref.expr.alts.size() == 1;
        TypePostfix p = ref.expr.alts.get(0);
        assert p.atom != null && p.atom.base instanceof TypeAtomBase.Identifier;
        return (TypeAtomBase.Identifier) p.atom.base;
    }

    private static FunctionDecl firstFunction(Program p) {
        for (Item it : p.items) {
            if (it instanceof FunctionDecl) return (FunctionDecl) it;
        }
        throw new AssertionError("expected a top-level function");
    }

    private static boolean isNullableType(TypeRef ref) {
        assert ref != null && ref.expr != null && ref.expr.alts.size() == 1;
        TypePostfix p = ref.expr.alts.get(0);
        return p.qualifiers.contains(TypeQualifierKind.NULLABLE);
    }

    private static boolean isPointerType(TypeRef ref) {
        assert ref != null && ref.expr != null && ref.expr.alts.size() == 1;
        TypePostfix p = ref.expr.alts.get(0);
        return p.atom != null && p.atom.prefixText != null && p.atom.prefixText.contains("*");
    }
}
