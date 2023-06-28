package com.Homework19;
import java.util.Arrays;
import java.util.List;
public class Task3 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");

        List<String> modifiedList = myList.stream()
                .filter(s -> !s.contains("3"))
                .sorted((s1, s2) -> {
                    char c1 = s1.charAt(1);
                    char c2 = s2.charAt(1);
                    if (c1 == c2) {
                        return Character.compare(s2.charAt(0), s1.charAt(0));
                    }
                    return Character.compare(c1, c2);
                })
                .skip(1)
                .limit(myList.size() - 2)
                .map(String::toUpperCase)
                .toList();

        modifiedList.forEach(System.out::println);
        System.out.println("Количество оставшихся элементов: " + modifiedList.size());
    }
}
