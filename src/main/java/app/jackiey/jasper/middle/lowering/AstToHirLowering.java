package app.jackiey.jasper.middle.lowering;

import app.jackiey.jasper.middle.checker.AstChecker;
import app.jackiey.jasper.middle.hir.*;

import java.util.Arrays;

/**
 * Lowering: AST -> HIR.
 *
 * Today the parser+checker only allow a single shape, so HIR mainly
 * extracts the call constants and freezes a "supported body" marker.
 */
public final class AstToHirLowering {

    public HirProgram lower(AstChecker.CheckedProgram checked) {
        HirFunction foo = new HirFunction(
                "foo",
                Arrays.asList(HirType.INT64, HirType.INT64),
                HirType.VOID,
                true
        );
        return new HirProgram(foo, checked.callA, checked.callB);
    }
}
