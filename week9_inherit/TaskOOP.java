package week9_inherit;

public class TaskOOP {
    public static void main(String[] args) {
        Labrodor lab = new Labrodor();
        lab.Name = " Labrodor";
        lab.breed = "labrodor";
        lab.country = " Nepal";
        lab.color = " Golden";
        lab.fur();
        lab.bark();
        lab.Play();
        lab.speaks();

    }

}

class Animal {
    String Name;

    void speaks() {
        System.out.println(Name + " speaks");
    }

}

class Reptile extends Animal {
    String eggs;

    void sheds() {
        System.out.println(eggs + "coldBlood");
    }
}

class Amphibian extends Animal {
    String scale;

    void swims() {
        System.out.println(scale + " swims");
    }
}

class Mammal extends Animal {
    String breed;

    void fur() {
        System.out.println(breed + " fur");
    }
}

class Dog extends Mammal {
    String country;

    void bark() {
        System.out.println(country + " bark");
    }
}

class Cat extends Mammal {
    String origin;

    void meow() {
        System.out.println(origin + "cat family");
    }
}

class Labrodor extends Dog {
    String color;

    void Play() {
        System.out.println(color + " lab");
    }
}

class GermanShepherd extends Dog {
    String spot;

    void Guard() {
        System.out.println(spot + "german");
    }
}
