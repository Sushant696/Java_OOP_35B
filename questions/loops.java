package questions;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        // Write a program to sum first n even numbers using a while loop.

        // int number = 8;
        // int i = 0;
        // while (i < number) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }
        // i++;
        // }

        // Question 9: Write a program to calculate the sum of the numbers occurring in
        // the multiplication table of 8.
        // int number = 80;
        // for (int i = 0; i < number + 1; i++) {
        // if (i % 8 == 0) {
        // System.out.println(i);
        // }
        // }

        // Write a Java program that reads a floating-point number and prints "zero" if
        // the number is zero. Otherwise, print "positive" or "negative". Add "small" if
        // the absolute value of the number is less than 1, or "large" if it exceeds
        // 1,000,000.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a floating point number:");
        float myNumber = scanner.nextFloat();
        // int num = (int) myNumber;

        if (myNumber == 0) {
            System.out.println("zero");
        } else if (myNumber < 0) {
            System.out.println("Negative");
        } else if (myNumber < 1) {
            System.out.println("Small");
        } else if (myNumber > 1) {
            System.out.println("positive");
        } else if (myNumber > 1000000) {
            System.out.println("Large");
        }

        // System.out.println("Hello world");
        // System.out.println(myNumber);
        scanner.close();

    }
}
