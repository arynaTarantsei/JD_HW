package com.Homework20;

class Product {
    private String name;
    private double price;
    private double rating;
    private String category;

    public Product(String name, double price, double rating, String category) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public String getCategory() {
        return category;
    }
}
