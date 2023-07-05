package com.Homework21;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип напитка (1 - кофе, 2 - чай):");
        int choice = scanner.nextInt();

        Beverage beverage;

        if (choice == 1) {
            beverage = new Coffee();
        } else if (choice == 2) {
            beverage = new Tea();
        } else {
            System.out.println("Некорректный выбор. Завершение программы.");
            return;
        }

        System.out.println("Желаете добавить ингредиенты? (1 - сахар, 2 - молоко, 3 - сироп, 0 - нет):");

        while (true) {
            int ingredientChoice = scanner.nextInt();

            if (ingredientChoice == 1) {
                beverage = new SugarDecoration(beverage);
            } else if (ingredientChoice == 2) {
                beverage = new MilkDecoration(beverage);
            } else if (ingredientChoice == 3) {
                beverage = new SyrupDecoration(beverage);
            } else if (ingredientChoice == 0) {
                break;
            } else {
                System.out.println("Некорректный выбор ингредиента.");
            }
        }

        System.out.println("Приготовление напитка...");
        beverage.prepare();
        System.out.println("Напиток готов. Приятного употребления!");
    }
}
