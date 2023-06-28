package com.Homework19;
import java.util.Arrays;
import java.util.Collection;
public class Task2 {
    public static void main(String[] args) {
        Collection<Integer> col1 = Arrays.asList(10, 5, 8, 3, 12);

        int minNumber = col1.stream()
                .min(Integer::compareTo)
                .orElse(0);
        System.out.println("Минимальное число: " + minNumber);

        int maxNumber = col1.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println("Максимальное число: " + maxNumber);

        double average = col1.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Среднее арифметическое чисел: " + average);

        int product = col1.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Произведение всех чисел: " + product);

        int sum = col1.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сумма всех чисел: " + sum);

        int digitSum = col1.stream()
                .flatMapToInt(number -> String.valueOf(number).chars())
                .map(Character::getNumericValue)
                .sum();
        System.out.println("Сумма всех цифр: " + digitSum);
    }
}
