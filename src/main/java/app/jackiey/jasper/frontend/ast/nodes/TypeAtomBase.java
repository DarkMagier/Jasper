package app.jackiey.jasper.frontend.ast.nodes;

import java.util.Collections;
import java.util.List;

/** typeAtomBase 的结构化节点。 */
public interface TypeAtomBase {
    String toDebugString();

    /** primitiveType / 内建关键字类型（String/Bytes/Any/Unit/Regex） */
    final class Primitive implements TypeAtomBase {
        public final String name;

        public Primitive(String name) {
            this.name = name;
        }

        @Override
        public String toDebugString() {
            return name;
        }
    }

    /** Identifier typeArguments? */
    final class Identifier implements TypeAtomBase {
        public final String name;
        public final TypeArguments typeArgs; // may be null

        public Identifier(String name, TypeArguments typeArgs) {
            this.name = name;
            this.typeArgs = typeArgs;
        }

        @Override
        public String toDebugString() {
            return name + (typeArgs == null ? "" : typeArgs.toDebugString());
        }
    }

    /** (typeExpr, typeExpr, ...) */
    final class Tuple implements TypeAtomBase {
        public final List<TypeExpr> elements;

        public Tuple(List<TypeExpr> elements) {
            this.elements = elements == null ? Collections.<TypeExpr>emptyList() : Collections.unmodifiableList(elements);
        }

        @Override
        public String toDebugString() {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            for (int i = 0; i < elements.size(); i++) {
                if (i > 0) sb.append(",");
                sb.append(elements.get(i).toDebugString());
            }
            sb.append(")");
            return sb.toString();
        }
    }

    /** (typeExpr) */
    final class Group implements TypeAtomBase {
        public final TypeExpr inner;

        public Group(TypeExpr inner) {
            this.inner = inner;
        }

        @Override
        public String toDebugString() {
            return "(" + (inner == null ? "<null>" : inner.toDebugString()) + ")";
        }
    }
}
