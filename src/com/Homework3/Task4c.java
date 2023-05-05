package com.Homework3;

import java.util.Scanner;


public class Task4c {
    public static void main(String[] args) {
        int[] ints = readArray2();
        printArray2(ints);

    }

    public static int[] readArray2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элементы массива в строку через пробел");
        String s = sc.nextLine();
        String[] arrayString = s.trim().split(" ");
        int[] intArray = new int[arrayString.length];
        for (int i = 0; i < arrayString.length; i++) {
            intArray[i] = Integer.parseInt(arrayString[i]);
        }
        return intArray;
    }

    public static void printArray2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 7 == 0) {
                continue;
            }
            System.out.print(array[i] + " ");
        }
    }
}


