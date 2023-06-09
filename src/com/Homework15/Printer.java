package com.Homework15;

public class Printer {
    public void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread thread1 = new Thread(() -> printer.print("Поток 1: Hello"));
        Thread thread2 = new Thread(() -> printer.print("Поток 2: World"));
        Thread thread3 = new Thread(() -> printer.print("Поток 3: Welcome"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
