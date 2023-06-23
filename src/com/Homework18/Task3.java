package com.Homework18;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Task3 {
    public static void main(String[] args) {
        try {
            Class<?> linkedListClass = Class.forName("java.util.LinkedList");

            Field[] fields = linkedListClass.getDeclaredFields();
            System.out.println("Поля класса:");
            for (Field field : fields) {
                System.out.println(field.toString());
            }
            System.out.println();

            Class<?> superclass = linkedListClass.getSuperclass();
            System.out.println("Родительский класс:");
            System.out.println(superclass.getName());
            System.out.println();

            Method[] methods = linkedListClass.getDeclaredMethods();
            System.out.println("Методы класса:");
            for (Method method : methods) {
                System.out.println(method.toString());
            }
            System.out.println();

            Constructor<?>[] constructors = linkedListClass.getConstructors();
            System.out.println("Конструкторы класса:");
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor.toString());
            }
            System.out.println();

            Class<?>[] innerClasses = linkedListClass.getDeclaredClasses();
            if (innerClasses.length > 0) {
                System.out.println("Внутренние классы:");
                for (Class<?> innerClass : innerClasses) {
                    System.out.println(innerClass.getName());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
