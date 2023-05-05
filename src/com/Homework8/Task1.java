package com.Homework8;
import java.util.Scanner;
public class Task1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String replacement = "www";
            String result;
            if (s.startsWith("abc")) {
                result=replacement.concat(s.substring(3));
                System.out.println(result);
            } else {
                System.out.println(s+"zzz");
            }
        }
    }
