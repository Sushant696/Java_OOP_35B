package week9_inherit;

public class InheritancePants {
    public static void main(String[] args) {
        System.out.println("main class main function");
    }
}

class pant {
    String color;
    String texture;

    pant(String color, String texture) {
        this.color = color;
        this.texture = texture;
    }
}

class HalfPant extends pant {

    String color = "white";

    HalfPant() {
        super("", "");
        System.out.println("halfpan constructor");
    }

    void design(String color) {
        super.color = this.color;
        this.color = color;
        System.out.println("You selected" + color);
    }

}