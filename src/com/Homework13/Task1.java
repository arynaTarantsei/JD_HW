package com.Homework13;
import java.util.ArrayList;
import java.util.List;
public class Task1 {
    public static void main(String[] args) {
        List<FoodType> foodList1 = new ArrayList<>();
        foodList1.add(FoodType.FRUIT);
        foodList1.add(FoodType.VEGETABLE);
        foodList1.add(FoodType.MILK);
        System.out.println(FoodChecker.isVegetarian(foodList1));

        List<FoodType> foodList2 = new ArrayList<>();
        foodList2.add(FoodType.MEAT);
        foodList2.add(FoodType.FISH);
        System.out.println(FoodChecker.isVegetarian(foodList2));
    }
}
