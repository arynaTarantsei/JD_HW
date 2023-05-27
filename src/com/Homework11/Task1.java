package com.Homework11;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("яблоко");
        list.add("банан");
        list.add("груша");
        System.out.println("Список: " + list);
        System.out.println("Размер списка: " + list.size());
        System.out.println("Вывести элемент с индексом 1: " + list.get(1));
        list.set(1, "апельсин");
        System.out.println("Заменить элемент с индексом 1 на другой: " + list);
        list.add(0, "виноград");
        System.out.println("Добавить новый элемент в место с индексом 0: " + list);
        list.addAll(Arrays.asList("дыня", "персик"));
        System.out.println("Добавить новые элементы в список: " + list);
        list.remove(2);
        System.out.println("Удалить элемент с индексом 2: " + list);
        list.clear();
        System.out.println("Очистить список: " + list);
    }
}
