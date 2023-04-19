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
