package app.jackiey.jasper.frontend.parse;

import app.jackiey.jasper.frontend.ast.nodes.Program;
import app.jackiey.jasper.frontend.diag.DiagnosticSink;
import app.jackiey.jasper.frontend.parse.antlr.AntlrDiagnosticListener;
import app.jackiey.jasper.frontend.parse.antlr.AstBuilder;
import app.jackiey.jasper.frontend.sema.SemaFacade;
import gen.antlr.jasper.JasperLexer;
import gen.antlr.jasper.JasperParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Frontend entry: Jasper source -> AST.
 *
 * Notes:
 * - The grammar lives under src/main/antlr/grammar.
 * - The ANTLR generated classes are produced by the Maven antlr4 plugin (target/generated-sources/antlr4).
 */
public final class ParseFacade {

    public ParseResult parse(String source, DiagnosticSink diag) {
        JasperLexer lexer = new JasperLexer(CharStreams.fromString(source));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        JasperParser parser = new JasperParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new AntlrDiagnosticListener(diag));

        JasperParser.SourceFileContext tree = parser.sourceFile();
        if (diag.hasErrors()) {
            return new ParseResult(new Program(java.util.Collections.emptyList()));
        }

        Program program = new AstBuilder(tokens, diag).build(tree);

        // v0.0.04：引入最小语义检查（局部变量 definite assignment + 空安全 + where NonNull）。
        // 设计：仅对 FunctionDecl.bodyAst != null 的函数生效；不影响旧用例。
        new SemaFacade().run(program, diag);
        return new ParseResult(program);
    }
}
