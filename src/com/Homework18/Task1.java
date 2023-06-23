package com.Homework18;
import java.lang.reflect.Method;
public class Task1 {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Method[] methods = stringClass.getDeclaredMethods();

        for (Method method : methods) {
            if (!method.isSynthetic() && !java.lang.reflect.Modifier.isStatic(method.getModifiers())) {
                System.out.println(method.getName());
            }
        }
    }
}