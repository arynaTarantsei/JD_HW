package com.Homework20;

public class DateUtils {

    public static boolean isDateOdd(String date) {
        String[] dateParts = date.split(" ");
        String month = dateParts[0];
        int day = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);
        int days = getDaysFromYearStart(month, day, year);
        return days % 2 != 0;
    }

    private static int getDaysFromYearStart(String month, int day, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        int monthIndex = getMonthIndex(month);
        int days = 0;
        for (int i = 0; i < monthIndex; i++) {
            days += daysInMonth[i];
        }
        days += day;
        return days;
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    private static int getMonthIndex(String month) {
        String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
                "OCTOBER", "NOVEMBER", "DECEMBER"};

        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(month)) {
                return i + 1; // Месяцы в Java считаются с 1, а не с 0
            }
        }
        return -1;
    }
}

