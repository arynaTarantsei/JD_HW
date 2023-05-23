package com.Homework6;

public abstract class Aircraft {
    private int capacity; // вместимость
    private int liftingCapacity; // грузоподъемность
    private int range; // дальность полета

    public Aircraft(int capacity, int liftingCapacity, int range) {
        this.capacity = capacity;
        this.liftingCapacity = liftingCapacity;
        this.range = range;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public int getRange() {
        return range;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + " [вместимость=" + capacity + ", грузоподъемность=" + liftingCapacity + ", дальность полета=" + range + "]";
    }
}
