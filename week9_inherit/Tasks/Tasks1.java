package week9_inherit.Tasks;

public class Tasks1 {
    public static void main(String[] args) {
        Motorcycle m1 = new Motorcycle();
        System.out.println(m1 + "hellow");
    }

}
// Design a class hierarchy for different types of vehicles. Create a base class
// 'Vehicle' with methods 'startEngine()' and 'stopEngine()'. Derive two classes
// 'Car' and 'Motorcycle' from 'Vehicle'. Add methods 'drive()' in 'Car' and
// 'ride()' in 'Motorcycle'. Write a Java program to demonstrate hierarchical
// inheritance and invoke the relevant methods for a car and a motorcycle
// object.

class Vehicle {
    String caller;

    void stopEngine(String caller) {
        System.out.println(caller);
    }

    void startEngine() {
        System.out.println("Start Engine");
    }

}

class car extends Vehicle {
    car() {
        super.caller = "The caller is car";
        System.out.println("caller is here as well");
        super.stopEngine(super.caller);
        super.startEngine();

    }
}

class Motorcycle extends car {
    Motorcycle() {
        super.caller = "The caller is Motorcycle";
        super.stopEngine(super.caller);
        super.startEngine();
    }
}
