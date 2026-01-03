package app.jackiey.jasper.frontend.ast.nodes;

/** 对应 grammar: typeArgument (typeExpr | wildcard) */
public interface TypeArgument {
    String toDebugString();

    /** 具体类型参数 */
    final class Type implements TypeArgument {
        public final TypeExpr type;

        public Type(TypeExpr type) {
            this.type = type;
        }

        @Override
        public String toDebugString() {
            return type == null ? "<null>" : type.toDebugString();
        }
    }

    /** 通配符 */
    final class Wildcard implements TypeArgument {
        public final WildcardType wildcard;

        public Wildcard(WildcardType wildcard) {
            this.wildcard = wildcard;
        }

        @Override
        public String toDebugString() {
            return wildcard == null ? "?" : wildcard.toDebugString();
        }
    }
}
