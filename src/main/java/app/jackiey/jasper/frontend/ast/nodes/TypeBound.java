package app.jackiey.jasper.frontend.ast.nodes;

import java.util.Collections;
import java.util.List;

/** typeBound: (Extends|Super) typeExpr ('&' typeExpr)* */
public final class TypeBound {
    public enum Kind { EXTENDS, SUPER }

    public final Kind kind;
    public final List<TypeExpr> bounds;

    public TypeBound(Kind kind, List<TypeExpr> bounds) {
        this.kind = kind;
        this.bounds = bounds == null ? Collections.<TypeExpr>emptyList() : Collections.unmodifiableList(bounds);
    }

    public String toDebugString() {
        StringBuilder sb = new StringBuilder();
        sb.append(kind == Kind.EXTENDS ? "extends" : "super");
        for (int i = 0; i < bounds.size(); i++) {
            sb.append(i == 0 ? " " : " & ");
            sb.append(bounds.get(i).toDebugString());
        }
        return sb.toString();
    }
}
