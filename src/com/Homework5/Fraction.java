package com.Homework5;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + " / " + denominator;
    }

    public Fraction add(Fraction fraction) {
        int num = numerator * fraction.denominator + fraction.numerator * denominator;
        int den = denominator * fraction.denominator;
        return new Fraction(num, den);
    }

    public Fraction multiply(int number) {
        int num = numerator * number;
        return new Fraction(num, denominator);
    }

    public Fraction divide(int number) {
        int den = denominator * number;
        return new Fraction(numerator, den);
    }
}
