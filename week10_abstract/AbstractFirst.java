package week10_abstract;

public class AbstractFirst {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
        normalClass nClass = new normalClass();
        // normalClass.privateMethod;
        nClass.normalMethod();
    }
}

abstract class firstAbstractClass {
    abstract void privateMethod();

    void normalMethod() {
        System.out.println("Hello World this is my abstract calss...");
    }
}

class normalClass extends firstAbstractClass {
    @Override
    void privateMethod() {
        System.out.println(
                "All the abstract methdo should be called of the abstract class that we extend and used here....");
    }
}
