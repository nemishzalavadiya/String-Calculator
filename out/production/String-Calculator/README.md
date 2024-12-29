# String-Calculator

# TDD Kata 1 - String Calculator

This exercise is designed to teach Test-Driven Development (TDD) through a series of incremental tasks.

## Guidelines Before You Start
- Try not to read ahead.
- Do one task at a time. The trick is to learn to work incrementally.
- Make sure you only test for correct inputs. There is no need to test for invalid inputs in this kata.
- Always write tests first!

## Problem: String Calculator

### Task 1: Basic `Add` Method
1. Create a simple class `StringCalculator` with a method:
   ```csharp
   public int Add(string numbers)
   ```
2. The `Add` method should:
    - Accept 0, 1, or 2 numbers as input.
    - Return their sum.
    - For an empty string, return 0.

   Examples:
    - `""` => `0`
    - `"1"` => `1`
    - `"1,2"` => `3`

3. Start with the simplest test case of an empty string and gradually handle one and two numbers.
4. Refactor after each passing test.

### Task 2: Handle Unknown Amount of Numbers
Extend the `Add` method to handle an unknown number of numbers as input.

### Task 3: Support Newlines as Delimiters
1. Modify the `Add` method to allow newlines (`\n`) as delimiters in addition to commas.

   Examples:
    - `"1\n2,3"` => `6`

2. Invalid input such as `"1,\n"` does not need to be handled or tested.

### Task 4: Support Different Delimiters
1. Add support for custom delimiters defined at the beginning of the string.
    - Format: `"//[delimiter]\n[numbers...]"`

   Example:
    - `"//;\n1;2"` => `3`

2. The default delimiter should be `;`.
3. Ensure that all existing scenarios and tests remain supported.

### Task 5: Handle Negative Numbers
Calling `Add` with a negative number should throw an exception with the message:
   ```
   "Negatives not allowed: [negative_numbers]"
   ```
    - `[negative_numbers]` should list all negative numbers in the input.

### Task 6: Multiple Negative Numbers
If there are multiple negatives, show all of them in the exception message:

Example:
    - Input: `"1,-2,-3"`
    - Exception: `"Negatives not allowed: -2, -3"`

### Task 7: Track `Add` Method Calls
Add a method to `StringCalculator`:
```csharp
public int GetCalledCount()
```
This method should return the number of times the `Add` method has been invoked.

### Task 8: Ignore Numbers Greater Than 1000
1. Modify the `Add` method to ignore numbers greater than 1000.

   Example:
    - Input: `"2,1001"`
    - Output: `2`

### Task 9: Support Delimiters of Any Length
1. Modify the custom delimiter format to support delimiters of any length.
    - Format: `"//[delimiter]\n"`

   Example:
    - Input: `"//[***]\n1***2***3"`
    - Output: `6`

### Task 10: Support Multiple Delimiters
1. Allow multiple custom delimiters using the following format:
   ```
   "//[delim1][delim2]\n"
   ```

   Example:
    - Input: `"//[*][%]\n1*2%3"`
    - Output: `6`

### Task 11: Support Multiple Delimiters of Varying Lengths
1. Extend the functionality to handle multiple delimiters with varying lengths.

   Example:
    - Input: `"//[**][%%]\n1**2%%3"`
    - Output: `6`

### CMD to run the java calculator

`java -ea -classpath ./out/production/String-Calculator com.calculator.Calculator`
