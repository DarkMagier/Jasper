package app.jackiey.jasper.frontend.parse;

import app.jackiey.jasper.frontend.ast.nodes.Program;
import app.jackiey.jasper.frontend.diag.DiagnosticSink;
import app.jackiey.jasper.frontend.parse.antlr.AntlrDiagnosticListener;
import app.jackiey.jasper.frontend.parse.antlr.AstBuilder;
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
        return new ParseResult(program);
    }
}
