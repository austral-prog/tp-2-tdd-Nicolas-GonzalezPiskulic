package com.tp2.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
    @Test
    void exampleTest(){
        assertTrue(LeapYear.isleapyear(2024));
        assertTrue(LeapYear.isleapyear(2000));
        assertFalse(LeapYear.isleapyear(2025));
        assertFalse(LeapYear.isleapyear(1900));
    }
}
