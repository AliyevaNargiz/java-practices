# Java Programming Practice

This repository contains weekly Java programming practice exercises, organized by week.

## Week 01
Basic Java programs demonstrating fundamental concepts:
- **Sum.java**: Takes two integers from user and prints their sum.
- **Calc.java**: Performs arithmetic operations using command-line arguments.
- **Time.java**: Converts seconds to hours, minutes, and seconds.
- **PolarityOfNumber.java**: Checks if a number is positive, negative, or zero.
- **MonthInfo.java**: Prints month name and number of days for a given month number.

## Week 02
Object-oriented programming exercises:
- **Book.java, BookTest.java**: Book class with fields, methods, and a test class.
- **Rectangle.java, RectangleTest.java**: Rectangle class with area/perimeter and a test class.
- **Account.java, AccountTest.java, InvalidAmountException.java**: Account class with custom exception and a test class.

## Week 03
Array and method practice, and object cloning:
- **MinMaxDemo.java**: Finds min and max in arrays (from command line and Scanner).
- **SlicesDemo.java**: Prints all possible slices of a word.
- **Segment.java, SegmentDemo.java, Point.java**: Segment and Point classes, with min segment finder and clone method.
- **MathDemo.java**: Static methods for min, max, sum, mean, factorial.

## Week 04
Exception handling and robust class design:
- **InvoiceDemo.java**: Invoice class with validation and exception handling in one file.
- **AccountDemo.java**: Account class, custom exception, and main method in one file.
- **CountLetters.java**: Counts letters in words, ignores non-alphabetic words with exception handling.
- **Factorial.java**: Factorial calculation with exception handling for negative input.
- **Stack.java**: Stack class with custom exceptions for overflow and underflow.

## Week 05
Functional programming and lambda expressions:
- **SpecificPropertyDemo.java**: Demonstrates the SpecificProperty functional interface with lambda implementations for checking if an integer is odd, if a point is in the first quadrant, if a string is a pangram, and if a person is older than 20. Includes a generic filter method.
- **CalculatorDemo.java**: Defines a Calculator functional interface and uses lambda expressions for addition, subtraction, multiplication, division, and exponentiation.
- **EmployeeSortDemo.java**: Defines an Employee class and demonstrates sorting an array of employees by firstname, age, and salary using lambda expressions and method references.
- **StreamApiDemo.java**: Demonstrates Java 8 Stream API usage, including instantiation, initialization, and methods such as allMatch, noneMatch, anyMatch, count, generate, limit, forEach, findFirst, findAny, ifPresentOrElse, filter, sorted, collect, map, and reduce, with lambda expressions.

---

## How to Run
1. Navigate to the folder for the week you want to test:
   ```sh
   cd "week 01"  # or week 02, week 03, week 04
   ```
2. Compile the Java file(s):
   ```sh
   javac FileName.java
   ```
3. Run the program:
   ```sh
   java ClassName
   ```
- For files with a main method, use the class containing `public static void main`.
- For test/demo files, compile both the main class and the test/demo class together if needed.

---

Each week folder contains a README-friendly structure and code that is easy to compile, run, and understand for students and instructors alike. 