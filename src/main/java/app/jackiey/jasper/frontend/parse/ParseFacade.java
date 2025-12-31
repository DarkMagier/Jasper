package app.jackiey.jasper.frontend.parse;

import app.jackiey.jasper.frontend.ast.nodes.*;
import app.jackiey.jasper.frontend.ast.span.Pos;
import app.jackiey.jasper.frontend.ast.span.Span;
import app.jackiey.jasper.frontend.diag.DiagnosticSink;
import app.jackiey.jasper.frontend.diag.ErrorCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Stub parser for today's goal:
 *   fn foo(a:int64, b:int64) { print(a,b,a+b); }
 *   foo(1,2)
 *
 * Notes:
 * - only supports exactly one function decl + one call stmt
 * - types: only int64
 * - print body pattern must be exactly: print(a,b,a+b)
 */
public final class ParseFacade {

    public ParseResult parse(String source, DiagnosticSink diag) {
        if (source == null) source = "";
        TokenStream ts = new TokenStream(source);

        List<Item> items = new ArrayList<>();

        // parse: fn foo(...) { print(a,b,a+b); }
        if (!ts.peekIs("fn")) {
            diag.error(ErrorCode.PARSE_ERROR, "Expected 'fn' at beginning");
            return new ParseResult(new Program(Collections.<Item>emptyList()));
        }
        ts.expect("fn", diag);

        String fnName = ts.expectIdent(diag);
        ts.expect("(", diag);

        // param1
        String p1 = ts.expectIdent(diag);
        ts.expect(":", diag);
        String t1 = ts.expectIdent(diag);

        ts.expect(",", diag);

        // param2
        String p2 = ts.expectIdent(diag);
        ts.expect(":", diag);
        String t2 = ts.expectIdent(diag);

        ts.expect(")", diag);
        ts.expect("{", diag);

        // body: print ( a , b , a + b ) ;
        ts.expect("print", diag);
        ts.expect("(", diag);
        String a1 = ts.expectIdent(diag);
        ts.expect(",", diag);
        String b1 = ts.expectIdent(diag);
        ts.expect(",", diag);
        String a2 = ts.expectIdent(diag);
        ts.expect("+", diag);
        String b2 = ts.expectIdent(diag);
        ts.expect(")", diag);
        ts.optional(";", diag);
        ts.expect("}", diag);

        boolean bodyOk = a1.equals(p1) && b1.equals(p2) && a2.equals(p1) && b2.equals(p2);
        if (!"int64".equals(t1) || !"int64".equals(t2)) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "Only supports int64 params today");
            return new ParseResult(new Program(Collections.<Item>emptyList()));
        }
        if (!bodyOk) {
            diag.error(ErrorCode.UNSUPPORTED_SYNTAX, "Body must be exactly: print(a,b,a+b)");
            return new ParseResult(new Program(Collections.<Item>emptyList()));
        }

        Span fnSpan = new Span(new Pos(0), new Pos(Math.max(0, ts.index())));
        Identifier id = new Identifier(fnName, fnSpan);
        List<FunctionDecl.Param> params = new ArrayList<>();
        params.add(new FunctionDecl.Param(p1, t1));
        params.add(new FunctionDecl.Param(p2, t2));
        items.add(new FunctionDecl(id, params, true, fnSpan));

        // parse call: foo(1,2)
        String callName = ts.expectIdent(diag);
        ts.expect("(", diag);
        long n1 = ts.expectInt64(diag);
        ts.expect(",", diag);
        long n2 = ts.expectInt64(diag);
        ts.expect(")", diag);
        ts.optional(";", diag);
        ts.expectEof(diag);

        Span callSpan = new Span(new Pos(0), new Pos(source.length()));
        CallExpr call = new CallExpr(new Identifier(callName, callSpan),
                java.util.Arrays.<Expr>asList(new IntLitExpr(n1, callSpan), new IntLitExpr(n2, callSpan)),
                callSpan);
        items.add(new StmtItem(new ExprStmt(call, callSpan)));

        return new ParseResult(new Program(items));
    }

    // ---------------- tiny tokenizer ----------------

    static final class TokenStream {
        private final String s;
        private int i;

        TokenStream(String s) { this.s = s; this.i = 0; }

        int index() { return i; }

        boolean peekIs(String t) {
            skipWs();
            if (t.length() == 1 && isPunct(t.charAt(0))) {
                return i < s.length() && s.charAt(i) == t.charAt(0);
            }
            int j = i;
            String w = readWord(j);
            return t.equals(w);
        }

        void expect(String t, DiagnosticSink diag) {
            skipWs();
            if (t.length() == 1 && isPunct(t.charAt(0))) {
                if (i < s.length() && s.charAt(i) == t.charAt(0)) { i++; return; }
                diag.error(ErrorCode.PARSE_ERROR, "Expected '" + t + "'");
                return;
            }
            String w = readWord(i);
            if (t.equals(w)) { i += w.length(); return; }
            diag.error(ErrorCode.PARSE_ERROR, "Expected '" + t + "'");
        }

        void optional(String t, DiagnosticSink diag) {
            skipWs();
            if (t.length() == 1 && isPunct(t.charAt(0))) {
                if (i < s.length() && s.charAt(i) == t.charAt(0)) i++;
                return;
            }
            String w = readWord(i);
            if (t.equals(w)) i += w.length();
        }

        String expectIdent(DiagnosticSink diag) {
            skipWs();
            String w = readWord(i);
            if (w == null || w.isEmpty()) {
                diag.error(ErrorCode.PARSE_ERROR, "Expected identifier");
                return "";
            }
            if (!isIdent(w)) {
                diag.error(ErrorCode.PARSE_ERROR, "Invalid identifier: " + w);
                return "";
            }
            i += w.length();
            return w;
        }

        long expectInt64(DiagnosticSink diag) {
            skipWs();
            int j = i;
            boolean neg = false;
            if (j < s.length() && s.charAt(j) == '-') { neg = true; j++; }
            int start = j;
            while (j < s.length() && Character.isDigit(s.charAt(j))) j++;
            if (start == j) {
                diag.error(ErrorCode.PARSE_ERROR, "Expected int64 literal");
                return 0;
            }
            String num = s.substring(i, j);
            i = j;
            try {
                return Long.parseLong(num);
            } catch (NumberFormatException e) {
                diag.error(ErrorCode.PARSE_ERROR, "Bad int64 literal: " + num);
                return 0;
            }
        }

        void expectEof(DiagnosticSink diag) {
            skipWs();
            if (i != s.length()) {
                diag.error(ErrorCode.PARSE_ERROR, "Unexpected trailing input at " + i);
            }
        }

        private void skipWs() {
            while (i < s.length()) {
                char c = s.charAt(i);
                if (Character.isWhitespace(c)) { i++; continue; }
                break;
            }
        }

        private String readWord(int from) {
            if (from >= s.length()) return "";
            char c0 = s.charAt(from);
            if (isPunct(c0)) return String.valueOf(c0);
            int j = from;
            while (j < s.length()) {
                char c = s.charAt(j);
                if (Character.isLetterOrDigit(c) || c == '_' ) { j++; continue; }
                break;
            }
            return s.substring(from, j);
        }

        private boolean isPunct(char c) {
            return c=='('||c==')'||c=='{'||c=='}'||c==':'||c==','||c=='+'||c==';';
        }

        private boolean isIdent(String w) {
            if (w.isEmpty()) return false;
            char c0 = w.charAt(0);
            if (!(Character.isLetter(c0) || c0 == '_')) return false;
            for (int k=1;k<w.length();k++) {
                char c = w.charAt(k);
                if (!(Character.isLetterOrDigit(c) || c == '_')) return false;
            }
            return true;
        }
    }
}
