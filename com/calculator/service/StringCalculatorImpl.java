package com.calculator.service;

import java.util.Arrays;

public class StringCalculatorImpl implements StringCalculator {

    public static final String DELIMITER_REGEX = "[,\n]";

    @Override
    public int add(String numbers) {
        if(numbers.isEmpty()){
            return 0;
        }
        // Split by both comma and newline
        return Arrays.stream(numbers.split(DELIMITER_REGEX))  // Regex to match both comma and newline
                .mapToInt(Integer::parseInt)
                .sum();
    }
}