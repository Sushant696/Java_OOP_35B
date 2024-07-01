package week6.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        // WAP to sort the integer elements of array of size 10 in ascending and
        // descending order using ArrayList.
        ArrayList<Integer> myListArray = new ArrayList<>(Arrays.asList(191, 21, 13, 4, 251, 6, 78, 3, 10));

        // using for each loop to iterate over the ArrayList
        for (Integer each : myListArray) {
            System.out.println(each);
        }
        // * sorting the array list in accending order
        Collections.sort(myListArray);
        System.out.println("Sorted in ascending order: " + myListArray);

        // * sorting the array list in descending order
        Collections.sort(myListArray, Collections.reverseOrder());
        System.out.println("Sorted in descending order: " + myListArray);
    }

}
