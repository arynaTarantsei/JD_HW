package com.Homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = sc.nextInt();
        boolean t = false;
        if (x % 3 == 0 && x % 5 != 0) {
            System.out.println("Fizz");
            t = true;
        }
        if (x % 5 == 0 && x % 3 != 0) {
            System.out.println("Buzz");
            t = true;
        }
        if (x % 5 == 0 && x % 3 == 0) {
            System.out.println("FizzBuzz");
            t = true;
        }
        if (!t) {
            System.out.println("не FizzBuzz:( попробуй другое число");
        }
    }
}


