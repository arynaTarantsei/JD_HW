package com.Homework21;
public class Sun {
    private static Sun instance;

    private Sun() {
    }

    public static synchronized Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }

    public String getDescription() {
        return "это звезда, а также центр солнечной системы.";
    }
}
