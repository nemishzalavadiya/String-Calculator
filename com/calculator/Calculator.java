package com.calculator;

import com.calculator.service.StringCalculator;
import com.calculator.service.StringCalculatorImpl;

public class Calculator {
    public static void main(String[] args){
        testAdd_EmptyString();
        testAdd_SingleNumberString();
        testAdd_TwoNumberString();
    }

    public static void testAdd_EmptyString() {
        // initialise string calculator reference
        StringCalculator calculator = new StringCalculatorImpl();
        assert calculator.add("") == 0;
    }

    public static void testAdd_SingleNumberString() {
        // initialise string calculator reference
        StringCalculator calculator = new StringCalculatorImpl();
        assert calculator.add("1") == 1;
    }

    public static void testAdd_TwoNumberString() {
        // initialise string calculator reference
        StringCalculator calculator = new StringCalculatorImpl();
        assert calculator.add("1,2") == 3;
    }
}
