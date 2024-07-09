package week9_inherit;

public class InheritanceInit {
    public static void main(String[] args) {
        chrome ch1 = new chrome();
        System.out.println(ch1 + "hello");
        System.out.println(ch1.rootName);

    }
}

class root {
    String rootName;

    root() {
        System.out.println("first should be this");
        rootName = "rootname";
        // System.out.println("root constructor");
    }

    void root1() {
        System.out.println("hello");
    }

}

class bin extends root {

    int binaries;

    bin() {
        super.rootName = "str";
        binaries = 0101010;
        System.out.println("Than this ...");
        // System.out.println(super.rootName);
        // System.out.println("bin constructor");
    }

}

class chrome extends bin {
    int home1;

    chrome() {
        // super();
        System.out.println(super.rootName);
        System.out.println("than third one..");
        // System.out.println(super.binaries);
        // System.out.println("home constructor");
        home1 = 0101010;
    }
}
