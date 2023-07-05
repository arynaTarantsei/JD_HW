package com.Homework21;

class SugarDecoration extends BeverageDecorator {
    public SugarDecoration(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void prepare() {
        beverage.prepare();
        System.out.println("Adding sugar...");
        System.out.println("Sugar added!");
    }
}