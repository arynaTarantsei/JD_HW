package com.Homework20;

public class Task3 {
    public static void main(String[] args) {
        Product pen = new Product("Ручка", 2500.78, 4.5, "Канцелярия");
        Product skirt = new Product("Юбка", 1200.56, 4.2, "Женская одежда");
        Product apples = new Product("Яблоки", 550.78, 4.8, "Фрукты");

        Category stationery = new Category("Канцелярия");
        Category womenClothing = new Category("Женская одежда");
        Category fruits = new Category("Фрукты");

        stationery.addProduct(pen);
        womenClothing.addProduct(skirt);
        fruits.addProduct(apples);

        Basket basket = new Basket();

        basket.addProduct(pen);
        basket.addProduct(skirt);
        basket.addProduct(apples);

        basket.printBasket();
    }
}
