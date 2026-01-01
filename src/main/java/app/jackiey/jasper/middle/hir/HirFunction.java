package app.jackiey.jasper.middle.hir;

import java.util.Collections;
import java.util.List;

/**
 * HIR function: still close to the AST.
 *
 * For now we only keep the signature and a single supported body shape:
 *   print(param0, param1, param0 + param1)
 */
public final class HirFunction {
    public final String name;
    public final List<HirType> params;
    public final HirType returnType;

    /** demo body marker */
    public final boolean bodyIsPrintParam0Param1Sum;

    public HirFunction(String name, List<HirType> params, HirType returnType, boolean bodyIsPrintParam0Param1Sum) {
        this.name = name;
        this.params = params == null ? Collections.<HirType>emptyList() : Collections.unmodifiableList(params);
        this.returnType = returnType;
        this.bodyIsPrintParam0Param1Sum = bodyIsPrintParam0Param1Sum;
    }
}
