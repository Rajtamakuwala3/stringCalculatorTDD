package com.testStringCalcTDD;

import com.stringCalcTDD.StringCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    public void testAdd() {
        assertEquals(0, stringCalculator.add(""));
        assertEquals(1, stringCalculator.add("1"));
        assertEquals(2, stringCalculator.add("2"));
    }

    @Test
    public void testMultipleNumbers() {
        assertEquals(3, stringCalculator.add("1,2"));
        assertEquals(9, stringCalculator.add("2,3,4"));
    }
}
