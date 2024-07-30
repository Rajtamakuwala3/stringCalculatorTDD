package com.testStringCalcTDD;

import com.stringCalcTDD.StringCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class StringCalculatorTest {
    StringCalculator stringCalculator;

    @BeforeEach
    public void init(){
        stringCalculator = new StringCalculator();
    }

    @AfterEach
    public void destroy() {
        stringCalculator = null;
    }

}
