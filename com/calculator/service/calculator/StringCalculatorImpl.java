package com.calculator.service.calculator;

import java.util.Arrays;

public class StringCalculatorImpl implements StringCalculator {

  public static final String DELIMITER_REGEX = "[,\n]";
  private int calledCount = 0; // Counter to track how many times add() is called

  private static int getSumByDelimiter(String numbers, String delimiter) {
    return Arrays.stream(numbers.split(delimiter)).mapToInt(Integer::parseInt).sum();
  }

  @Override
  public int add(String numbers) {

    calledCount++; // Increment the count every time add() is called

    if (numbers.isEmpty()) {
      return 0;
    }
    // Check if the string starts with the custom delimiter format
    if (numbers.startsWith("//")) {
      // Extract the delimiter and the numbers
      int delimiterEndIndex = numbers.indexOf("\n");
      String delimiter = numbers.substring(2, delimiterEndIndex); // Custom delimiter

      // Get the numbers part of the string
      String numbersPart = numbers.substring(delimiterEndIndex + 1);

      // Split the numbers using the custom delimiter
      return getSumByDelimiter(numbersPart, delimiter);
    } else {
      // Default case: split by comma and newline
      return getSumByDelimiter(numbers, DELIMITER_REGEX);
    }
  }

  @Override
  public int getCalledCount() {
    return calledCount;
  }
}