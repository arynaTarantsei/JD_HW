package com.Homework9;

public class Task1 {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        MyArray<Integer> myIntArray = new MyArray<>(intArr);
        System.out.println("Элемент под индексом 0: "+ myIntArray.getElement(0));
        System.out.println("Элемент под индексом 5: "+ myIntArray.getElement(5));

        Long[] longArr = {100L, 200L, 300L};
        MyArray<Long> myLongArray = new MyArray<>(longArr);
        System.out.println("Элемент под индексом 1: "+ myLongArray.getElement(1));
        System.out.println("Элемент под индексом -1: "+ myLongArray.getElement(-1));
    }
}
