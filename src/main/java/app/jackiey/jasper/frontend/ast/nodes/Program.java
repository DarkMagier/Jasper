package app.jackiey.jasper.frontend.ast.nodes;

import java.util.Collections;
import java.util.List;

public final class Program {
    public final List<Item> items;

    public Program(List<Item> items) {
        this.items = (items == null) ? Collections.<Item>emptyList() : Collections.unmodifiableList(items);
    }
}
