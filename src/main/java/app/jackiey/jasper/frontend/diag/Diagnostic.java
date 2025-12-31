package app.jackiey.jasper.frontend.diag;

import app.jackiey.jasper.frontend.ast.span.Span;

public final class Diagnostic {
    public final Severity severity;
    public final ErrorCode code;
    public final String message;
    public final Span span; // may be null for now

    public Diagnostic(Severity severity, ErrorCode code, String message, Span span) {
        this.severity = severity;
        this.code = code;
        this.message = message;
        this.span = span;
    }

    public String renderOneLine() {
        String where = (span == null) ? "" : (" @" + span);
        return severity + " " + code + ": " + message + where;
    }

    public enum Severity {
        ERROR,
        WARNING,
        NOTE
    }
}
