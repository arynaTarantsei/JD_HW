package com.Homework7;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Employee intern = new Intern();
        Employee accountant = new Accountant();

        Document document4 = new Document("Документ 4", 7);
        Document document5 = new Document("Документ 5", 3);

        intern.work(document4);
        intern.work(document5);

        accountant.work(document4);
        accountant.work(document5);

        ((Intern) intern).countDocuments();
        System.out.println("Среднее арифметическое количества страниц: " + ((Intern) intern).calculateAveragePageCount());
    }
}