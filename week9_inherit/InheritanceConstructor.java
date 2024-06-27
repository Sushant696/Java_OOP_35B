package week9_inherit;

public class InheritanceConstructor {

    public static void main(String[] args) {
        Polo p1 = new Polo();
        p1.differentColor("red");

    }
}

class Shirt {
    String color;

    Shirt() {
        this.color = "green";
        System.out.println("making shirt");
    }

    Shirt(String color) {
        this.color = color;
    }
}

class Polo extends Shirt {
    String color = "blue";
    String texture;

    Polo() {

        // By default the constfuctor of parent is called meansing super () or shirt ()
        // on the first line of execution.

        super("white");
        System.out.println("making polo shirt");
    }

    void differentColor(String color) {
        System.out.println("param color: " + color);
        System.out.println("Class color: " + this.color);
        System.out.println("parent color: " + super.color);

    }
}