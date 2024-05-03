package week2;

import java.util.*;

public class format {
    public static void main(String[] args) {


        // Format strings
        Scanner inputObj = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = inputObj.nextLine();
        System.out.println("Enter true if your are 18 and false if you are not");
        boolean ageStatus = inputObj.nextBoolean();
        System.out.println("Enter number of siblings");
        int noOfSibling = inputObj.nextInt();

        // String ageStatus = age == true ? "Above 18":"Below 18";

        System.out.printf("your name: %s \n  over 18 status: %b\n no of sibling: - %d\n", name, ageStatus,
                noOfSibling);
        inputObj.close();
    }
}
