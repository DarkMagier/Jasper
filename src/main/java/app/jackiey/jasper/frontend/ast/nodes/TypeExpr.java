package app.jackiey.jasper.frontend.ast.nodes;

import java.util.Collections;
import java.util.List;

/**
 * 对应 grammar: typeExpr
 *
 *   typePostfix ( (PIPE | FULLWIDTH_PIPE) typePostfix )*
 *
 * 这里把 union 的每个分支保存为 TypePostfix。
 */
public final class TypeExpr {
    /** union 分支（至少 1 个） */
    public final List<TypePostfix> alts;

    public TypeExpr(List<TypePostfix> alts) {
        this.alts = alts == null ? Collections.<TypePostfix>emptyList() : Collections.unmodifiableList(alts);
    }

    public String toDebugString() {
        if (alts.isEmpty()) return "<empty-type>";
        if (alts.size() == 1) return alts.get(0).toDebugString();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alts.size(); i++) {
            if (i > 0) sb.append("|");
            sb.append(alts.get(i).toDebugString());
        }
        return sb.toString();
    }
}
