package week8_encaps.Tasks;

public class Task1 {
    public static void main(String[] args) {
        Book untetheredSoul = new Book("micheal Alan singer", "Unthered Soul", 2018);
        untetheredSoul.borrow();
        untetheredSoul.borrow();
        System.out.println("hello");
    }
}

class Book {
    String title;
    String AuthorName;
    int publicationYear;
    private static boolean bookAvaliability;

    Book(String authorname, String title, int year) {
        this.AuthorName = authorname;
        this.publicationYear = year;
        this.title = title;
        bookAvaliability = true;
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthorName() {
        return this.AuthorName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setAuthorName(String authorName) {
        this.AuthorName = authorName;
    }

    // Todo Public method for book borrow, updating it's status

    public void borrow() {
        if (bookAvaliability) {
            bookAvaliability = false;
            System.out.println("The book is avaliable to borrow");
        } else if (!bookAvaliability) {
            System.out.println("sorry, the book is already borrowed by someone else.");
        }
    }
}

// 2. You are developing a library management system and need to implement a
// Book class. The Book class should have private instance variables for the
// book title, author name, and publication year. Implement appropriate getter
// and setter methods to ensure encapsulation. Additionally, include a private
// variable to track the availability of the book (e.g., true if available,
// false if borrowed), and provide a public method to borrow the book, updating
// its availability status.