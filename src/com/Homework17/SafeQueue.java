package com.Homework17;
import java.util.concurrent.LinkedBlockingQueue;
class SafeQueue<V> {
    private LinkedBlockingQueue<V> queue = new LinkedBlockingQueue<>();

    public void enqueue(V item) {
        try {
            queue.put(item);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public V dequeue() {
        try {
            return queue.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }
}
