package com.calculator.util;

import java.util.List;

public class ValidationUtil {
  public static void checkForNegatives(List<Integer> numbers) {
    // Filter negative numbers
    List<Integer> negatives = numbers.stream().filter(num -> num < 0).toList();

    if (!negatives.isEmpty()) {
      // Throw an exception with the list of negative numbers
      throw new IllegalArgumentException("negatives not allowed: " + negatives);
    }
  }
}
