package app.jackiey.jasper.middle.mir;

import java.util.Collections;
import java.util.List;

public final class MirProgram {
    public static final String ENTRY = "__entry";

    public final List<MirFunction> functions;

    public MirProgram(List<MirFunction> functions) {
        this.functions = functions == null ? Collections.<MirFunction>emptyList() : Collections.unmodifiableList(functions);
    }

    public MirFunction findFunction(String name) {
        for (MirFunction f : functions) {
            if (f.name.equals(name)) return f;
        }
        return null;
    }
}
