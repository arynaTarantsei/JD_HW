package com.Homework6;

public class Helicopter extends Aircraft {
    public Helicopter(int capacity, int liftingCapacity, int range) {
        super(capacity, liftingCapacity, range);
    }

    @Override
    public String getType() {
        return "Вертолет";
    }
}
