package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

import java.util.List;

/**
 * 语句块：{ ... }
 */
public final class BlockStmt implements Stmt {
    public final List<Stmt> stmts;
    private final Span span;

    public BlockStmt(List<Stmt> stmts, Span span) {
        this.stmts = stmts;
        this.span = span;
    }

    @Override
    public Span span() {
        return span;
    }
}
