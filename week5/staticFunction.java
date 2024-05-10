package week5;

public class staticFunction {

    public static String vendingmachine(int menu) {
        if (menu == 1) {
            return "coke";
        }
        if (menu == 2) {
            return "water";
        }
        if (menu == 3) {
            return "frooti";
        }
        return "invalid item";
    }

    public static String checkEligible(String name, int age) {
        if (age > 0 && age > 200) {
            System.out.println("Hello" + name + "Invalid age");
        }
        if (age < 18) {
            System.out.println(" Sorry" + name + "you are not eligible");
        } else {
            System.out.println("Congrattulation, you are eligible");
        }

        return "";
    }

    public static double makeSquare(double num) {
        return num * num;
    }

    public static void main(String[] args) {
        String iGet = vendingmachine(3);
        System.out.println(iGet);
        String EligiblityStatus = checkEligible("sushant", 19);
        System.out.println(EligiblityStatus);
        double square = makeSquare(5);
        System.out.println(square);
    }
}
