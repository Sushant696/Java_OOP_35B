package week7;

public class ConstructorClass {
    public static void main(String[] args) {

        ConstructorExample ec = new ConstructorExample();
        System.out.println("After object creation");
        ParamConstructor cp = new ParamConstructor("sushant babu prasai", 19);

        // Cat object
        Cat newCat = new Cat("nishan", 19);
        newCat.breed = "Huskey";
        newCat.color = "red";

        newCat.printDetails();
    }
}

// non parameterized constructor
class ConstructorExample {
    ConstructorExample() {
        System.out.println("I ran on every object creation");
    }
}

// param constructor example

class ParamConstructor {
    public int data1;
    private String name;

    ParamConstructor(String name, int age) {
        this.data1 = age;
        this.name = name;
        System.out.println("my name is " + name + " and i am " + age + " Years old");
    }
}

// Task
// Make a class Cat
// Make 2 private attribute name, age
// Make 2 public attribute breed, color
// Make a constructor to only set name and age
// Make getter for name and age
// Make a setter for age
// Make an Object of cat
// Fill the attributes
// Add +1 to the current age
// Print the Following using object
// Name: Ny
// Age: 4
// Breed: Xy
// Color: Orange

class Cat {
    private String name;
    private int age;
    public String breed;
    public String color;

    Cat(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age + 1;
    }

    public void printDetails() {
        System.out.println(
                "Name :" + name + "\n Age:" + age + "\n Breed:" + breed + "\n Color: " + color

        );
    }

}