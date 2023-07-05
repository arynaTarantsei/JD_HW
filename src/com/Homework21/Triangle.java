package com.Homework21;

import java.util.Scanner;

class Triangle implements Shape {
    private double base;
    private double height;

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину основания треугольника:");
        base = scanner.nextDouble();
        System.out.println("Введите высоту треугольника:");
        height = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

