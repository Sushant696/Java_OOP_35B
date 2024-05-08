package Practice;

import java.util.Scanner;

/**
 * whileLoop
 */
public class whileLoop {

    public static void main(String[] args) {
        System.out.println("Display a pattern");
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println('\n');
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}