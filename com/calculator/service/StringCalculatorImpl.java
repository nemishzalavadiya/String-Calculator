package com.calculator.service;

public class StringCalculatorImpl implements StringCalculator {

    @Override
    public int add(String numbers) {
        if(numbers.isEmpty()){
            return 0;
        }
        String[] parts = numbers.split(",");
        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }
        return sum;
    }
}