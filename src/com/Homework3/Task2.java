package com.Homework3;

public class Task2 {
    public static void main(String[] args) {
        int i = -1;
        int x = 10;
        while (i < 9) {
            i++;
            System.out.print(i);
        }
        while (x < 100) {
            x++;
            if (x % 11 == 0) {
                System.out.print(x);
            }
        }
        while (x < 1000) {
            x++;
            if (x % 111 == 0) {
                System.out.print(x);
            }
        }
        while (x < 10000) {
            x++;
            if (x % 1111 == 0) {
                System.out.print(x);
            }
        }
    }
}
