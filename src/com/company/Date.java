package com.company;

public class Date {

    // fields
    int year;
    int month;
    int day;

    // method
    public int getDaysInMonth(){

        if(month == 9 || month == 4 || month == 6 || month == 11){
            return 30;

        }else if(month == 2){
            return 28;
        } else{
            return 31;
        }
    }
}
