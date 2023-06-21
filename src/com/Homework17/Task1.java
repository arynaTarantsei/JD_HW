package com.Homework17;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task1 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            });
        }

        executorService.shutdown();

        while (!executorService.isTerminated()) {
        }

        System.out.println("Значение счетчика: " + counter.getCount());
    }
}
