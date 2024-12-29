package com.calculator;

import com.calculator.service.test.TestService;

public class Calculator {
  public static void main(String[] args) {
    TestService testService = new TestService();
    testService.runTests();
  }
}
