package app.jackiey.jasper.frontend.ast.nodes;

import java.util.Collections;
import java.util.List;

/** 对应 grammar: typeParameters '<' typeParameter (',' typeParameter)* '>' */
public final class TypeParameters {
    public final List<TypeParameter> params;

    public TypeParameters(List<TypeParameter> params) {
        this.params = params == null ? Collections.<TypeParameter>emptyList() : Collections.unmodifiableList(params);
    }

    public String toDebugString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < params.size(); i++) {
            if (i > 0) sb.append(",");
            sb.append(params.get(i).toDebugString());
        }
        sb.append(">");
        return sb.toString();
    }
}
