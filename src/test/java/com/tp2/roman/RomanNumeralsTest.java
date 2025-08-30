package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    // TODO: Replace these lines with your tests
    @Test
    void simpletest(){
        assertEquals("I",RomanNumerals.convert(1));
        assertEquals("V",RomanNumerals.convert(5));
        assertEquals("X",RomanNumerals.convert(10));
        assertEquals("L",RomanNumerals.convert(50));
        assertEquals("C",RomanNumerals.convert(100));
        assertEquals("D",RomanNumerals.convert(500));
        assertEquals("M",RomanNumerals.convert(1000));
    }

    @Test
    void subtracttest(){
        assertEquals("IV",RomanNumerals.convert(4));
        assertEquals("IX",RomanNumerals.convert(9));
        assertEquals("XL",RomanNumerals.convert(40));
        assertEquals("XC",RomanNumerals.convert(90));
        assertEquals("CD",RomanNumerals.convert(400));
        assertEquals("CM",RomanNumerals.convert(900));
    }

    @Test
    void complextest(){
        assertEquals("MCMXCIV",RomanNumerals.convert(1994));
        assertEquals("MMXXIII",RomanNumerals.convert(2023));
    }

}
