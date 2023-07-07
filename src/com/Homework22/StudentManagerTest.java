package com.Homework22;

import com.Homework5.Student;
import com.Homework5.StudentManager;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class StudentManagerTest {

    @Test
    public void testPrintStudentsByCourse() {
        Student[] students = {
                new Student(1, "Иванов Иван Иванович", "Информатика", 2, 3, 1995),
                new Student(2, "Петров Петр Петрович", "Математика", 1, 1, 1998),
                new Student(3, "Сидоров Сидор Сидорович", "Информатика", 4, 2, 1993),
                new Student(4, "Кузнецов Андрей Иванович", "Физика", 3, 4, 1996),
                new Student(5, "Смирнова Анна Петровна", "Информатика", 2, 1, 1997),
                new Student(6, "Ковалев Игорь Сергеевич", "Математика", 4, 2, 1994),
                new Student(7, "Лебедева Татьяна Михайловна", "Физика", 3, 3, 1995),
                new Student(8, "Михайлов Дмитрий Николаевич", "Информатика", 1, 4, 1999),
                new Student(9, "Новикова Анастасия Алексеевна", "Математика", 5, 1, 1992),
                new Student(10, "Васильев Игорь Петрович", "Физика", 2, 2, 1996)
        };

        String expectedOutput = "Студенты 3 курса:\r\n" +
                "ID: 4, ФИО: Кузнецов Андрей Иванович, Факультет: Физика, Курс: 3, Группа: 4, Год рождения: 1996\r\n" +
                "ID: 7, ФИО: Лебедева Татьяна Михайловна, Факультет: Физика, Курс: 3, Группа: 3, Год рождения: 1995\r\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        StudentManager.printStudentsByCourse(students, 3);

        String actualOutput = outputStream.toString();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testPrintStudentsBirthAfter() {
        Student[] students = {
                new Student(1, "Иванов Иван Иванович", "Информатика", 2, 3, 1995),
                new Student(2, "Петров Петр Петрович", "Математика", 1, 1, 1998),
                new Student(3, "Сидоров Сидор Сидорович", "Информатика", 4, 2, 1993),
                new Student(4, "Кузнецов Андрей Иванович", "Физика", 3, 4, 1996),
                new Student(5, "Смирнова Анна Петровна", "Информатика", 2, 1, 1997),
                new Student(6, "Ковалев Игорь Сергеевич", "Математика", 4, 2, 1994),
                new Student(7, "Лебедева Татьяна Михайловна", "Физика", 3, 3, 1995),
                new Student(8, "Михайлов Дмитрий Николаевич", "Информатика", 1, 4, 1999),
                new Student(9, "Новикова Анастасия Алексеевна", "Математика", 5, 1, 1992),
                new Student(10, "Васильев Игорь Петрович", "Физика", 2, 2, 1996)
        };

        String expectedOutput = "Студенты, родившиеся после 1994 года:\r\n" +
                "ID: 1, ФИО: Иванов Иван Иванович, Факультет: Информатика, Курс: 2, Группа: 3, Год рождения: 1995\r\n" +
                "ID: 2, ФИО: Петров Петр Петрович, Факультет: Математика, Курс: 1, Группа: 1, Год рождения: 1998\r\n" +
                "ID: 4, ФИО: Кузнецов Андрей Иванович, Факультет: Физика, Курс: 3, Группа: 4, Год рождения: 1996\r\n" +
                "ID: 5, ФИО: Смирнова Анна Петровна, Факультет: Информатика, Курс: 2, Группа: 1, Год рождения: 1997\r\n" +
                "ID: 7, ФИО: Лебедева Татьяна Михайловна, Факультет: Физика, Курс: 3, Группа: 3, Год рождения: 1995\r\n" +
                "ID: 8, ФИО: Михайлов Дмитрий Николаевич, Факультет: Информатика, Курс: 1, Группа: 4, Год рождения: 1999\r\n" +
                "ID: 10, ФИО: Васильев Игорь Петрович, Факультет: Физика, Курс: 2, Группа: 2, Год рождения: 1996\r\n";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        StudentManager.printStudentsBirthAfter(students, 1994);

        String actualOutput = outputStream.toString();

        assertEquals(expectedOutput, actualOutput);
    }
}
