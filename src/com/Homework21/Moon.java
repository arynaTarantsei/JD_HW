package com.Homework21;

public class Moon {
    private static Moon instance;

    private Moon() {
    }

    public static synchronized Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }

    public String getDescription() {
        return "это единственный спутник земли.";
    }
}
