package week10_abstract.Tasks;

public class Tasks1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Dog d1 = new Dog();
        d1.sound();
        Cat c1 = new Cat();
        c1.sound();

    }
}

abstract class Animal {

    abstract void sound();

}

class Dog extends Animal {
    // override
    void sound() {
        System.out.println("Bhau Bhau");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow Meow");
    }
}

// Create an abstract class called Animal with an abstract method called
// sound(). Implement two subclasses called Dog and Cat that inherit from
// Animal. Override the sound() method in both subclasses to display the
// specific sound made by each animal. Write the Java code to implement this
// scenario.