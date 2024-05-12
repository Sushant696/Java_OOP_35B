package week4;

import java.util.Scanner;

public class switchcaseQues {
    public static void main(String[] args) {

        // Write a Java program that takes a student's grade as input (A, B, C, D, or F)
        // and converts it to the corresponding GPA value. Use a switch case statement
        // to handle different grades.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade A,B,C,D or F to get your gpa range");
        char studentGrades = scanner.next().charAt(0); // next is for string but we want to take what the user gave us
                                                       // as the first character

        switch (studentGrades) {
            case 'A':
                System.out.println("your gpa ranges from 3.21 to 3.60 ");
                break;
            case 'B':
                System.out.println("Your gpa ranges from 2.81 to 3.20");
                break;
            case 'C':
                System.out.println("Your gpa ranges from 2.41 to 2.80");
                break;
            case 'D':
                System.out.println("Your gpa ranges from 2.01 to 2.40");
                break;
            case 'F':
                System.out.println("Bro focus on your studies, you got F that's not even graded.");
                break;
            default:
                System.out.println("Please enter a valid Grade");
        }
        scanner.close();
    }
}
