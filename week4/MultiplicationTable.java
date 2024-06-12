package week4;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Print multiplication table from 10 to - using for loop
        for (int i = 10; i > 0; i--) {
            System.out.println("Multiplication of: " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);

            }
        }

    }

}