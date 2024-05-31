package OOP;

public class AccessModifier {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        obj.name = "sushant";
        obj.age = 19;
        // obj.salary= 13234.32;

        obj.defaultFunction();
        obj.publicFunction();
        obj.accessPrivate();
        obj.setSalary(2352);
        obj.getSalary();

        // dog object

        Dog dogObj = new Dog();
        dogObj.breed = "Huskey";
        dogObj.setName("manish");
        dogObj.setAge(19);

        System.out.println(dogObj.getAge());
        System.out.println(dogObj.getName());

    }
}

class AccessExample {

    String name; // auto default, package/folter can access
    public int age; // can be accessed from anywhere
    private double salary; // can only be accessed inside this class

    // set the salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        System.out.println(salary);
        return salary;
    }

    // same concept in function
    void defaultFunction() {
        System.out.println("I can be accessed inside a package");
    }

    public void publicFunction() {
        System.out.println("I can be accessed from anywhere");
    }

    private void privateFunction() {
        System.out.println("I can be accessed only inside of class");

    }

    void accessPrivate() {

        // System.out.println(getSalary());
        // System.out.println(salary);
        privateFunction();
    }
}

// Task
// Make a class Dog
// Make a private attribute name and age
// Make a public attribute breed
// Make setter for name and age
// Make getter for name and age
// Make an Object for dog
// Fill all attribute
// Print the following using object
// Name: XYZ
// Breed: ABC
// Age: 10

class Dog {
    private String name;
    private int age;
    public String breed;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}