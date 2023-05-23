package com.Homework6;

public class Task2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 6.0);
        Circle circle = new Circle(3.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        ShapeParameterPrinter shapeParameterPrinter = new ShapeParameterPrinter();
        shapeParameterPrinter.printArea(rectangle);
        shapeParameterPrinter.printAreaAndPerimeter(circle);
        shapeParameterPrinter.printPerimeter(triangle);
    }
}
