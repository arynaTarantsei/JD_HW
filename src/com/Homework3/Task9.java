package com.Homework3;

public class Task9 {
    public static void main(String[] args) {
        String s = "0123456789";
        String a = "123456789";
        System.out.print(TwiceString(s, 1));
        System.out.print(TwiceString(a, 2));
        System.out.print(TwiceString(a, 3));
        System.out.print(TwiceString(a, 4));
    }

    public static String TwiceString(String src, int a) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : src.toCharArray()) {
            if (Character.isDigit(c)) {
                for (int i = 0; i < a; i++) {
                    stringBuilder.append(c);
                }
            } else stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}