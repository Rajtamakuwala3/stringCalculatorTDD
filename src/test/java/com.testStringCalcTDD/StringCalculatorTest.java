package com.testStringCalcTDD;

import com.stringCalcTDD.StringCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
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
    @DisplayName("Test for empty string and single number")
    public void testAdd() {
        assertEquals(0, stringCalculator.add(""));
        assertEquals(1, stringCalculator.add("1"));
        assertEquals(2, stringCalculator.add("2"));
    }

    @Test
    @DisplayName("Test for multiple numbers")
    public void testMultipleNumbers() {
        assertEquals(3, stringCalculator.add("1,2"));
        assertEquals(9, stringCalculator.add("2,3,4"));
    }

    @Test
    @DisplayName("Test for new line")
    public void testNewLine() {
        assertEquals(7, stringCalculator.add("1,2\n4"));
    }

    @Test
    @DisplayName("Test for special characters")
    public void testSpecialChar() {
        assertEquals(9, stringCalculator.add("3,@3@3"));
    }

    @Test
    @DisplayName("Test for negative numbers")
    public void testNegativeNumber() {
        try{
            stringCalculator.add("-1,3,6\\r");
        }catch(IllegalArgumentException e){
            assertThat(e.getMessage(),containsString("Negatives not allowed"));
        }
    }

    @Test
    @DisplayName("Test for string without number")
    public void testStringWithoutNumber() {
        assertEquals(0, stringCalculator.add("Raj Tamakuwala"));
    }

}
