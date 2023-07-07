package com.Homework8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void printValidEmails(String text) {
        Pattern pattern = Pattern.compile("(\\b[A-Za-z0-9!$%&'+/=?^_`{|}~-]+" +
                "(?:\\.[A-Za-z0-9!$%&'+/=?^_`{|}~-]+)*@(?:[A-Za-z0-9-]+\\.)+[A-Za-z]{2,}\\b)");

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String email = matcher.group();
            System.out.println(email);
        }
    }

    public static void main(String[] args) {
        String text = "Emails:test@example.com,invalid@domain,another.email@domain.com,@invalid.com," +
                "invalid.email@.com,email@domain..com,email@domain-,email@domain.123";
        printValidEmails(text);
    }
}
