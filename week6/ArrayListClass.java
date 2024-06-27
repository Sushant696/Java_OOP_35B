package week6;

import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> myListArray = new ArrayList<>();
        myListArray.add("First element");
        myListArray.add("second element");
        myListArray.add("third element");
        myListArray.set(0, "sushant"); // update the element
        myListArray.add(1, "third element"); // add the element in this index and push the element further

        // for (var each : myListArray) { // looping through a collection
        // System.out.println(each);
        // }

        // make array list of the following
        // add grapes in 1 index
        // remove orange from the arraylist
        // remove water melon
        // add pear in oth index
        // change pineapple to avacado
        // change a pple to cherry
        // note print on every add and remove to get the new index of arrayList

        ArrayList<String> fruits = new ArrayList<>(
                Arrays.asList("Apple", "Orange", "banana", "watermelon", "pineapple"));

        // add grapes in index 1
        fruits.add(1, "grapes");
        System.out.println(fruits);
        // remove orange from the arraylist
        fruits.remove(2);
        System.out.println(fruits);

        // remove water melon
        fruits.remove(3);
        System.out.println(fruits);

        // add pear in oth index
        fruits.add(0, "Pear");
        System.out.println(fruits);

        // change pineapple to avacado
        fruits.set(4, "Avacado");
        System.out.println(fruits);

        // change apple to cherry
        fruits.set(1, "cherry");
        System.out.println(fruits);

        // for (var each : myListArray) { // looping through a collection
        // System.out.println(each);
        // }

    }

}
