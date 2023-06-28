package com.Homework19;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        Collection<String> col1 = Arrays.asList("Hello ", "world!", "login", "Java");
        Collection<String> col2 = Arrays.asList("Stream", "Doc", "examples");
        Collection<String> col3 = Arrays.asList("Short,", "Longest", "Word", "Java");

        boolean containsLogin = col1.stream()
                .anyMatch(s -> s.contains("login"));
        System.out.println("Содержит слово 'login': " + containsLogin);

        String longestString = Stream.of(col1, col2, col3)
                .flatMap(Collection::stream)
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println("Самая длинная строка: " + longestString);

        String shortestString = Stream.of(col1, col2, col3)
                .flatMap(Collection::stream)
                .min(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println("Самая короткая строка: " + shortestString);

        List<String> wordStrings = Stream.of(col1, col2, col3)
                .flatMap(Collection::stream)
                .filter(s -> s.matches("\\w+"))
                .collect(Collectors.toList());
        System.out.println("Строки-слова: " + wordStrings);


        Set<String> allWords = Stream.of(col1, col2, col3)
                .flatMap(Collection::stream)
                .flatMap(s -> Arrays.stream(s.split("\\W+")))
                .collect(Collectors.toSet());
        System.out.println("Все слова: " + allWords);
    }
}
