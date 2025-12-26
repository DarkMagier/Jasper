package org.example;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

import org.bytedeco.ffmpeg.global.avutil;

public class Main {

    public interface Greeter {
        String greet();
    }

    public static void main(String[] args) {
        System.out.println("== Byte Buddy test ==");

        try {
            Class<? extends Greeter> dynamicType = new ByteBuddy()
                    .subclass(Object.class)
                    .implement(Greeter.class)
                    .method(ElementMatchers.named("greet"))
                    .intercept(FixedValue.value("Hello from Byte Buddy!"))
                    .make()
                    .load(Main.class.getClassLoader())
                    .getLoaded()
                    .asSubclass(Greeter.class); // ✅ 关键：把 Class<?> 收窄成 Greeter 子类

            Greeter greeter = dynamicType.getDeclaredConstructor().newInstance();
            System.out.println("Generated class: " + dynamicType.getName());
            System.out.println("greeter.greet(): " + greeter.greet());
            System.out.println("Byte Buddy OK ✅");
        } catch (Throwable t) {
            System.out.println("Byte Buddy FAILED ❌");
            t.printStackTrace();
        }

        System.out.println();
        System.out.println("== Bytedeco (FFmpeg) test ==");

        try {
            String ffmpegVersion = String.valueOf(avutil.av_version_info());
            System.out.println("FFmpeg av_version_info(): " + ffmpegVersion);
            System.out.println("Bytedeco OK ✅");
        } catch (UnsatisfiedLinkError e) {
            System.out.println("Bytedeco native load FAILED ❌（通常缺少 ffmpeg-platform 或 javacv-platform）");
            e.printStackTrace();
        } catch (Throwable t) {
            System.out.println("Bytedeco FAILED ❌");
            t.printStackTrace();
        }
    }
}
