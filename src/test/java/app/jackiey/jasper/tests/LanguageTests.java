package app.jackiey.jasper.tests;

import app.jackiey.jasper.backend.cgir.CgFunction;
import app.jackiey.jasper.backend.cgir.CgInst;
import app.jackiey.jasper.backend.cgir.CgProgram;
import app.jackiey.jasper.backend.lower.AstToCgir;
import app.jackiey.jasper.frontend.ast.nodes.*;
import app.jackiey.jasper.frontend.diag.Diagnostic;
import app.jackiey.jasper.frontend.diag.DiagnosticSink;
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
        assert fx.type != null && "int64".equals(fx.type.text);

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
        assert "int64".equals(f.params.get(0).type.text);
        assert f.retType != null && "int64".equals(f.retType.text);
        assert !f.hasBodyBlock;

        MethodDecl g = (MethodDecl) c.members.get(1);
        assert "g".equals(g.name.text);
        assert g.params.isEmpty();
        assert g.retType != null && "int64".equals(g.retType.text);
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
        assert "I".equals(c.implementsTypes.get(0).text);

        CgProgram cg = lowerOk(p);
        assert hasFn(cg, "__implements$C$I");
        assert hasFn(cg, "__iface$I");
        assert hasFn(cg, "__type$C");
    }

    private static void testParseFailure() {
        parseErr("class { }");
        parseErr("interface I { function f(): int64 }"); // missing ';'
    }

    // ----------------------- helpers -----------------------

    private static Program parseOk(String src) {
        DiagnosticSink diag = new DiagnosticSink();
        ParseResult r = new ParseFacade().parse(src, diag);
        assert !diag.hasErrors() : render(diag);
        return r.program;
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
}
