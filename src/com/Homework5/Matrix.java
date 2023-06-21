package com.Homework5;
import java.util.Arrays;
import java.util.Random;
public class Matrix {
    private int[][] matrix;

    public Matrix(int rows, int columns) {
        if (rows < 2 || columns < 2) {
            throw new IllegalArgumentException("Размеры матрицы должны быть больше 1");
        }
        matrix = new int[rows][columns];
        initializeMatrix();
    }

    private void initializeMatrix() {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(21) - 10; // случайные значения от -10 до 10
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix add(Matrix other) {
        if (matrix.length != other.matrix.length || matrix[0].length != other.matrix[0].length) {
            throw new IllegalArgumentException("Несоответствующие размеры матриц для операции сложения");
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.matrix[i][j] = matrix[i][j] + other.matrix[i][j];
            }
        }

        return result;
    }

    public Matrix subtract(Matrix other) {
        if (matrix.length != other.matrix.length || matrix[0].length != other.matrix[0].length) {
            throw new IllegalArgumentException("Несоответствующие размеры матриц для операции вычитания");
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.matrix[i][j] = matrix[i][j] - other.matrix[i][j];
            }
        }

        return result;
    }

    public Matrix multiply(Matrix other) {
        if (matrix[0].length != other.matrix.length) {
            throw new IllegalArgumentException("Несоответствующие размеры матриц для операции умножения");
        }

        int rows = matrix.length;
        int columns = other.matrix[0].length;
        int commonDimension = matrix[0].length;
        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int sum = 0;
                for (int k = 0; k < commonDimension; k++) {
                    sum += matrix[i][k] * other.matrix[k][j];
                }
                result.matrix[i][j] = sum;
            }
        }

        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : matrix) {
            sb.append(Arrays.toString(row)).append("\n");
        }
        return sb.toString();
    }
}