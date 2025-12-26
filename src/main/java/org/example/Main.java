package org.example;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

import org.bytedeco.ffmpeg.global.avutil;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public interface Greeter {
        String greet();
    }

    public static void main(String[] args) {
        System.out.println("== Byte Buddy (force Java 8 bytecode) ==");

        try {
            DynamicType.Unloaded<?> unloaded = new ByteBuddy(ClassFileVersion.JAVA_V8)
                    .subclass(Object.class)
                    .implement(Greeter.class)
                    .method(ElementMatchers.named("greet"))
                    .intercept(FixedValue.value("Hello from Byte Buddy (Java 8 bytecode)!"))
                    .make();

            // Java 8: 用 Paths.get，而不是 Path.of
            Path outDir = Paths.get("generated-classes");
            Files.createDirectories(outDir);

            unloaded.saveIn(outDir.toFile()); // 写出 .class 文件
            System.out.println("Saved classes under: " + outDir.toAbsolutePath());

            Class<? extends Greeter> type = unloaded
                    .load(Main.class.getClassLoader())
                    .getLoaded()
                    .asSubclass(Greeter.class);

            Greeter g = type.getDeclaredConstructor().newInstance();
            System.out.println("Generated class: " + type.getName());
            System.out.println("greet(): " + g.greet());
            System.out.println("Byte Buddy OK ✅");
        } catch (Throwable t) {
            System.out.println("Byte Buddy FAILED ❌");
            t.printStackTrace();
        }

        System.out.println();
        System.out.println("== Bytedeco (FFmpeg native) ==");

        try {
            String ffmpegVersion = String.valueOf(avutil.av_version_info());
            System.out.println("FFmpeg av_version_info(): " + ffmpegVersion);
            System.out.println("Bytedeco OK ✅");
        } catch (UnsatisfiedLinkError e) {
            System.out.println("Bytedeco native load FAILED ❌（通常缺少 *-platform 或平台不匹配）");
            e.printStackTrace();
        } catch (Throwable t) {
            System.out.println("Bytedeco FAILED ❌");
            t.printStackTrace();
        }
    }
}
