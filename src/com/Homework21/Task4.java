package com.Homework21;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ссылку на страницу:");
        String url = scanner.nextLine();

        System.out.println("Выберите действие (1 - вывести содержимое на экран, 2 - сохранить в файл):");
        int action = scanner.nextInt();

        PageContentHandler contentHandler;
        if (action == 1) {
            contentHandler = new ConsoleContentHandler();
        } else if (action == 2) {
            System.out.println("Введите путь и имя файла для сохранения:");
            String filePath = scanner.next();
            contentHandler = new FileContentHandler(filePath);
        } else {
            System.out.println("Некорректное действие.");
            return;
        }

        PageContentContext context = new PageContentContext(contentHandler);
        context.execute(url);
    }
}
