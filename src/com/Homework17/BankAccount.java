package com.Homework17;
import java.util.concurrent.atomic.AtomicReference;
class BankAccount {
    private AtomicReference<Double> balance;
    //AtomicReference обеспечивает целостность ссылки. если многоточно будет меняться ссылка на объект, то она будет
    //записываться корректно. а вот результат правильного начисления/списания она не гарантирует
    //как вариант можно использовать AtomicInteger. Такой подход применяется, когда деньги хранятся в интовом числе
    //но без дробной части. что бы хранить значение с центами/монетами - просто хранится значение умноженное на 100.
    //а уже при выводе на печать или запросе результата делится на 100 или форматируется при помощи форматтеров

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
