package com.Homework3;

import static com.Homework3.Task4aANDb.readArray;

import java.util.Scanner;

public class Task8 {


    public static void main(String[] args) {
        int[] vector = readArray();
        int[][] matrix = readArrayFromKeyboard();


        multiply(matrix, vector);
    }

    public static void multiply(int[][] matrix, int[] vector) {
        if (vector.length != matrix[0].length) {
            System.out.println("Невозможно выполнить умножение матрицы на вектор.");
            return;
        }

        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < vector.length; j++) {
                sum += matrix[i][j] * vector[j];
            }
            result[i] = sum;
        }

        System.out.print("Результат умножения матрицы на вектор: [ ");
        for (int i = 0; i < result.length - 1; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.println(result[result.length - 1] + " ]");
    }

    public static int[][] readArrayFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }
}

