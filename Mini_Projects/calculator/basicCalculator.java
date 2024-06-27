package calculator;

import java.util.Scanner;

public class basicCalculator {

    public static void Addition() {
        System.out.println("Enter two numbers to perform addition");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("sum : " + sum);
        // scanner.close();
        calculateAgain();

    }

    public static void Substraction() {
        System.out.println("Enter two numbers to perform substraction");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int Substraction = num1 - num2;
        System.out.println("Substraction : " + Substraction);
        // scanner.close();
        calculateAgain();

    }

    public static void Multiplication() {
        System.out.println("Enter two numbers to perform multiplication");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int product = num1 * num2;
        System.out.println("product : " + product);
        // scanner.close();
        calculateAgain();

    }

    public static void Division() {
        System.out.println("Enter two numbers to perform division");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.print("/");
        int num2 = scanner.nextInt();
        int division = num1 / num2;
        System.out.println("Division: " + division);
        // scanner.close();
        calculateAgain();
    }

    public static void calculateAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to use calculator again ? (Yes/NO)");
        String userInput = scanner.nextLine();
        if (userInput.equals("yes")) {
            System.out.println("\n\n\n");
            Choose();

        } else {
            System.out.println("Bye, Hope to see you soon.");
        }
        scanner.close();
    }

    public static void Choose() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please select a operations that you want to perform:
                Addition >> +
                Substraction >> -
                Division >> /
                Multiplication >> *
                """);
        String operator = scanner.nextLine();
        switch (operator) {
            case "+":
                System.out.println("Addition");
                Addition();
                break;
            case "-":
                System.out.println("Substraction");
                Substraction();
                break;
            case "*":
                System.out.println("Multiplication");
                Multiplication();
                break;
            case "/":
                System.out.println("Division");
                Division();
                break;
            default:
                System.out.println("No Operators Matched");
                break;
        }
        scanner.close();

    }

    public static void main(String[] args) {
        Choose();

    }
}

// separate function to take input from the user