package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    // TODO: Replace these lines with your tests
    @Test
    void testAdd() {
        assertEquals(0, StringCalculator.add(""), "No number Failed");
        assertEquals(2, StringCalculator.add("2"), "1 number failed");
        assertEquals(7, StringCalculator.add("2,5"), "2 number failed");
        assertEquals(10, StringCalculator.add("2,5\n3"), "Newline failed");
        assertThrowsExactly(IllegalArgumentException.class, () -> StringCalculator.add("-2"), "Negative Failed");
        assertEquals(10, StringCalculator.add("1,4,,5"));
    }

//    Missing tests:
//
//- Empty string should return 0
//- Single number should return that number
//- Two numbers separated by comma should return their sum
//- Multiple numbers separated by comma should return their sum
//- Numbers separated by newline should work as delimiter
//- Negative numbers should throw IllegalArgumentException
}
