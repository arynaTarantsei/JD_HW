package Homework3;

import java.util.Scanner;


public class Task4a {
    public static void massiveElements() {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Введите 5 элементов массива: " );
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Введённые элементы массива: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void main(String[] args) {
        massiveElements();
    }
}
