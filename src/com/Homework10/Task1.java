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
        } catch (NullPointerException e) {
            System.out.println("Выброшено исключение: " + e.getClass());
        } catch (NumberFormatException e) {
            System.out.println("Выброшено исключение: " + e.getClass());
        }
    }
}
