package com.Homework9;

public class NumberClass <T extends Number>{
    T number;

    public NumberClass(T number) {
        this.number = number;
    }

    public boolean compareStringLength(T otherNumber) {
        String str1 = number.toString();
        String str2 = otherNumber.toString();
        return str1.length() == str2.length();
    }
}
