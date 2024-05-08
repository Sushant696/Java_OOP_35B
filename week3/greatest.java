package week3;

public class greatest {
    public static void main(String[] args) {
        // Write a JAVA program to find the maximum between three numbers.
        int num1 = 110;
        int num2 = 120;
        int num3 = 188;

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("num 1 greatest number: " + num1);
            } else {
                System.out.println("Num 3 is greatest: " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("num2 is greatest: " + num2);
            } else {
                System.out.println("num3 is greatest: " + num3);
            }
        }

    }
}
