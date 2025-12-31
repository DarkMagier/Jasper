package app.jackiey.jasper.frontend.ast.nodes;

import app.jackiey.jasper.frontend.ast.span.Span;

import java.util.Collections;
import java.util.List;

/**
 * Today's supported form:
 *   fn foo(a:int64, b:int64) { print(a,b,a+b); }
 */
public final class FunctionDecl implements Item {
    public final Identifier name;
    public final List<Param> params;
    public final boolean bodyIsPrintFooPattern;
    public final Span span;

    public FunctionDecl(Identifier name, List<Param> params, boolean bodyIsPrintFooPattern, Span span) {
        this.name = name;
        this.params = params == null ? Collections.<Param>emptyList() : Collections.unmodifiableList(params);
        this.bodyIsPrintFooPattern = bodyIsPrintFooPattern;
        this.span = span;
    }

    public static final class Param {
        public final String name;
        public final String typeName; // today: "int64"
        public Param(String name, String typeName) {
            this.name = name;
            this.typeName = typeName;
        }
    }
}
