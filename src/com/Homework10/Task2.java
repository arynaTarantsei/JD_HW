package com.Homework10;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        while (true) {
            System.out.println("Введите число или END: ");
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            }
            try {
                double number = Double.parseDouble(input);
                sum += number;
                double sqrt = Math.sqrt(sum);
                System.out.println("Число: " + number + ", корень суммы равняется: " + sqrt);
            } catch (NumberFormatException e) {
                System.out.println("Невозможно преобразовать введенный текст в число.");
            } catch (ArithmeticException e) {
                System.out.println("Невозможно извлечь корень из отрицательного числа.");
            }
        }
        scanner.close();
    }
}
