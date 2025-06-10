# Java Programming Practice

This repository contains weekly Java programming practice exercises.

## Week 01

Contains basic Java programs demonstrating fundamental concepts:

1. **Sum.java** - Program that takes two integers from user and calculates their sum using Scanner class.
2. **Calc.java** - Program that performs basic arithmetic operations (sum, subtraction, multiplication, division, remainder) using command-line arguments.
3. **Time.java** - Program that converts seconds into hours, minutes, and seconds format.
4. **PolarityOfNumber.java** - Program that determines if a given floating-point number is positive, negative, or zero.
5. **MonthInfo.java** - Program that displays month information (name and number of days) based on month number input.

## Week 02

Contains object-oriented programming exercises:

1. **Book Exercise**
   - `Book.java` - Class with private fields (title, author, price), constructors, getters/setters, and displayInfo method
   - `BookTest.java` - Test class demonstrating Book class functionality

2. **Rectangle Exercise**
   - `Rectangle.java` - Class with private fields (length, width), constructors, getters/setters, and area/perimeter calculations
   - `RectangleTest.java` - Test class demonstrating Rectangle class functionality

3. **Bank Account Exercise**
   - `Account.java` - Class with private fields (accountNumber, accountHolder, balance), banking operations (deposit, withdraw)
   - `AccountTest.java` - Test class demonstrating Account class functionality with sample transactions

### How to Run

1. Compile any program:
```bash
javac ClassName.java
```

2. Run the compiled program:
```bash
java ClassName
```

Note: For test classes, compile both the main class and test class together:
```bash
javac MainClass.java TestClass.java
java TestClass
```

For example, to run Book exercise:
```bash
javac Book.java BookTest.java
java BookTest
``` 