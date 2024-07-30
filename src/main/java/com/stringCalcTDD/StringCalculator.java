package com.stringCalcTDD;

public class StringCalculator {
    public int add(String number) {
        if(number.isEmpty()) {
            return 0;
        }
        else {
            String[] nums = number.split(",");
            int sum = 0;

            for(String num : nums) {
                sum += Integer.parseInt(num);
            }
            return sum;
        }
    }


}
