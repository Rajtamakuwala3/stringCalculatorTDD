package com.stringCalcTDD;

import java.util.LinkedList;
import java.util.List;

public class StringCalculator {
    public int add(String number) {
        if(number.isEmpty()) {
            return 0;
        }
        else {
            number = number.replaceAll("[^0-9]+", ",");
            number = number.replace("\n",",");
            String[] nums = number.split(",");

            if(number.replace(",", "").isEmpty()){
                return 0;
            }

            List<String> negativeNumbers = new LinkedList<>();

            int sum = 0;

            for(String num : nums) {
                if(!num.isEmpty()) {
                    if(Integer.parseInt(num)<0){
                        negativeNumbers.add(num);
                    }else{
                        sum += Integer.parseInt(num);
                    }
                }
            }
            if(!negativeNumbers.isEmpty()){
                throw new IllegalArgumentException("Negative numbers not allowed, " + String.join(", " ,negativeNumbers));
            }else {
                return sum;
            }
        }
    }


}
