package com.Homework12;
import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        String word;

        do {
            System.out.print("Введите слово (end для завершения): ");
            word = scanner.nextLine().toLowerCase();
            if (!word.equals("end")) {
                words.add(word);
            }
        } while (!word.equals("end"));

        Map<String, Integer> wordCountMap = listToMap(words);

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            String wordCount = String.format("%s-%d", entry.getKey(), entry.getValue());
            System.out.println(wordCount);
        }
    }

    public static <K> Map<K, Integer> listToMap(List<K> ks) {
        Map<K, Integer> result = new HashMap<>();
        for (K k : ks) {
            result.put(k, result.getOrDefault(k, 0) + 1);
        }
        return result;
    }
}
