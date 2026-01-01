package app.jackiey.jasper.middle.lowering;

import app.jackiey.jasper.middle.hir.HirProgram;
import app.jackiey.jasper.middle.mir.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Lowering: HIR -> MIR.
 */
public final class HirToMirLowering {

    public MirProgram lower(HirProgram hir) {
        List<MirFunction> out = new ArrayList<MirFunction>();

        // foo(a:i64, b:i64) { c=a+b; print(a,b,c); }
        // params: r0=a, r1=b
        // temp: r2=sum
        List<MirInstruction> fooBody = new ArrayList<MirInstruction>();
        fooBody.add(new MirInstruction.AddInt64(2, 0, 1));
        fooBody.add(new MirInstruction.PrintInt64Triple(0, 1, 2));
        fooBody.add(new MirInstruction.ReturnVoid());

        MirFunction foo = new MirFunction(
                "foo",
                Arrays.asList(MirType.INT64, MirType.INT64),
                MirType.VOID,
                3,
                fooBody
        );
        out.add(foo);

        // __entry() { r0=callA; r1=callB; call foo(r0,r1); }
        List<MirInstruction> entryBody = new ArrayList<MirInstruction>();
        entryBody.add(new MirInstruction.ConstInt64(0, hir.callA));
        entryBody.add(new MirInstruction.ConstInt64(1, hir.callB));
        entryBody.add(new MirInstruction.CallVoid("foo", new int[]{0, 1}));
        entryBody.add(new MirInstruction.ReturnVoid());

        MirFunction entry = new MirFunction(
                MirProgram.ENTRY,
                Arrays.<MirType>asList(),
                MirType.VOID,
                2,
                entryBody
        );
        out.add(entry);

        return new MirProgram(out);
    }
}
