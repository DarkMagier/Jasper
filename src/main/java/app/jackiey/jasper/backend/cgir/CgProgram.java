package app.jackiey.jasper.backend.cgir;

import java.util.Collections;
import java.util.List;

/**
 * Minimal shared codegen IR (CGIR).
 * Goal: keep ByteBuddy and LLVM backends sharing the same lowering.
 */
public final class CgProgram {
    public final List<CgFunction> functions;

    public CgProgram(List<CgFunction> functions) {
        this.functions = functions == null ? Collections.<CgFunction>emptyList() : Collections.unmodifiableList(functions);
    }

    public CgFunction findFunction(String name) {
        for (CgFunction f : functions) if (f.name.equals(name)) return f;
        return null;
    }
}