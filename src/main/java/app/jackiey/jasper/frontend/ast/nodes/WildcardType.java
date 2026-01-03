package app.jackiey.jasper.frontend.ast.nodes;

/** wildcard: '?' ((Extends|Super) typeExpr)? */
public final class WildcardType {
    public enum BoundKind { EXTENDS, SUPER }

    public final BoundKind boundKind; // may be null
    public final TypeExpr bound; // may be null

    public WildcardType(BoundKind boundKind, TypeExpr bound) {
        this.boundKind = boundKind;
        this.bound = bound;
    }

    public String toDebugString() {
        if (boundKind == null || bound == null) return "?";
        return "? " + (boundKind == BoundKind.EXTENDS ? "extends" : "super") + " " + bound.toDebugString();
    }
}
