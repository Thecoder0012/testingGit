package com.company;

public class Date {

    // fields
    int year;
    int month;
    int day;

    // method
    public int getDaysInMonth() {

        if (month == 9 || month == 4 || month == 6 || month == 11) {
            return 30;

        } else if (month == 2) {
            if (leapYear()) {
                return 29;
            } else {
                return 28;

            }
        } else {
            return 31;
        }
    }

    public int getDaysInYear() {
        if (leapYear()) {
            return 366;

        } else {
            return 365;
        }
    }

    public boolean leapYear() {

        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));

    }
}
