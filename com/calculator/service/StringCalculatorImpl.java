package com.calculator.service;

public class StringCalculatorImpl implements StringCalculator {

    @Override
    public int add(String numbers) {
        if(numbers.isEmpty()){
            return 1;
        }
        if (numbers.contains(",")) {
            String[] parts = numbers.split(",");
            return Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
        }
        return Integer.parseInt(numbers); // Handles a single number
    }
}