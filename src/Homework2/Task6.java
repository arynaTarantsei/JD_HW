package Homework2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение a:");
        double a = sc.nextDouble();
        System.out.println("Введите значение b:");
        double b = sc.nextDouble();
        System.out.println("Введите значение c:");
        double c = sc.nextDouble();
        double D;
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a); //деление на 0 при а = 0
            x2 = (-b + Math.sqrt(D)) / (2 * a); //деление на 0 при а = 0
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a); //деление на 0 при а = 0
            System.out.println("Корень уравнения: x = " + x);
        } else {
            System.out.println("В данном уравнении корни отсутствуют");
        }
    }
}
