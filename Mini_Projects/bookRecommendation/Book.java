package bookRecommendation;

import java.util.Scanner;

public class Book {
    // Private variables or attributes
    private String bookTitle;
    private String authorName;
    private double bookPrice;
    private boolean availability;
    private String genre;

    // What is the difference and why i needed to make these static ??

    // Constructor method
    public Book(String bookTitle, String authorName, double bookPrice, boolean availability, String genre) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.bookPrice = bookPrice;
        this.availability = availability;
        this.genre = genre;
    }

    public int getUserBudget(int budget) {

        return budget;
    }

    @Override
    public String toString() {
        return "Book Title: " + bookTitle + ", Author: " + authorName + ", Price: " + bookPrice + ", Availability: "
                + availability;
    }

    public static void main(String[] args) {

        Scanner scannerObj = new Scanner(System.in);
        Book[] books = new Book[9];
        boolean found = false;

        // books[0] = new Book("The secret", "Rhonda Byrne", 20.99, true);
        books[0] = new Book("Atomic Habits", "James Clear", 18.99, true, "Self-Help");
        books[1] = new Book("The Power of Now", "Eckhart Tolle", 15.50, true, "Self-Help");
        books[2] = new Book("Pride and Prejudice", "Jane Austen", 8.50, false, "Romance");
        books[3] = new Book("Dune", "Frank Herbert", 17.99, true, "Science Fiction");
        books[4] = new Book("The Lord of the Rings", "J.R.R. Tolkien", 13.25, true, "Fantasy");
        books[5] = new Book("The Unthered soul", "micheal Alan Singer", 12.2, true, "Self-Help");
        books[6] = new Book("Meditations", "Marcus Aurelius", 10.20, true, "Self-Help");
        books[7] = new Book("Dune", "Frank Herbert", 17.99, true, "Fantasy");
        books[8] = new Book("Think and Grow Rich", "Napoleon Hill", 14.75, false, "Self-Help");

        System.out.println("Please enter your budget for the book: book price ranges from $8 to $25");
        double userBudget = scannerObj.nextDouble();
        scannerObj.nextLine();

        if (userBudget <= 7) {
            System.out.println("sorry to inform you that book price exceded your budget..");
        } else {
            System.out.println("Your have these option to select from");

            System.out.println("Select from  genre");
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i].genre);

                // code to print only the unique values from the book array

            }

            // Get the genre from the user
            System.out.println("Enter genre you are interested in:");
            String userSelectedGenre = scannerObj.nextLine();

            for (int i = 0; i < books.length; i++) {
                if (userSelectedGenre.toLowerCase().equals(books[i].genre.toLowerCase())) {

                    System.out.println("Book Title: " + books[i].bookTitle + "...... Price: " + books[i].bookPrice);
                }
            }
            // Get the
            System.out.println("Enter the title of the book you want:");
            String UserBookName = scannerObj.nextLine();

            for (int i = 0; i < books.length; i++) {
                // System.out.println("Book Title: " + books[i].bookTitle + "...... Price: " +
                // books[i].bookPrice);
                if (UserBookName.toLowerCase().equals(books[i].bookTitle.toLowerCase())) {
                    if (books[i].availability) {
                        found = true;
                        System.out.println("Great Choice sir/maam, Book will be shipped within 2 days.");
                        break;
                    } else {
                        System.out.println(
                                "Sorry the book you are searching for is not avaliable right now, we will inform right after it's re-stocked!");
                        break;
                    }
                }

            }
            if (!found) {

                System.out.println("The book you are looking for is not found!");
            }
            //
        }
        scannerObj.close();
    }
}
