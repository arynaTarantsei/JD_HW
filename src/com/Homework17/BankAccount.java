package com.Homework17;
import java.util.concurrent.atomic.AtomicReference;
class BankAccount {
    private AtomicReference<Double> balance;

    public BankAccount(double initialBalance) {
        balance = new AtomicReference<>(initialBalance);
    }

    public void deposit(double amount) {
        balance.updateAndGet(b -> b + amount);
    }

    public void withdraw(double amount) {
        balance.updateAndGet(b -> b - amount);
    }

    public double getBalance() {
        return balance.get();
    }
}
