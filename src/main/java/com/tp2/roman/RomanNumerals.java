package com.tp2.roman;

import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {
    
    public static String convert(int number) {
        int abuffer = number;
        int i = 0;
        List<String> rbuffer = new ArrayList<String>();
        int[] arabic = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        while(abuffer>0){
            if (abuffer / arabic[i] >= 0){
                rbuffer.add(roman[i]);
                abuffer -= arabic[i];
            }
            else {
                i += 1;
            }
        }
        return String.join("", rbuffer);
    }
}
