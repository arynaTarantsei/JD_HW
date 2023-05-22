package com.Homework10;

public class Task1 {
    public static void main(String[] args) {
        String s = null;
        try {
            if (Math.random() > 0.5) {
                s.length();
            } else {
                Integer.parseInt(s);
            }
        } catch (NullPointerException e) { //NumberFormatException не обработан. если несколько раз запустить программу. то ошибка летит в JVM
            System.out.println("Выброшено исключение: " + e.getClass());
        }
    }
}
