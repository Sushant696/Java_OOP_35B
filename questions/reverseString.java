package questions;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        // char[] arr = str.toCharArray();
        System.out.println("retured string " + reverse(str));
        scanner.close();
    }

    public static String reverse(String str) {

        String reversedStr = new String();

        for (int i = 0; i < str.length(); i++) {
            reversedStr = str.charAt(i) + reversedStr;
            System.out.println(str.charAt(i));// first zero index element is appeded and then so on.
        }
        System.out.println(reversedStr + "k");

        return reversedStr;

    }
}

// Char At returns element at specific index in the string.