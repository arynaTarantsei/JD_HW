package com.Homework9;

public class Task2 {
    public static void main(String[] args) {

        Pair<Long, Double> pair1 = new Pair<>(789L, 3.14);
        Pair<String, Integer> pair2 = new Pair<>("hello", 123);

        System.out.println("Первый элемент первой пары: " + pair1.first());
        System.out.println("Второй элемент первой пары: " + pair1.last());
        System.out.println("Первый элемент второй пары: " + pair2.first());
        System.out.println("Второй элемент второй пары: " + pair2.last());

        System.out.println();
        System.out.println("Обмен значениями между элементами первой пары: ");
        pair1.swap();
        System.out.println("Первый элемент: " + pair1.first());
        System.out.println("Второй элемент: " + pair1.last());

        System.out.println();
        System.out.println("Замена значений элементов второй пары новыми значениями: ");
        pair2.replaceFirst("How are you?");
        pair2.replaceLast(271);
        System.out.println("Первый элемент: " + pair2.first());
        System.out.println("Второй элемент: " + pair2.last());
    }
}
