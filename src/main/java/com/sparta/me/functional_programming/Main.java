package com.sparta.me.functional_programming;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Paul", "George", "Ringo"));
        names.stream()
                .filter(Main::test)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    private static boolean test(String name) {
        return name.contains("o");
    }
}
