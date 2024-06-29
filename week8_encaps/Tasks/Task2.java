package week8_encaps.Tasks;

import java.util.ArrayList;
import java.util.List;

// You are developing a restaurant management system and want to create a Menu
// class.
// The Menu class should encapsulate a list of MenuItem objects.
// Implement the Menu class with private instance variables for the menu items
// and provide public methods to add and remove items from the menu.
// Ensure that the list of menu items cannot be directly accessed or modified
// from outside
// the class.

public class Task2 {
    public static void main(String[] args) {
        Menu menu = new Menu();

        MenuItem item1 = new MenuItem("Pizza", 8.99);
        MenuItem item2 = new MenuItem("Burger", 5.99);
        MenuItem item3 = new MenuItem("Pasta", 7.99);

        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        menu.addMenuItem(item3);

        System.out.println("Menu items:");
        for (int i = 0; i < menu.menuItems.size(); i++) {
            MenuItem item = menu.menuItems.get(i);
            System.out.println(item.name + ": $" + item.price);
        }

        menu.removeMenuItem("Burger");

        System.out.println("After removing Burger:");
        for (int i = 0; i < menu.menuItems.size(); i++) {
            MenuItem item = menu.menuItems.get(i);
            System.out.println(item.name + ": $" + item.price);
        }
    }
}

class MenuItem {
    String name;
    double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Menu {

    public List<MenuItem> menuItems = new ArrayList<>(); // List of menu items to be added of type MenuItem

    public void addMenuItem(MenuItem item) {
        menuItems.add(item); // Adding the item to the menuItems list
    }

    public void removeMenuItem(String itemName) {
        for (int i = 0; i < menuItems.size(); i++) { // Loop through the menu items
            if (menuItems.get(i).name.equals(itemName)) { // If the name of the menu item matches the name to be removed
                menuItems.remove(i);
                break;
            }
        }
    }
}
