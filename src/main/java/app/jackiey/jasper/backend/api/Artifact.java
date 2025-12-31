package app.jackiey.jasper.backend.api;

import java.nio.file.Path;

public final class Artifact {
    public final Path path;      // may be null (e.g. in-memory JVM run)
    public final Object backend; // backend instance (optional convenience)

    public Artifact(Path path, Object backend) {
        this.path = path;
        this.backend = backend;
    }
}
