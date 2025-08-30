package com.tp2.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
    @Test
    void exampleTest(){
        assertTrue(LeapYear.isleapyear(2000));
        assertTrue(LeapYear.isleapyear(2024));
        assertFalse(LeapYear.isleapyear(1900));
        assertFalse(LeapYear.isleapyear(2000));
    }
}
