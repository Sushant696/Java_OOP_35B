package Tasks;

public class hcf {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 80;
        int hcf = 0;

        for (int i = 1; i < num1 && i < num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }

        }
        System.out.println("The hcf is: " + hcf);
    }

}
