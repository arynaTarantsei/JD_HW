package com.Homework6;

public class ShapeParameterPrinter {
    public void printArea(Shape shape) {
        System.out.println("Площадь фигуры равняется: " + shape.area());
    }

    public void printPerimeter(Shape shape) {
        System.out.println("Периметр фигуры равняется: " + shape.perimeter());
    }

    public void printAreaAndPerimeter(Shape shape) {
        System.out.println("Площадь фигуры равняется: " + shape.area());
        System.out.println("Периметр фигуры равняется: " + shape.perimeter());
    }
}
