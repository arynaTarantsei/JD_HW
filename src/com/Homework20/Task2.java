package com.Homework20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2 {

    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM");
        System.out.println("Календарь праздников " + currentYear);
        System.out.println("-----------------------");
        System.out.println("Новый год: " + LocalDate.of(currentYear, 1, 1).format(formatter));
        System.out.println("День святого Валентина: " + LocalDate.of(currentYear, 2, 14).format(formatter));
        System.out.println("Пасха: " + calculateEasterSunday(currentYear).format(formatter));
        System.out.println("День независимости: " + LocalDate.of(currentYear, 7, 4).format(formatter));
        System.out.println("Рождество: " + LocalDate.of(currentYear, 12, 25).format(formatter));
    }

    private static LocalDate calculateEasterSunday(int year) {
        int a = year % 19;
        int b = year / 100;
        int c = year % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l) / 451;
        int month = (h + l - 7 * m + 114) / 31;
        int day = ((h + l - 7 * m + 114) % 31) + 1;
        return LocalDate.of(year, month, day);
    }
}

