package app.jackiey.jasper.frontend.ast.nodes;

import java.util.Collections;
import java.util.List;

/**
 * 对应 grammar: typePostfix
 *   typeAtom typeSuffix* typeQualifier*
 */
public final class TypePostfix {
    public final TypeAtom atom;
    public final List<TypeSuffix> suffixes;
    public final List<TypeQualifierKind> qualifiers;

    public TypePostfix(TypeAtom atom, List<TypeSuffix> suffixes, List<TypeQualifierKind> qualifiers) {
        this.atom = atom;
        this.suffixes = suffixes == null ? Collections.<TypeSuffix>emptyList() : Collections.unmodifiableList(suffixes);
        this.qualifiers = qualifiers == null ? Collections.<TypeQualifierKind>emptyList() : Collections.unmodifiableList(qualifiers);
    }

    public String toDebugString() {
        StringBuilder sb = new StringBuilder();
        sb.append(atom == null ? "<null-atom>" : atom.toDebugString());
        for (TypeSuffix s : suffixes) sb.append(s.toDebugString());
        for (TypeQualifierKind q : qualifiers) {
            switch (q) {
                case NULLABLE:
                    sb.append("?");
                    break;
                case NON_NULL:
                    sb.append("!");
                    break;
                case NULL_COALESCE:
                    sb.append("??");
                    break;
            }
        }
        return sb.toString();
    }
}
