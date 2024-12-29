package com.calculator.service.test;

import com.calculator.service.calculator.StringCalculator;
import com.calculator.service.calculator.StringCalculatorImpl;
import com.calculator.util.AssertUtil;

public class TestService {
  // reuse same class reference of static class
  // initialise string calculator reference
  public static StringCalculator calculator = new StringCalculatorImpl();

  public void runTests() {
    this.task1();
    this.task2();
    this.task3();
    this.task4();
    //    this.task5();
    //    this.task6();
    this.task7();
    // skip test 8 as it's only for .Net
    this.task9();
  }

  public void task1() {
    testAddEmptyString();
    testAddSingleNumberString();
    testAddTwoNumberString();
  }

  public void task2() {
    testAddMultipleNumberString();
  }

  public void task3() {
    testAddAllowNewLineAsDelimiter();
  }

  public void task4() {
    testAddCustomDefaultDelimiter();
  }

  public void task5() {
    testAddNegativeNumber();
  }

  public void task6() {
    testAddNegativeNumbers();
  }

  public void task7() {
    testAddAndGetCalledCount();
  }

  public void task9() {
    testAddNumberGreaterThanThousandIgnored();
  }

  private void testAddEmptyString() {
    AssertUtil.assertResponse(calculator.add(""), 0);
  }

  private void testAddSingleNumberString() {
    AssertUtil.assertResponse(calculator.add("1"), 1);
  }

  private void testAddTwoNumberString() {
    AssertUtil.assertResponse(calculator.add("1,2"), 3);
  }

  private void testAddMultipleNumberString() {
    AssertUtil.assertResponse(calculator.add("1,2,3,4,5"), 15);
  }

  private void testAddAllowNewLineAsDelimiter() {
    AssertUtil.assertResponse(calculator.add("1\n2,3"), 6);
  }

  private void testAddCustomDefaultDelimiter() {
    AssertUtil.assertResponse(calculator.add("//;\n1;2"), 3);
  }

  private void testAddNegativeNumber() {
    calculator.add("//;\n-1;2");
  }

  private void testAddNegativeNumbers() {
    calculator.add("//;\n-1;2;-2;-3");
  }

  private void testAddAndGetCalledCount() {

    StringCalculator stringCalculator = new StringCalculatorImpl();

    // Initially, the count should be 0
    AssertUtil.assertResponse(stringCalculator.getCalledCount(), 0);

    // Call add() a few times
    stringCalculator.add("1");
    stringCalculator.add("1,2");
    stringCalculator.add("//;\n1;2");

    // After calling add() three times, the count should be 3
    AssertUtil.assertResponse(stringCalculator.getCalledCount(), 3);
  }

  private void testAddNumberGreaterThanThousandIgnored() {
    AssertUtil.assertResponse(calculator.add("//;\n2;1001"), 2);
  }
}
