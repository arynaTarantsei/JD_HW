package Homework2;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        System.out.println("Введите число: ");
        double i = sc.nextDouble();
        DecimalFormat df = new DecimalFormat(" ###.### ");
        System.out.println(df.format(i));
    }
}

/*
программа не выполняет задание. нужно выводить число с точностью до 3-х знаков. я ввел 155.9999999 и результатом получил 156
155.8945 выдало 155.894 (должно было округлиться в большую сторону)
рассмотри BigDecimal для решения этой задачи
 */