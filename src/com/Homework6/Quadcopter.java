package com.Homework6;

public class Quadcopter extends Aircraft{
    public Quadcopter(int capacity, int liftingCapacity, int range) {
        super(capacity, liftingCapacity, range);
    }

    @Override
    public String getType() {
        return "Квадрокоптер";
    }
}
