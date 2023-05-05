package com.Homework2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int x = sc.nextInt();
        if ((x != 11) & (x % 10 == 1) | (x == 1)  ) {
            System.out.println(x + " год");
        } else if ((x != 12) & (x != 13) & (x != 14) & (x != 11) & (x % 10 == 2) | (x % 10 == 3) | (x % 10 == 4) | (x == 2) | (x == 3) | (x == 4) ) {
            System.out.println(x + " года");
        } else {
            System.out.println(x + " лет");
        }
    }
}
