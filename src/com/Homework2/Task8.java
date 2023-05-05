package com.Homework2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        System.out.println("Введите число: ");
        double i = sc.nextDouble();
        BigDecimal v=new BigDecimal(i);
        BigDecimal r = v.setScale(3, RoundingMode.HALF_EVEN);
        System.out.println(r);
    }//Переделала на бигдецимал, но он всё-равно округляет 155.8945 как 155.894, а если сделать up, то тогда и 155.8944 округляет к 5(((
}
