package com.Homework9;

public class Pair <T1, T2>{
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 first() {
        return first;
    }

    public T2 last() {
        return second;
    }

    public void swap() {
        T1 temp = first;
        first = (T1) second;
        second = (T2) temp;
    }

    public void replaceFirst(T1 newFirst) {
        first = newFirst;
    }

    public void replaceLast(T2 newLast) {
        second = newLast;
    }
}

