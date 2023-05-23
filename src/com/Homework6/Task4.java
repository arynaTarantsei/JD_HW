package com.Homework6;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        Airline airline = new Airline();
        Plane plane1 = new Plane(100, 5000, 3000);
        Plane plane2 = new Plane(150, 7000, 4000);
        Helicopter helicopter = new Helicopter(10, 500, 500);
        Quadcopter quadcopter = new Quadcopter(2, 50, 50);

        airline.addAircraft(plane1);
        airline.addAircraft(plane2);
        airline.addAircraft(helicopter);
        airline.addAircraft(quadcopter);

        System.out.println("Общая вместимость: " + airline.getTotalCapacity());
        System.out.println("Общая грузоподъемность: " + airline.getTotalLiftingCapacity());
        System.out.println("Средняя дальность полета: " + airline.getAverageRange());

        System.out.println("Список воздушных судов, отсортированных по возрастанию дальности полета:");
        airline.sortByRange();
        System.out.println(airline);

        System.out.println("Список подходящих воздушных судов для заданных параметров (100 человек, грузоподъемность 500 кг, дальность полета 3000 км):");
        List<Aircraft> suitableAircraft = airline.findSuitableAircraft(100, 500, 3000);
        if (suitableAircraft.isEmpty()) {
            System.out.println("Подходящих воздушных судов не найдено");
        } else {
            for (Aircraft aircraft : suitableAircraft) {
                System.out.println(aircraft);
            }
        }
    }
}
