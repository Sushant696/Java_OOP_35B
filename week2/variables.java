package week2;

public class variables {

    public int myInstanceVariable; // instance variable cannot be used without creating any instance of the class
    public static int staticVariable = 2423; // Global variable that which values changes when any of the object

    public variables(int myInstanceVariable) {
        this.myInstanceVariable = myInstanceVariable;

    }

    public static void main(String[] args) {
        variables Variable1 = new variables(007);
        variables.staticVariable = 2343;
        System.out.println(Variable1.myInstanceVariable + " - instance variable - " + variables.staticVariable
                + " - static variabl");

    }
}
