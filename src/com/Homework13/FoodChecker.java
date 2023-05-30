package com.Homework13;

import java.util.List;

public class FoodChecker {
    public static boolean isVegetarian(List<FoodType> foods) {
        for (FoodType food : foods) {
            if (food == FoodType.MEAT || food == FoodType.FISH || food == FoodType.UNKNOWN) {
                return false;
            }
        }
        return true;
    }
}