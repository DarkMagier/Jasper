package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

public final class Identifier {
    public final String text;
    public final Span span;

    public Identifier(String text, Span span) {
        this.text = text;
        this.span = span;
    }
}
