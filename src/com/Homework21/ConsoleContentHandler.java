package com.Homework21;

class ConsoleContentHandler implements PageContentHandler {
    @Override
    public void handleContent(String content) {
        System.out.println("Содержимое страницы:");
        System.out.println(content);
    }

    @Override
    public void saveContent(String content) {
    }
}
