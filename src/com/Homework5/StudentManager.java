package com.Homework5;

public class StudentManager {
    public static void printStudentsByCourse(Student[] students, int course) {
        System.out.println("Студенты " + course + " курса:");
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s);
            }
        }
    }

    public static void printStudentsBirthAfter(Student[] students, int year) {
        System.out.println("Студенты, родившиеся после " + year + " года:");
        for (Student s : students) {
            if (s.getBirthYear() > year) {
                System.out.println(s);
            }
        }
    }
}
