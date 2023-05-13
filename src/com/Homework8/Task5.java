package com.Homework8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Task5 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        System.out.println("Найденные номера телефонов: ");
        findAndPrintPhoneNumbers(input);
    }

    public static void findAndPrintPhoneNumbers(String input) {
        Pattern pattern = Pattern.compile("\\+(\\d{9,14})");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}



