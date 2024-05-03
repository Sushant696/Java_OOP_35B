package week2;

public class args {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Not enought arguments");
            return;
        }
        System.out.println("the first args is" + args[0]);
        System.out.println("the second args is" + args[1]);

        for (int i = 0; i < args.length; i++) {
            System.out.println("print" + args[i]);
        }
        System.out.println(args + "The args are received as arrays.");
    }
}
