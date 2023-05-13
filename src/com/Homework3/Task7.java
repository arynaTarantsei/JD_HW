package com.Homework3;
import java.util.Scanner;

public class Task7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите количество строк: ");
            int n = scanner.nextInt();

            System.out.print("Введите количество столбцов: ");
            int m = scanner.nextInt();

            int[][] matrix = new int[n][m];

            System.out.println("Введите элементы матрицы:");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            int maxSumRowIndex = getMaxSumRowIndex(matrix);

            System.out.println("Индекс строки с максимальной суммой элементов: " + maxSumRowIndex);
        }

        public static int getMaxSumRowIndex(int[][] matrix) {
            int maxSumRowIndex = 0;
            int maxSum = Integer.MIN_VALUE;

            for (int i = 0; i < matrix.length; i++) {
                int sum = 0;

                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                }

                if (sum > maxSum) {
                    maxSum = sum;
                    maxSumRowIndex = i;
                }
            }

            return maxSumRowIndex;
        }
    }