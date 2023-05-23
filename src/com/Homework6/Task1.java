package com.Homework6;

public class Task1 {
    public static void main(String[] args) {
        Man man1 = new Man("Сергей", 25, 'M', 70.5);
        Student student1 = new Student("Никита", 20, 'M', 65.0, 1);
        Student student2 = new Student("Анна", 21, 'F', 55.5, 2);

        man1.setName("Олег");
        man1.setAge(30);
        man1.setWeight(80.5);

        student1.setName("Артём");
        student1.setAge(22);
        student1.setWeight(75.0);
        student1.setYearOfStudy(3);
        student1.increaseYearOfStudy();

        Man man3 = student2;

        System.out.println("Меня зовут " + man1.getName() + ", мне " + man1.getAge() + " лет, " + "я вешу " + man1.getWeight() + " килограмм.");
        System.out.println("Меня зовут " + student1.getName() + ", мне " + student1.getAge() + " года, я вешу " + student1.getWeight() + " килограмм, я учусь на " + student1.getYearOfStudy() + " году обучения");
        System.out.println("Меня зовут " + man3.getName() + ", мне " + man3.getAge() + " год, " + "я вешу " + man3.getWeight() + " килограмм.");
    }
}
