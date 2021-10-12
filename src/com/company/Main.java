package com.company;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        date.year = 2010;
        date.month = 2;
        date.day = 9;

        Date date2 = new Date();
        date2.year = 2008;
        date2.month = 10;
        date2.day = 10;

        System.out.println(date.getDaysInMonth());
        System.out.println(date.leapYear());
        System.out.println(date2.getDaysInMonth());
        System.out.println(date2.leapYear());


    }

}
