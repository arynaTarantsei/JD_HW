package com.Homework5;

public class Task4 {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3, 3);
        Matrix matrix2 = new Matrix(3, 3);

        System.out.println("Матрица 1:");
        System.out.println(matrix1);

        System.out.println("Матрица 2:");
        System.out.println(matrix2);

        Matrix sum = matrix1.add(matrix2);
        System.out.println("Сумма матриц:");
        System.out.println(sum);

        Matrix difference = matrix1.subtract(matrix2);
        System.out.println("Разность матриц:");
        System.out.println(difference);

        Matrix product = matrix1.multiply(matrix2);
        System.out.println("Произведение матриц:");
        System.out.println(product);
    }
}
