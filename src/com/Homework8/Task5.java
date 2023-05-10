package com.Homework8;

import java.util.Scanner;

public class Task5 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        findAndPrintPhoneNumbers(input);
    }

    public static void findAndPrintPhoneNumbers(String input) {
        String[] words = input.split("\\s+");
        for (String word : words) {
            if (word.startsWith("+") && word.length() >= 10 && word.length() <= 15) {
                String numbers = word.substring(1);
                if (numbers.matches("\\d+")) {
                    System.out.println(word);
                }
            }
        }
    }
}

