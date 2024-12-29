package com.calculator;

import com.calculator.service.StringCalculator;
import com.calculator.service.StringCalculatorImpl;

public class Calculator {
    public static void main(String[] args){
        testAdd_EmptyString();
    }

    public static void testAdd_EmptyString() {
        // initialise string calculator reference
        StringCalculator calculator = new StringCalculatorImpl();
        assert calculator.add("") == 0;
    }
}
