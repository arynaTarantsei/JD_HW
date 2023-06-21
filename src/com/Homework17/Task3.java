package com.Homework17;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Task3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);

        ExecutorService executorService = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 100; i++) {
            executorService.execute(() -> account.withdraw(200));
            executorService.execute(() -> account.deposit(100));
        }

        executorService.shutdown();

        while (!executorService.isTerminated()) {
        }

        System.out.println("Итоговая сумма: " + account.getBalance());
    }
}
