package com.Homework21;

class Tea implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Приготовление чая...");
        System.out.println("Чай готов!");
    }
}
