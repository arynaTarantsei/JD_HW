package com.Homework8;

import java.util.Scanner;

public class Task5 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        /*
        я ввел вот такую строку и мне нашло лишь 1 номер из 3-х

        Listen to the news +58934798271089 from today and +375298904356read the text at the ti+9187390762me.

         */
        String input = scanner.nextLine();
        findAndPrintPhoneNumbers(input);
    }

    public static void findAndPrintPhoneNumbers(String input) {
        String[] words = input.split("\\s+"); //полноценно используй регулярное выражение.
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

