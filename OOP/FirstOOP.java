package OOP;

public class FirstOOP {
    public static String message;

    public FirstOOP(String message) {
        FirstOOP.message = message;
    }

    public static void main(String[] args) {
        FirstOOP greeting = new FirstOOP("hello");

    }
}

class secondOOP extends FirstOOP {
    private String greeting1;

    public secondOOP(String greeting1) {
        super("no null alright");
        this.greeting1 = greeting1;

    }

    public static String apiErrorHandling() {
        return "Server returned with 404 status code";

    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(apiErrorHandling());
        System.out.println("message from firstOOP class" + message);
    }
}