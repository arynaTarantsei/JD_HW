package com.Homework6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Airline {
    private List<Aircraft> aircrafts;

    public Airline() {
        aircrafts = new ArrayList<>();
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public int getTotalCapacity() {
        int totalCapacity = 0;
        for (Aircraft aircraft : aircrafts) {
            totalCapacity += aircraft.getCapacity();
        }
        return totalCapacity;
    }

    public int getTotalLiftingCapacity() {
        int totalLiftingCapacity = 0;
        for (Aircraft aircraft : aircrafts) {
            totalLiftingCapacity += aircraft.getLiftingCapacity();
        }
        return totalLiftingCapacity;
    }

    public int getAverageRange() {
        int totalRange = 0;
        for (Aircraft aircraft : aircrafts) {
            totalRange += aircraft.getRange();
        }
        return totalRange / aircrafts.size();
    }

    public void sortByRange() {
        Collections.sort(aircrafts, Comparator.comparing(Aircraft::getRange));
    }

    public List<Aircraft> findSuitableAircraft(int capacity, int liftingCapacity, int range) {
        List<Aircraft> suitableAircraft = new ArrayList<>();
        for (Aircraft aircraft : aircrafts) {
            if (aircraft.getCapacity() >= capacity && aircraft.getLiftingCapacity() >= liftingCapacity
                    && aircraft.getRange() >= range) {
                suitableAircraft.add(aircraft);
            }
        }
        return suitableAircraft;
    }

    @Override
    public String toString() {
        return "Авиакомпания [воздушные суда=" + aircrafts + "]";
    }
}
