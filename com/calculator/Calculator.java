package com.calculator;

import com.calculator.service.test.TestService;
import com.calculator.service.test.TestServiceImpl;

public class Calculator {
  public static void main(String[] args) {
    TestService testService = new TestServiceImpl();
    testService.runTests();
  }
}
