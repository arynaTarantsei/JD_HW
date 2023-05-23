package com.Homework6;


    public class Plane extends Aircraft {
        public Plane(int capacity, int liftingCapacity, int range) {
            super(capacity, liftingCapacity, range);
        }

        @Override
        public String getType() {
            return "Самолет";
        }
    }
