package com.Homework17;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Task2{
    public static void main(String[] args) {
        SafeQueue<Integer> queue = new SafeQueue<>();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 3; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 100; j++) {
                    int item = (int) (Math.random() * 100);
                    queue.enqueue(item);
                    System.out.println("Производитель: в очереди: " + item);
                }
            });
        }

        for (int i = 0; i < 2; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 150; j++) {
                    Integer item = queue.dequeue();
                    if (item != null) {
                        System.out.println("Потребитель: удален из очереди: " + item);
                    }
                }
            });
        }

        executorService.shutdown();
    }
}
