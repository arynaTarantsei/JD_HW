package com.Homework15;

import java.util.Arrays;

public class ArraySum {
    public int sum(int[] array) {
        int result = 0;
        for (int num : array) {
            result += num;
        }
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArraySum arraySum = new ArraySum();

        int mid = array.length / 2;

        int[] firstHalf = Arrays.copyOfRange(array, 0, mid);
        int[] secondHalf = Arrays.copyOfRange(array, mid, array.length);

        Thread thread1 = new Thread(() -> {
            int sum = arraySum.sum(firstHalf);
            System.out.println("Поток 1 сумма = " + sum);
        });

        Thread thread2 = new Thread(() -> {
            int sum = arraySum.sum(secondHalf);
            System.out.println("Поток 2 сумма = " + sum);
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        int totalSum = arraySum.sum(firstHalf) + arraySum.sum(secondHalf);
        System.out.println("Общая сумма = " + totalSum);
    }
}
