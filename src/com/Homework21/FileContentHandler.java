package com.Homework21;
import java.io.*;
class FileContentHandler implements PageContentHandler {
    private String filePath;

    public FileContentHandler(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void handleContent(String content) {
    }

    @Override
    public void saveContent(String content) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println(content);
            System.out.println("Содержимое страницы сохранено в файл: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении содержимого страницы: " + e.getMessage());
        }
    }
}