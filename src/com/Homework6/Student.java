package com.Homework6;

public class Student extends Man {
    private int yearOfStudy;

    public Student(String name, int age, char gender, double weight, int yearOfStudy) {
        super(name, age, gender, weight);
        this.yearOfStudy = yearOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void increaseYearOfStudy() {
        this.yearOfStudy++;
    }
}
