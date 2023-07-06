package com.Homework17;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        Shop shop = new Shop();
        shop.addProduct("Макароны", 100.0);
        shop.addProduct("Зефир", 200.0);
        shop.addProduct("Яблоко", 300.0);
        shop.addProduct("Говядина", 400.0);
        shop.addProduct("Масло", 500.0);
        shop.addProduct("Шампиньоны", 600.0);

        shop.open();

        for (int i = 1; i <= 200; i++) {
            Shop.Customer customer = shop.new Customer("Покупатель " + i);
            shop.enqueueCustomer(customer);
        }

        shop.close(); //программа не завершается самостоятельно после обслуживания всех покупателей
    }
}
