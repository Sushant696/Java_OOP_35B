package week4;

import java.util.Scanner;

public class sumUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a positive integer:");
        int range = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (range >= 1) {
            sum = sum + i;
            i++;
            range--;
        }
        System.out.println(sum);

    }
}
