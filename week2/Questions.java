package week2;

public class Questions {

    // Method to return product of two number
    public static int product(int num1, int num2) {
        return num1 * num2;

    }

    // Method to return multiplication table from 1 to 10F
    public static int multiplicationTable(int num) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= num; j++) {
                // int result = i * j;
                // System.out.println(i + " * " + j + " = " + result);
            }

        }
        return 0;
    }

    public static int CalculateAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;

    }

    public static int Factorial(int num) {
        int i = 1;
        int fact = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(product(25, 5));
        System.out.println(multiplicationTable(10));
        System.out.println(CalculateAverage(10, 21, 31));
        System.out.println(Factorial(4));

    }
}

// Write a Java program that takes two numbers as input and displays the product
// of two numbers.

// Write a Java program that takes a number as input and prints its
// multiplication table up to 10.
// Write a java program to accept 3 integers and returns average of the numbers.

// Another class for other problems
