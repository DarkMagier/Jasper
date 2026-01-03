package app.jackiey.jasper.frontend.ast.nodes;

import java.util.Collections;
import java.util.List;

/** 对应 grammar: typeArguments '<' typeArgument (',' typeArgument)* '>' */
public final class TypeArguments {
    public final List<TypeArgument> args;

    public TypeArguments(List<TypeArgument> args) {
        this.args = args == null ? Collections.<TypeArgument>emptyList() : Collections.unmodifiableList(args);
    }

    public String toDebugString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < args.size(); i++) {
            if (i > 0) sb.append(",");
            sb.append(args.get(i).toDebugString());
        }
        sb.append(">");
        return sb.toString();
    }
}
