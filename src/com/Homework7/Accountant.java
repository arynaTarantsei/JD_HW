package com.Homework7;

class Accountant extends Employee {
    public void makeDocumentOutdated(Document document) {
        System.out.println("Бухгалтер работает с этим документом: " + document.getName());
        document.setOutdated(true);
    }
}
