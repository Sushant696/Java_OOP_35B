package questions;

import java.util.Scanner;

// palindrome numbers
public class palindrome {

    public static int palindromeCalc(int inputNumber) {
        int reverseNumber = 0;
        int remainder;
        while (inputNumber != 0) {
            remainder = inputNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            inputNumber /= 10;
        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println("Program to check if the number is palindrome or not:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int returnedNum = palindromeCalc(num);
        if (num == returnedNum) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
        scanner.close();
    }
}

// Ask user again to continue