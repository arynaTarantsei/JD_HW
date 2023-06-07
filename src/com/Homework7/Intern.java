package com.Homework7;

class Intern extends Employee {
    private int totalDocuments;
    private int currentDocuments;
    private int outdatedDocuments;
    private int totalPageCount;

    public Intern() {
        totalDocuments = 0;
        currentDocuments = 0;
        outdatedDocuments = 0;
        totalPageCount = 0;
    }

    public double calculateAveragePageCount() {
        if (currentDocuments > 0) {
            return (double) totalPageCount / currentDocuments;
        } else {
            return 0.0;
        }
    }

    public void countDocuments() {
        System.out.println("Общее количество документов: " + totalDocuments);
        System.out.println("Актуальные документы: " + currentDocuments);
        System.out.println("Не актуальные документы: " + outdatedDocuments);
    }

    public void work(Document document) {
        super.work(document);
        totalDocuments++;
        if (document.getPageCount() > 0) {
            currentDocuments++;
            totalPageCount += document.getPageCount();
        } else {
            outdatedDocuments++;
        }
    }
}
