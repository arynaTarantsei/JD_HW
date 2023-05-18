package com.Homework5;

public class Task3 {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        students[0] = new Student(1, "Иванов Иван Иванович", "Информатика", 2, 3, 1995);
        students[1] = new Student(2, "Петров Петр Петрович", "Математика", 1, 1, 1998);
        students[2] = new Student(3, "Сидоров Сидор Сидорович", "Информатика", 4, 2, 1993);
        students[3] = new Student(4, "Кузнецов Андрей Иванович", "Физика", 3, 4, 1996);
        students[4] = new Student(5, "Смирнова Анна Петровна", "Информатика", 2, 1, 1997);
        students[5] = new Student(6, "Ковалев Игорь Сергеевич", "Математика", 4, 2, 1994);
        students[6] = new Student(7, "Лебедева Татьяна Михайловна", "Физика", 3, 3, 1995);
        students[7] = new Student(8, "Михайлов Дмитрий Николаевич", "Информатика", 1, 4, 1999);
        students[8] = new Student(9, "Новикова Анастасия Алексеевна", "Математика", 5, 1, 1992);
        students[9] = new Student(10, "Васильев Игорь Петрович", "Физика", 2, 2, 1996);

        StudentManager.printStudentsByCourse(students, 3);
        StudentManager.printStudentsBirthAfter(students, 1994);
    }
}
