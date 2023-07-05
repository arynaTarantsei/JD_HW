package com.Homework21;

class ShapeFactory {
    public Shape createShape(int choice) {
        switch (choice) {
            case 1:
                return new Triangle();
            case 2:
                return new Rectangle();
            case 3:
                return new Circle();
            default:
                return null;
        }
    }
}
