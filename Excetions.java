
public class Excetions {
    public static void main(String[] args) {
        System.out.println("Program start ");
        try {
            int num2 = 10 / 0;
        } catch (ArithmeticException ex) {
            System.out.println("cannot divide by zero");
        } finally {
            System.out.println("this is finallly block and this runs either way.");
        }
        // * */ Note : catch and finally are optional but either or both should be
        // present after try

        int[] numA = new int[5];

        try {
            numA[10] = 100; // ArrayIndexOutOfBoundsExceptions - exits here

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("array is not long enough -->       " + ex);
        }

        // * any object can be assigned value of null

        String data = null;
        try {

        } catch (NullPointerException ex) {
            System.out.println("Null value");
        }

        // multi layered exceptions
        try {
            int numMulti = 1000 / 0; // arithmetic exception
            String d2 = null;
            System.out.println(d2.length());

        } catch (ArithmeticException e) {
            System.out.println("number error");
        } catch (NullPointerException ex) {
            System.out.println("Null ayo");
        } finally {
            System.out.println("program end");
        }

    }
}