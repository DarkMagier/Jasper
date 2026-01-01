package app.jackiey.jasper.frontend.parse.antlr;

import app.jackiey.jasper.frontend.ast.span.Pos;
import app.jackiey.jasper.frontend.ast.span.Span;
import app.jackiey.jasper.frontend.diag.DiagnosticSink;
import app.jackiey.jasper.frontend.diag.ErrorCode;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

/**
 * Converts ANTLR syntax errors into Jasper diagnostics.
 *
 * We currently map line/column into a best-effort Span (0..0) because the project
 * uses an index-based Pos; once you wire SourceMap, replace this with precise mapping.
 */
public final class AntlrDiagnosticListener extends BaseErrorListener {
    private final DiagnosticSink diag;

    public AntlrDiagnosticListener(DiagnosticSink diag) {
        this.diag = diag;
    }

    @Override
    public void syntaxError(
            Recognizer<?, ?> recognizer,
            Object offendingSymbol,
            int line,
            int charPositionInLine,
            String msg,
            RecognitionException e
    ) {
        Span span = null;
        if (offendingSymbol instanceof Token) {
            Token t = (Token) offendingSymbol;
            int start = Math.max(0, t.getStartIndex());
            int end = Math.max(start, t.getStopIndex() + 1);
            span = new Span(new Pos(start), new Pos(end));
        }
        diag.error(ErrorCode.PARSE_ERROR, "syntax error at " + line + ":" + charPositionInLine + ": " + msg, span);
    }
}
