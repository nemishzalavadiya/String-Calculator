package com.calculator.util;

public class AssertUtil {
  public static void assertResponse(int actual, int expected) {
    // to enable assert for throwing errors use flag -ea with java cmd
    assert actual == expected;
  }
}
