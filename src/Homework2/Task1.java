package Homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = sc.nextInt();
        System.out.println("Введите второе число: ");
        int y = sc.nextInt();
        int l = x + y;
        String convert = Integer.toBinaryString(l);
        System.out.println("Число в двоичной системе: " + convert);
        convert = Integer.toHexString(l);
        System.out.println("Число в шестиричной системе: " + convert);
        convert = Integer.toOctalString(l);
        System.out.println("Число в восьмеричной системе: " + convert);
        System.out.println("Число в десятичной системе: " + l);
    }
}
