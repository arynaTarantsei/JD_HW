package com.Homework3;

public class Task9 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            result.append(i);
        }

        int x = 10;
        while (x < 10000) {
            if (x % 1111 == 0) {
                result.append(x);
            }
            x++;
        }

        System.out.println(result.toString());
    }
}
