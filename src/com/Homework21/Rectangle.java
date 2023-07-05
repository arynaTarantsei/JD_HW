package com.Homework21;
import java.util.Scanner;
class Rectangle implements Shape {
    private double width;
    private double height;

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника:");
        width = scanner.nextDouble();
        System.out.println("Введите высоту прямоугольника:");
        height = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

