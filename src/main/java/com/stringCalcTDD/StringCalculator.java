package com.stringCalcTDD;

public class StringCalculator {
    public int add(String number) {
        if(number.isEmpty()) {
            return 0;
        }
        else {
            return Integer.parseInt(number);
        }
    }
}
