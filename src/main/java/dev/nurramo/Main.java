package dev.nurramo;

import com.google.errorprone.annotations.Keep;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int two = 2;
        System.out.println("Hello world");

        two = 3;

        System.out.println(two);
    }

    @Keep
    private static String normalize(String input) {
        return input.trim().toLowerCase(Locale.ROOT);
    }
}
