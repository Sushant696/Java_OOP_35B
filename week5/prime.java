package week5;

import java.util.Scanner;

public class prime {

    public static void primeNumbers(int range) {
        int flag = 0;
        for (int i = 2; i < range; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    // System.out.println(i);
                    break;
                    // System.out.println(j + "j");
                } else {
                    System.out.println(i);
                }
            }
        }
        // System.out.println("");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a range for finding prime number: ");
        int primeNumberRange = scanner.nextInt();
        primeNumbers(primeNumberRange);

    }
}

// write a java program to display all prime numbers less than a given number
// and count all the prime numbers less than that number using methods