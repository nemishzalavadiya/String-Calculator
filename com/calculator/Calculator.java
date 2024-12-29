package com.calculator;

import com.calculator.service.test.TestService;
import com.calculator.service.test.TestServiceImpl;

public class Calculator {
  public static void main(String[] args) {
    // execute below cmd for testing this suite
    // java -classpath ./out/production/String-Calculator com.calculator.Calculator
    TestService testService = new TestServiceImpl();
    testService.runTests();
  }
}
