package week9_inherit;

public class Inheritance {
    String name;

    public static void main(String[] args) {
        childClass myChild = new childClass();
        myChild.firstName = "manish";
        myChild.lastname = "bhatt";
        // myChild.salary = "5";
        myChild.info();
        myChild.details();
        System.out.println("manish bhatt");

        grandChild gc = new grandChild();
        gc.middlename = "babu";

    }
}

class parentClass {
    public String lastname;
    private int salary;
    protected double expense;

    void info() {
        System.out.println("Parent Function: " + lastname);
    }
}

class childClass extends parentClass {
    // super();
    String firstName;

    void details() {
        System.out.println(firstName + "firstname");
    }

    public static void main(String[] args) {
        System.out.println("Hello world this is not working...");
    }
}

class grandChild extends childClass {
    String middlename;

    void grandInfo() {
        System.out.println(middlename);
    }

}