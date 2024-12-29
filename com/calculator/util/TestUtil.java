package com.calculator.util;

import com.calculator.service.StringCalculator;
import com.calculator.service.StringCalculatorImpl;

public class TestUtil {

    // reuse same class reference of static class
    // initialise string calculator reference
    public static StringCalculator calculator = new StringCalculatorImpl();

    public static void task1(){
        testAdd_EmptyString();
        testAdd_SingleNumberString();
        testAdd_TwoNumberString();
    }

    public static void task2(){
        testAdd_MultipleNumberString();
    }

    public static void task3(){
        testAdd_AllowNewLineAsDelimiter();
    }

    private static void testAdd_EmptyString() {
        AssertUtil.assertResponse(calculator.add(""),0);
    }

    private static void testAdd_SingleNumberString() {
        AssertUtil.assertResponse(calculator.add("1"),1);
    }

    private static void testAdd_TwoNumberString() {
        AssertUtil.assertResponse(calculator.add("1,2"),3);
    }

    private static void testAdd_MultipleNumberString() {
        AssertUtil.assertResponse(calculator.add("1,2,3,4,5"),15);
    }

    private static void testAdd_AllowNewLineAsDelimiter() {
        AssertUtil.assertResponse(calculator.add("1\n2,3"),6);
    }
}
