package questions;

import java.util.Scanner;

public class stringPalindrome {

    public static String reverse(String userInput) {
        return "Returned String";

    }

    public static void main(String[] args) {
        System.out.println("Program to check if the provided string is palindrome or not:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String reversedString = reverse(userInput);
        if (userInput == reversedString) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is no palindrome");
        }
        scanner.close();
    }
}
