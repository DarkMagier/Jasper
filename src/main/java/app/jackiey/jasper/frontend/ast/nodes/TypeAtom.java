package app.jackiey.jasper.frontend.ast.nodes;

import java.util.Collections;
import java.util.List;

/**
 * 对应 grammar: typeAtom
 *   typePrefix? typeSoftModifier* typeAtomBase
 */
public final class TypeAtom {
    /** 前缀（例如 '*', '**', '&', '&&'），没有则为 null */
    public final String prefixText;
    /** soft modifier（目前 grammar 约束只允许 raw/shared） */
    public final List<String> softModifiers;
    public final TypeAtomBase base;

    public TypeAtom(String prefixText, List<String> softModifiers, TypeAtomBase base) {
        this.prefixText = prefixText;
        this.softModifiers = softModifiers == null ? Collections.<String>emptyList() : Collections.unmodifiableList(softModifiers);
        this.base = base;
    }

    public String toDebugString() {
        StringBuilder sb = new StringBuilder();
        if (prefixText != null) sb.append(prefixText);
        for (String sm : softModifiers) sb.append(sm).append(" ");
        sb.append(base == null ? "<null-base>" : base.toDebugString());
        return sb.toString();
    }
}
