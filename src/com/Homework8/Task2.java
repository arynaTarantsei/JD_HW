package com.Homework8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        while (str.contains("  ")) {
            str = str.replace("  ", " ");
        }
        System.out.println(str.trim());
    }
}
