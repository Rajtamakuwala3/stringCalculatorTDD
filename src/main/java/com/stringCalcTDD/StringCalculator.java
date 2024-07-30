package com.stringCalcTDD;

import java.util.LinkedList;
import java.util.List;

//@author : Raj Tamakuwala

public class StringCalculator {


    public int add(String number) {

        //empty string will handle here , give output 0
        if(number.isEmpty()) {
            return 0;
        }
        else {
            //replace non-numeric character with ","
            number = number.replaceAll("[^0-9]+", ",");
            //replace new line with ","
            number = number.replace("\n",",");
            //string split into seperate numbers (string)
            String[] nums = number.split(",");

            //check string is empty or not have any numeric after all replacement
            if(number.replace(",", "").isEmpty()){
                return 0;
            }

            List<String> negativeNumbers = new LinkedList<>();

            int sum = 0;

            //add all non negative numbers
            for(String num : nums) {
                if(!num.isEmpty()) {
                    int tempNumber = Integer.parseInt(num);
                    if(tempNumber < 0){
                        negativeNumbers.add(num);
                    }else{
                        if(!(tempNumber > 1000))
                            sum += Integer.parseInt(num);
                    }
                }
            }
            //if presence of negative number, throw exception.
            if(!negativeNumbers.isEmpty()){
                throw new IllegalArgumentException("Negative numbers not allowed, " + String.join(", " ,negativeNumbers));
            }else {
                return sum;
            }
        }
    }


}
