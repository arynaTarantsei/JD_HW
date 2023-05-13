package com.Homework3;

import java.util.Scanner;


public class Task4aANDb {
    public static void main(String[] args) {
        int[] ints = readArray();
        printArray(ints);

    }

    public static int[] readArray() {
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

    public static void printArray(int[] array) {
        System.out.print("Ваш массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
