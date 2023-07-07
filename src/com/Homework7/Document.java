package com.Homework7;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Document other = (Document) obj;
        return name.equals(other.name) && pageCount == other.pageCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pageCount);
    }

    @Override
    public String toString() {
        return "Название: " + name + ", Количество страниц: " + pageCount;
    }

    public void setOutdated(boolean b) {
    }
}