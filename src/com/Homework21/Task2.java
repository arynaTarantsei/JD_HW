package com.Homework21;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите фигуру:");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Прямоугольник");
        System.out.println("3 - Круг");
        int choice = scanner.nextInt();

        Shape shape = shapeFactory.createShape(choice);
        if (shape != null) {
            shape.inputData();
            double area = shape.calculateArea();
            System.out.println("Площадь фигуры: " + area);
        } else {
            System.out.println("Некорректный выбор фигуры.");
        }
    }
}
