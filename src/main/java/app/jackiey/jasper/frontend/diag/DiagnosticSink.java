package app.jackiey.jasper.frontend.diag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DiagnosticSink {
    private final List<Diagnostic> list = new ArrayList<>();

    public void error(ErrorCode code, String message) {
        list.add(new Diagnostic(Diagnostic.Severity.ERROR, code, message, null));
    }

    public void error(ErrorCode code, String message, app.jackiey.jasper.frontend.ast.span.Span span) {
        list.add(new Diagnostic(Diagnostic.Severity.ERROR, code, message, span));
    }

    public boolean hasErrors() {
        for (Diagnostic d : list) if (d.severity == Diagnostic.Severity.ERROR) return true;
        return false;
    }

    public List<Diagnostic> all() {
        return Collections.unmodifiableList(list);
    }
}
