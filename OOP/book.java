package OOP;

public class book {
    private String title;
    private String author;
    public static int numberOfBooksObject = 0;

    // the properties or the ones that object instance will have..
    public book(String title, String author) {
        this.title = title; // telling the instance declared is equall to what you just passed
        this.author = author;
        numberOfBooksObject++;
    }

    public static void displayNumberOfObjectCreated() {
        System.out.println(book.numberOfBooksObject);
    }

    // use getter and setter method here

    public static void main(String[] args) {
        book untheredSould = new book("The unthered soul", "Micheal Alan Singer");
        book mind = new book("Think and Grow Rich", "Nepolean Hill");
        book money = new book("Think and Grow Rich", "Nepolean Hill");
        book.displayNumberOfObjectCreated();

    }
}

// Problem 1: Counting Objects
// Create a class Book that keeps track of the number of book objects created.
// Each book should have a title and an author.

// Requirements:

// Use a static variable to keep track of the total number of Book objects.
// Use instance variables for the title and author of each book.
// Write a method to display the total number of books created.