package com.Homework21;

class MilkDecoration extends BeverageDecorator {
    public MilkDecoration(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void prepare() {
        beverage.prepare();
        System.out.println("Добавляю молоко...");
        System.out.println("Молоко добавлено!");
    }
}
