package app.jackiey.jasper.middle.mir;

import java.util.Collections;
import java.util.List;

public final class MirFunction {
    public final String name;
    public final List<MirType> params;
    public final MirType returnType;
    public final int localCount; // total registers count (params + temps)
    public final List<MirInstruction> body;

    public MirFunction(String name, List<MirType> params, MirType returnType, int localCount, List<MirInstruction> body) {
        this.name = name;
        this.params = params == null ? Collections.<MirType>emptyList() : Collections.unmodifiableList(params);
        this.returnType = returnType;
        this.localCount = localCount;
        this.body = body == null ? Collections.<MirInstruction>emptyList() : Collections.unmodifiableList(body);
    }
}
