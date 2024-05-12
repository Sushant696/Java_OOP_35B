package week2;

// import java.util.Scanner;

public class Questions {

    public static int AreaOfTriangle(int base, int height) {

        return 1 / 2 * (base * height);
    }

    public static int volumeOfCuboid(int length, int breadth, int height) {

        return length * breadth * height;
    }

    public static double volumeOfCube(double side) {

        return Math.pow(side, 3);
    }

    public static void main(String[] args) {
        // question 1
        // 1. Write a program to check whether a person can cast a vote or not. The
        // condition is you must be over 18 years old to vote.

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter your age");
        // int age = scanner.nextInt();
        // if (age > 18) {
        // System.out.println("congrats, You can cast a vote");
        // } else {
        // System.out.println("Sorry, you cannot cast a vote");
        // }

        // Question 2
        // Write a program to calculate, area of the triangle, and the Volume of the
        // Cube and Cuboid. Formula: Volume of Cuboid = length*width*height; and Volume
        // of Cube: side*side*side;

        // Area of triangle
        System.out.println(AreaOfTriangle(12, 38));
        System.out.println(volumeOfCuboid(12, 38, 76));
        System.out.println(volumeOfCube(12));

    }
}
