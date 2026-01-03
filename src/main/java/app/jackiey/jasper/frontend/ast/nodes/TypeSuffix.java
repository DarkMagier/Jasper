package app.jackiey.jasper.frontend.ast.nodes;

/** typeSuffix 的结构化节点。 */
public interface TypeSuffix {
    String toDebugString();

    /** .Name<...> */
    final class Dot implements TypeSuffix {
        public final String name;
        public final TypeArguments typeArgs; // may be null

        public Dot(String name, TypeArguments typeArgs) {
            this.name = name;
            this.typeArgs = typeArgs;
        }

        @Override
        public String toDebugString() {
            return "." + name + (typeArgs == null ? "" : typeArgs.toDebugString());
        }
    }

    /** [] */
    final class Array implements TypeSuffix {
        @Override
        public String toDebugString() {
            return "[]";
        }
    }
}
