package questions;

import java.util.*;

public class addBinary {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        int num2 = myObj.nextInt();
        int num1 = myObj.nextInt();
        String binaryNum1 = Integer.toBinaryString(num1);
        String binaryNum2 = Integer.toBinaryString(num2);
        String binarySum = binaryNum1 + binaryNum2;

        System.out.println(binaryNum2 + "\n" + binaryNum1 + "\nSum = :" + binarySum); // not binary way but directly

        myObj.close();

    }

}