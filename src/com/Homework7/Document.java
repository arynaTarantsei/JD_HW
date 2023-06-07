package com.Homework7;

class Document implements Printable, Cloneable, Comparable<Document> {
    private String name;
    private int pageCount;

    public Document(String name, int pageCount) {
        this.name = name;
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public void print() {
        System.out.println("Документ отправленный на печать: " + name);
    }

    @Override
    public Document clone() throws CloneNotSupportedException {
        return (Document) super.clone();
    }

    @Override
    public int compareTo(Document other) {
        return Integer.compare(this.pageCount, other.pageCount);
    }

    public void setOutdated(boolean b) {
    }
}


