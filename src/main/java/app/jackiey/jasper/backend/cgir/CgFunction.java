package app.jackiey.jasper.backend.cgir;

import java.util.Collections;
import java.util.List;

public final class CgFunction {
    public final String name;
    public final List<CgType> params;   // today: only int64
    public final List<CgInst> body;

    public CgFunction(String name, List<CgType> params, List<CgInst> body) {
        this.name = name;
        this.params = params == null ? Collections.<CgType>emptyList() : Collections.unmodifiableList(params);
        this.body = body == null ? Collections.<CgInst>emptyList() : Collections.unmodifiableList(body);
    }
}
