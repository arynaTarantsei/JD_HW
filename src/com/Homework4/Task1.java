package com.Homework4;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Решение в строку: ");
        System.out.println(solutionOneLine());
        System.out.println("Решение с разбивкой выражения: ");
        System.out.println(solutionDivided());
        System.out.println("Задание 2: ");
        System.out.println(solutionPart2());
    }

    public static double solutionOneLine() {
        double a = 756.13;
        double x = 0.3;
        return (Math.pow(Math.cos(Math.pow(x, 2) + Math.PI / 6), 5)) - Math.sqrt(x * Math.pow(a, 3)) - Math.log((a - 1.12 * x) / 4);
    }

    public static double solutionDivided() {
        double a = 756.13;
        double x = 0.3;
        double mathPowX, PI, cos, degree, mathPowA, sqrt, log, result;
        mathPowX = Math.pow(x, 2);
        PI = Math.PI / 6;
        cos = Math.cos(mathPowX + PI);
        degree = Math.pow(cos, 5);
        mathPowA = Math.pow(a, 3);
        sqrt = Math.sqrt(x * mathPowA);
        log = Math.log((a - 1.12 * x) / 4);
        result = degree - sqrt - log;
        return result;
    }
    public static double solutionPart2() {
        double a = 1.21;
        double b = 0.371;
return (Math.tan(Math.pow((a+b),2)))-Math.cbrt(a+1.5)+Math.pow((a*b), 5)-(b/(Math.log(Math.pow(a, 2))));
    }
}