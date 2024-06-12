package OOP;

public class firstOops {
    public static void main(String[] args) {
        Person person1 = new Person("sushant", 'm');
        // person1.name = "Ram";
        // person1.age = 19;
        // person1.gender = 'm';
        person1.intro();
        triangle t1 = new triangle(10, 20);
        System.out.println(t1.area());
        t1.addLength(12);
        System.out.println(t1.area());
        Rectangle rect1 = new Rectangle();
        rect1.breadth = 234;
        rect1.length = 234;
        System.out.println("Area" + rect1.areaOfRectangle());
        System.out.println("Perimeter " + rect1.areaOfRectangle());

        // objects of car
        Car c1 = new Car("g class", "bmw", 1921, "black");
        Car c2 = new Car("gt 911", "porche", 2022, "red");
        Car c3 = new Car("phantom", "Rolls Royace", 1922, "White");
        
        c1.Start();
        c2.Start();
        c3.Start();

        // stop car one only
        c1.stop();

        c2.modifyColor("green");

        c3.addExpiryYear();
        c1.details();
        c2.details();
        c3.details();

    }
}

class Person {
    String name;
    String lastName;
    int age;
    char gender;

    public Person(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    void intro() {
        System.out.println("Hi my name is" + name + "i am" + age + "years old" + gender);

    }
}

class triangle {

    int h;
    int b;

    void addLength(int height) {
        h += height;
    }

    triangle(int h, int b) {
        this.h = h;
        this.b = b;
    }

    int area() {
        return (b * h) / 2;
    }
}

class Rectangle {

    double length;
    double breadth;

    double areaOfRectangle() {
        return length * breadth;
    }

    double perimeterOfRectangle() {
        return 2 * (length + breadth);
    }

}

class Car {
    String name;
    String brand;
    int year;
    String color;

    void modifyColor(String newColor) {
        color = newColor;

    }

    Car(String name, String brand, int year, String color) {
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.color = color;

    }

    int addExpiryYear() {
        year = year + 100;
        System.out.println("expiry year: " + year);
        return year;

    }

    void Start() {
        System.out.println("name is starting");

    }

    void stop() {
        System.out.println(name + " " + brand + " is stopping");
    }

    void details() {
        System.out.println("name :" + name + " " + "brand :" + brand + " " + " color :" + color + " year :" + year);
    }
}