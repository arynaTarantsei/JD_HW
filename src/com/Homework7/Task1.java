package com.Homework7;
import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {
        Document document1 = new Document("Документ 1", 10);
        Document document2 = new Document("Документ 2", 5);
        Document document3 = new Document("Документ 3", 8);

        Document[] documents = { document1, document2, document3 };

        Arrays.sort(documents);

        System.out.println("Сортировка документов по количеству страниц:");
        for (Document document : documents) {
            System.out.println("Название: " + document.getName() + ", Количество страниц: " + document.getPageCount());
        }

        try {
            Document clonedDocument = document1.clone();

            System.out.println("Сравнение с использованием '==' между оригинальным и клонированным документами: " + (document1 == clonedDocument));
            System.out.println("Сравнение с использованием 'equals' между оригинальным и клонированным документами: " + document1.equals(clonedDocument));
            System.out.println("Сравнение с использованием 'equals' между клонированным документом и другим документом того же класса: " + clonedDocument.equals(new Document("New Document", 0)));

            Object objectRef = clonedDocument;
            Printable printableRef = (Printable) objectRef;
            printableRef.print();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
