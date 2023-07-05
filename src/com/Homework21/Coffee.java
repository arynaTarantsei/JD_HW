package com.Homework21;

class Coffee implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Приготовление кофе...");
        System.out.println("Кофе готов!");
    }
}

