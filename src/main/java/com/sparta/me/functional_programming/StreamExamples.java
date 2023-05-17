package com.sparta.me.functional_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
public class StreamExamples {
    public static Optional<String> getLargestPalindrome(ArrayList<String> sentence) {
        return sentence.stream()
                .filter(StreamExamples::isPalindrome)
                .max(Comparator.comparingInt(String::length));
    }

    private static boolean isPalindrome(String word) {
        return new StringBuilder(word.toLowerCase())
                .reverse()
                .toString()
                .equals(word.toLowerCase());
    }

    public static boolean containsAllAlphabet(String sentence) {
        return sentence.toLowerCase().chars()
                .filter(letter -> letter >= 'a' && letter <= 'z')
                .distinct()
                .count() == 26;
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "This",
                "madam",
                "racecar",
                "Java"
        ));
        System.out.println(getLargestPalindrome(words).stream().toList());
    }
}
