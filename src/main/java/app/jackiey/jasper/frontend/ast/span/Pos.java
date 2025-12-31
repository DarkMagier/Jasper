package app.jackiey.jasper.frontend.ast.span;

public final class Pos {
    public final int index; // 0-based byte/char index in source (future: line/col mapping)

    public Pos(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return String.valueOf(index);
    }
}
