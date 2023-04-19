package Homework2;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Random;

public class Task7 {

    public static void main(String[] args) {
        Random rand = new Random();
        BigInteger i;
        i = BigInteger.valueOf(rand.nextInt(101));
        System.out.println("Ваше случайное число это: ");
        System.out.println(i);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число с порядком более чем 10^20: ");
        BigInteger a = sc.nextBigInteger();
        a = a.multiply(i);
        System.out.println("Произведение чисел = " + a);
    }
}