package com.Homework19;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class Task4 {
    public static void main(String[] args) {
        Map<String, Set<Integer>> initialMap = new HashMap<>() {{
            put("123", Set.of(1, 2, 3, 4));
            put("234", Set.of(2, 3, 4, 5));
            put("345", Set.of(3, 4, 5, 6));
            put("456", Set.of(4, 5, 6, 7));
        }};

        Map<Integer, Set<String>> result = initialMap.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream()
                        .map(value -> Map.entry(value, entry.getKey())))
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue, Collectors.toSet())
                ));

        System.out.println(result);
    }
}
