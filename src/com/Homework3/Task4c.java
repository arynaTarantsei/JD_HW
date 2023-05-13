package com.Homework3;

import static com.Homework3.Task4aANDb.readArray;


public class Task4c {
    public static void main(String[] args) {
        int[] ints = readArray();
        printArray2(ints);

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


