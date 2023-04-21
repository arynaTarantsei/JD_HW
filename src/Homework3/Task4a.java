package Homework3;

import java.util.Scanner;


public class Task4a {
    public static void massiveElements() { // метод должен ВОЗВРАЩАТЬ элементы массива
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        /* почему 5? я хочу вводить сколько мне угодно
        посмотри еще раз как я делал со строкой String[] split = s.split(" ");
        */
        System.out.println("Введите 5 элементов массива: " );
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Введённые элементы массива: "); // данный метод должен только считывать элементы и возвращать их. для вывода на экран должен быть отдельный метод
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void main(String[] args) {
        massiveElements();
    }
}
