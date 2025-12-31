package app.jackiey.jasper.frontend.ast.span;

public final class Span {
    public final Pos start;
    public final Pos end;

    public Span(Pos start, Pos end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return start + ".." + end;
    }
}
