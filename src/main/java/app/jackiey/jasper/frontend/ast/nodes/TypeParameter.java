package app.jackiey.jasper.frontend.ast.nodes;

/** typeParameter: modifier* Identifier typeBound? */
public final class TypeParameter {
    public final String name;
    public final TypeBound bound; // may be null

    public TypeParameter(String name, TypeBound bound) {
        this.name = name;
        this.bound = bound;
    }

    public String toDebugString() {
        return name + (bound == null ? "" : (" " + bound.toDebugString()));
    }
}
