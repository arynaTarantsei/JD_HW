package com.Homework21;

public class Task1 {
    public static void main(String[] args) {
        Sun sun = Sun.getInstance();
        Moon moon = Moon.getInstance();
        Earth earth = Earth.getInstance();

        System.out.println("Описание планет:");
        System.out.println("Солнце: " + sun.getDescription());
        System.out.println("Луна: " + moon.getDescription());
        System.out.println("Земля: " + earth.getDescription());
    }
}

