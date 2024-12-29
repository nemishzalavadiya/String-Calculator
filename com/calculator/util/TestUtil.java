package com.calculator.util;

import com.calculator.service.StringCalculator;
import com.calculator.service.StringCalculatorImpl;

public class TestUtil {

    // reuse same class reference of static class
    // initialise string calculator reference
    public static StringCalculator calculator = new StringCalculatorImpl();

    public static void task1(){
        testAddEmptyString();
        testAddSingleNumberString();
        testAddTwoNumberString();
    }

    public static void task2(){
        testAddMultipleNumberString();
    }

    public static void task3(){
        testAddAllowNewLineAsDelimiter();
    }

    public static void task4(){
        testAddCustomDefaultDelimiter();
    }

    private static void testAddEmptyString() {
        AssertUtil.assertResponse(calculator.add(""),0);
    }

    private static void testAddSingleNumberString() {
        AssertUtil.assertResponse(calculator.add("1"),1);
    }

    private static void testAddTwoNumberString() {
        AssertUtil.assertResponse(calculator.add("1,2"),3);
    }

    private static void testAddMultipleNumberString() {
        AssertUtil.assertResponse(calculator.add("1,2,3,4,5"),15);
    }

    private static void testAddAllowNewLineAsDelimiter() {
        AssertUtil.assertResponse(calculator.add("1\n2,3"),6);
    }

    private static void testAddCustomDefaultDelimiter() {
        AssertUtil.assertResponse(calculator.add("//;\n1;2"),3);
    }
}
