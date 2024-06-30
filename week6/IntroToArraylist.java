package week6;

import java.util.ArrayList;

public class IntroToArraylist {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // making new arraylist data type:

        ArrayList<String /* Datatype */> list1 = new ArrayList<>();

        System.out.println("Size of the list: " + list1.size());

        // adding elements to the list
        list1.add("First element added");

        // removing elements from the array list
        list1.remove(0);
        // removes the first element from the list i want to remove specific element

        // 1. Write code that creates an ArrayList that can hold string objects.
        // Add the names of three cars to the ArrayList, and then display the contents
        // of the ArrayList.

        ArrayList<String> newList = new ArrayList<>();
        newList.add("Rools Royace");
        newList.add("Prosche");
        newList.add("Ferrari");

        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }
}