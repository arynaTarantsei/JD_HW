package com.Homework16;
import java.util.LinkedList;
import java.util.Queue;
public class SafeQueue<V> {
    private Queue<V> queue;

    public SafeQueue() {
        queue = new LinkedList<>();
    }

    public synchronized void enqueue(V item) {
        queue.add(item);
        notifyAll();
    }

    public synchronized V dequeue() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        return queue.poll();
    }

    public static void main(String[] args) {
        SafeQueue<Integer> safeQueue = new SafeQueue<>();

        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                safeQueue.enqueue(i);
                System.out.println("Производитель: в очереди " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    int item = safeQueue.dequeue();
                    System.out.println("Потребитель: удален из очереди " + item);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
