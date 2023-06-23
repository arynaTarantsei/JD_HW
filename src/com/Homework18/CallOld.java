package com.Homework18;

public class CallOld {
    @SuppressWarnings("deprecation")
    public void call() {
        TestAnnotation test = new TestAnnotation();
        String result = test.old();
        System.out.println(result);
    }

    public static void main(String[] args) {
        CallOld caller = new CallOld();
        caller.call();
    }
}