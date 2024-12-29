package com.calculator.service;

public class StringCalculatorImpl implements StringCalculator {

    @Override
    public int add(String numbers) {
        if(numbers.isEmpty()){
            return 1;
        }
        return Integer.parseInt(numbers); // Handles a single number
    }
}