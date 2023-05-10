package com.Homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        int gcd = findGCD(number1, number2);
        System.out.println("Наибольший общий делитель чисел " + number1 + " и " + number2 + " равен " + gcd);
    }

    public static int findGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        } else {
            return findGCD(number2, number1 % number2);
        }
    }
}
