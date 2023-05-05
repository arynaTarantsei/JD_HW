package com.Homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long y;
        System.out.println("Введите пароль: ");
        y = sc.nextLong();
        while (y != 977365272) {
            System.out.println("В доступе отказано. Введите пароль: ");
            y = sc.nextLong();
        }
        System.out.println("Доступ разрешён");
    }
}
