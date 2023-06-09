package com.Homework15;


public class Task3 {
    public static Integer value;

    public static void main(String[] args) throws InterruptedException {
        value = 0;

        Thread[] threads = new Thread[1000];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new IncrementThread(i);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Финальное значение: " + value);
    }

    static class IncrementThread extends Thread {
        private final int threadNumber;

        public IncrementThread(int threadNumber) {
            this.threadNumber = threadNumber;
        }

        @Override
        public void run() {
            if (threadNumber % 10 == 0) {
                throw new RuntimeException("Поток " + threadNumber + " был прерван");
            }

            for (int i = 0; i < 500; i++) {
                synchronized (value) {
                    value++;
                }
            }
        }
    }
}




