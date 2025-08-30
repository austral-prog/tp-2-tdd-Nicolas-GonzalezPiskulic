package com.tp2.leapyear;


public class LeapYear {

    public static boolean isleapyear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
