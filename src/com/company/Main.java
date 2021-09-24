package com.company;

import java.util.Scanner;

/**
 * A class for Computation functions
 */
class Compute {
    Scanner sc = new Scanner(System.in);
    int x, y;

    int getSum(int x, int y) {
        return x + y;
    }

    int getDifference(int x, int y) {
        return x - y;
    }

    int getProduct(int x, int y) {
        return x * y;
    }

    double getQuotient(double x, double y) {
        return x / y;
    }

    int getRemainder(int x, int y) {
        return x % y;
    }

    void printConsole() {
        System.out.print("Enter your first number: ");
        x = sc.nextInt();
        System.out.print("Enter your second number: ");
        y = sc.nextInt();
    }

}
/**
 * 1. A Java program that takes two numbers as input and display the product of two numbers.
 */
class Class1 extends Compute {
    @Override
    void printConsole() {
        super.printConsole();
        System.out.println("Product: " + getProduct(x, y));
    }
}
// - Bausa

/**
 * 2. A Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 */
class Class2 extends Compute {
    @Override
    void printConsole() {
        super.printConsole();
        System.out.println("Sum: " + getSum(x, y));
        System.out.println("Difference: " + getDifference(x, y));
        System.out.println("Product: " + getProduct(x, y));
        System.out.println("Quotient: " + getQuotient(x, y));
        System.out.println("Remainder: " + getRemainder(x, y));
    }
}
// - Bausa

/**
 * 3. A Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 */
class Class3 extends Compute {
    @Override
    void printConsole() {
        System.out.print("Enter a number: ");
        x = sc.nextInt();
        System.out.println("Multiplication table: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(getProduct(x, i));
        }
    }
}
// - Bausa

/**
 * Main class to run all Classes
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n1. A Java program that takes two numbers as input and display the product of two numbers.");
        Class1 c1 = new Class1();
        c1.printConsole();

        System.out.println("\n2. A Java program to print the sum (addition), multiply, subtract divide and remainder of two numbers.");
        Class2 c2 = new Class2();
        c2.printConsole();

        System.out.println("\n3. A Java program that takes a number as input and prints its multiplication table up to 10.");
        Class3 c3 = new Class3();
        c3.printConsole();
    }
}
// - Bausa



