package com.Homework8;

import java.util.*;

public class Task4 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        int count = countUniqueWords(text);
        System.out.println("Количество уникальных слов: " + count);
    }

    public static int countUniqueWords(String text) {
        String cleanText = text.replaceAll("\\p{Punct}", "").toLowerCase();
        String[] words = cleanText.trim().split("\\s+");
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        return uniqueWords.size();
    }
}



