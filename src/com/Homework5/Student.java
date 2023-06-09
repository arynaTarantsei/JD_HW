package com.Homework5;

public class Student {
    private int id;
    private String fullName;
    private String faculty;
    private int course;
    private int group;
    private int birthYear;

    public Student(int id, String fullName, String faculty, int course, int group, int birthYear) {
        this.id = id;
        this.fullName = fullName;
        this.faculty = faculty;
        if (course < 1 || course > 5) {
            throw new IllegalArgumentException("Неправильный номер курса!");
        }
        this.course = course;
        this.group = group;
        this.birthYear = birthYear;
    }

    public String toString() {
        return "ID: " + id + ", ФИО: " + fullName + ", Факультет: " + faculty
                + ", Курс: " + course + ", Группа: " + group + ", Год рождения: " + birthYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course < 1 || course > 5) {
            throw new IllegalArgumentException("Неправильный номер курса!");
        }
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}

