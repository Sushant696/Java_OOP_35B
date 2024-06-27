package Tasks;

public class Task1 {
    public static void main(String[] args) {
        int number = 123;
        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println("Divisible by 5 and 11");
        } else {
            System.out.println("Not Divisible by 5 and 11");
        }
    }

}
