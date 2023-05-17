package com.Homework5;

public class Task2 {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(1, 2);

        Fraction sum = fraction1.add(fraction2);
        System.out.println("Сумма дробей: " + sum);

        int number = 2;
        Fraction resultMultiply = fraction1.multiply(number);
        Fraction resultDivide = fraction1.divide(number);

        System.out.println("Умножение первой дроби на число " + number + ": " + resultMultiply);
        System.out.println("Деление первой дроби на число " + number + ": " + resultDivide);
    }
}

