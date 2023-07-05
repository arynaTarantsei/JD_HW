package com.Homework21;

class SyrupDecoration extends BeverageDecorator {
    public SyrupDecoration(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void prepare() {
        beverage.prepare();
        System.out.println("Добавляю сироп...");
        System.out.println("Сироп добавлен!");
    }
}
