package com.tp2.stringcalculator;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    public static int add(String numbers) {
        // TODO: Implement the add method following TDD approach
        // Start with the simplest case and build incrementally
        if (numbers.isEmpty()) {
            return 0;
        }
        if (!numbers.contains("-")) {
            return sumnumbs(numbers);
        }
        throw new IllegalArgumentException();
    }
    public static int sumnumbs(String numbers) {
        int buffer = 0;
        for (String number: numbers.split("[,\n]")) {
            if (!number.isEmpty()) {
                buffer += (Integer.parseInt(number.strip()));
            }
        }
        return buffer;
    }
}