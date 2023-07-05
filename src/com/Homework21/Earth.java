package com.Homework21;

public class Earth {
    private static Earth instance;

    private Earth() {
    }

    public static synchronized Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }

    public String getDescription() {
        return "это третья планета от солнца.";
    }
}
