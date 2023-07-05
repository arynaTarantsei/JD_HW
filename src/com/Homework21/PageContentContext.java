package com.Homework21;
import java.io.*;
import java.net.URL;
class PageContentContext {
    private PageContentHandler contentHandler;

    public PageContentContext(PageContentHandler contentHandler) {
        this.contentHandler = contentHandler;
    }

    public void execute(String url) {
        try {
            String content = readPageContent(url);
            handleContent(content);
            saveContent(content);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении содержимого страницы: " + e.getMessage());
        }
    }

    private String readPageContent(String url) throws IOException {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }
        }

        return content.toString();
    }

    private void handleContent(String content) {
        contentHandler.handleContent(content);
    }

    private void saveContent(String content) {
        contentHandler.saveContent(content);
    }
}
