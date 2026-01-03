package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

/**
 * if (cond) { ... } else { ... }
 *
 * 说明：Jasper 语法层强制 block，因此 then/else 都是 BlockStmt 或嵌套 IfStmt。
 */
public final class IfStmt implements Stmt {
    public final Expr condition;
    public final BlockStmt thenBlock;
    /** else 可能为 null；或 block；或 else-if（IfStmt）。 */
    public final Stmt elseBranch;
    private final Span span;

    public IfStmt(Expr condition, BlockStmt thenBlock, Stmt elseBranch, Span span) {
        this.condition = condition;
        this.thenBlock = thenBlock;
        this.elseBranch = elseBranch;
        this.span = span;
    }

    @Override
    public Span span() {
        return span;
    }
}