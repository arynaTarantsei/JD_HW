package com.Homework6;

public class ShapeParameterPrinter {
    public void printArea(Shape shape) {
        System.out.println("The area is " + shape.area());
    }

    public void printPerimeter(Shape shape) {
        System.out.println("The perimeter is " + shape.perimeter());
    }

    public void printAreaAndPerimeter(Shape shape) {
        System.out.println("The area is " + shape.area());
        System.out.println("The perimeter is " + shape.perimeter());
    }
}
