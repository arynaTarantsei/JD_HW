package com.Homework16;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(double amount) {
        balance -= amount;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);

        for (int i = 0; i < 100; i++) {
            Thread withdrawalThread = new Thread(() -> {
                for (int j = 0; j < 200; j++) {
                    account.withdraw(200);
                }
            });

            Thread depositThread = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    account.deposit(100);
                }
            });

            withdrawalThread.start();
            depositThread.start();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Итоговая сумма: " + account.getBalance());
    }
}
