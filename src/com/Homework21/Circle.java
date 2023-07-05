package com.Homework21;

import java.util.Scanner;

class Circle implements Shape {
    private double radius;

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга:");
        radius = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}