package week4;

import java.util.Scanner;

public class whileClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a negative number");
        int num = scanner.nextInt();
        while (true) {
            if (num < 0) {
                System.out.println("Thankyou for providing ");
                break;
            } else {
                System.out.println("please enter a negative number");
                num = scanner.nextInt();
            }

        }
        scanner.close();

    }
}
