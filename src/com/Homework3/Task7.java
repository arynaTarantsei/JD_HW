package com.Homework3;


public class Task7 {
    public static void main(String[] args) {
        int[][] arr = new int[7][4];
        int indMaxPr = 0;
        int maxPr = -1;
        int p;
        for (int i = 0; i < arr.length; i++) {
            p = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (5 - (-5) + 1) - 5);
                System.out.print(arr[i][j] + " ");
                p=p+arr[i][j];
            }
            System.out.println();
            p = Math.abs(p);
            System.out.println("Сумма " + p);
            if (p > maxPr) {
                maxPr = p;
                indMaxPr = i;
            }
        }
        System.out.println("Индекс строки с максимальной суммой элементов: " + indMaxPr);
    }
}