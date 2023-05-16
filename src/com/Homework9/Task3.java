package com.Homework9;

public class Task3 {
    public static void main(String[] args) {
        NumberClass<Integer> intClass1 = new NumberClass<>(123);
        NumberClass<Integer> intClass2 = new NumberClass<>(456);
        NumberClass<Double> doubleClass1 = new NumberClass<>(3.14);
        NumberClass<Double> doubleClass2 = new NumberClass<>(678.90);

        System.out.println("Результат сравнения объектов intClass1 и intClass2: "+intClass1.compareStringLength(intClass2.number));
        System.out.println("Результат сравнения объектов doubleClass1 и doubleClass2: "+doubleClass1.compareStringLength(doubleClass2.number));
    }
}
