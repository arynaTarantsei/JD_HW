package com.Homework20;
import java.time.LocalDate;
import java.util.Scanner;
public class GreetingProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String language = "en"; // Значение по умолчанию - английский язык

        while (true) {
            System.out.println("Введите команду (ru, be, en) или 'end' для завершения:");

            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("ru")) {
                language = "ru";
                greetUser(language);
            } else if (command.equalsIgnoreCase("be")) {
                language = "be";
                greetUser(language);
            } else if (command.equalsIgnoreCase("en")) {
                language = "en";
                greetUser(language);
            } else if (command.equalsIgnoreCase("end")) {
                break; // Завершаем программу, если введена команда "end"
            } else {
                System.out.println("Некорректная команда!");
            }
        }
    }

    public static void greetUser(String language) {
        LocalDate currentDate = LocalDate.now();

        switch (language) {
            case "ru":
                System.out.println("Приветствую! Текущая дата: " + currentDate);
                break;
            case "be":
                System.out.println("Вiтанне! Бяжэчная дата: " + currentDate);
                break;
            case "en":
            default:
                System.out.println("Welcome! Current date: " + currentDate);
                break;
        }
    }
}
