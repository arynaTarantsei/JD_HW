package com.Homework16;

public class Counter {
    private int count;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
