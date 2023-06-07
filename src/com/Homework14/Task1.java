package com.Homework14;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
public class Task1 {

    public static void main(String[] args) {
        int rows = 6;
        int columns = 4;
        int min = -15;
        int max = 15;

        int[][] matrix = generateRandomMatrix(rows, columns, min, max);

        String path =System.getProperty("user.dir")+"/src/com/Homework14/";
        String fileName = "matrix.txt";
        String fullPath = path+fileName;

        try {
            writeMatrixToFile(matrix, fullPath);
            System.out.println("Матрица была записана в " + fullPath);
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи матрицы в файл.");
            e.printStackTrace();
        }

        try {
            System.out.println("Матрица читается из " + fullPath);
            readMatrixFromFile(fullPath);
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении матрицы из файла.");
            e.printStackTrace();
        }
    }

    private static int[][] generateRandomMatrix(int rows, int columns, int min, int max) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(max - min + 1) + min;
            }
        }

        return matrix;
    }

    private static void writeMatrixToFile(int[][] matrix, String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    writer.printf("%3d ", matrix[i][j]);
                }
                writer.println();
            }
        }
    }

    private static void readMatrixFromFile(String fileName) throws IOException {
        try (java.util.Scanner scanner = new java.util.Scanner(new java.io.FileReader(fileName))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
}
