package com.Homework9;

public class MyArray <T>{
    private final T[] arr;

    public MyArray(T[] arr) {
        this.arr = arr;
    }

    public T getElement(int index) {
        if (index >= 0 && index < arr.length) {
            return arr[index];
        } else {
            return null;
        }
    }
}
