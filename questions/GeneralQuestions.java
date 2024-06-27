package questions;

import java.util.Scanner;

public class GeneralQuestions {

    // factorial of number given by user
    public static int factorialCalc(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    // Fibonacci
    public static int Fibonacci(int range) {

        int num1 = 0;
        int num2 = 1;
        System.out.println(num1 + "\n" + num2);
        int num3;
        for (int i = 2; i <= range; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);

        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Find factorial of a number:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println(userInput);
        System.out.println(factorialCalc(userInput));
        scanner.close();
        System.out.println("Fibonacii series" + Fibonacci(userInput));
    }
}

// returns a string or array with each number as different entries or item in
// the array