package com.Homework20;
import java.util.ArrayList;
import java.util.List;
class Basket {
    private List<Product> purchasedProducts;

    public Basket() {
        this.purchasedProducts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        purchasedProducts.add(product);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : purchasedProducts) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void printBasket() {
        System.out.println("Дата\t\t\t\t\t\t28.05.2022");
        System.out.println("Продукты\t\t\tКатегория\t\t\t\t\t\tЦена");
        System.out.println("------------------------------------------------------------");
        for (Product product : purchasedProducts) {
            System.out.printf("%-20s %-30s %.2f руб.%n", product.getName(), product.getCategory(), product.getPrice());
        }
        System.out.println("------------------------------------------------------------");
        System.out.printf("Итого:\t\t\t\t\t\t\t\t\t\t\t\t%.2f руб.%n", getTotalPrice());
    }
}