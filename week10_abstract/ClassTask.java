package week10_abstract;

public class ClassTask {
    public static void main(String[] args) {
        System.out.println("hello");
        Triangle t1 = new Triangle();
        System.out.println(t1.calculateArea() + " triangle " + t1.calculatePerimeter());

        Rectangle r1 = new Rectangle();
        System.out.println(r1.calculateArea() + " rectangle " + r1.calculatePerimeter());

        Circle c1 = new Circle();
        System.out.println(c1.calculateArea() + " circle " + c1.calculatePerimeter());
    }
}

abstract class Shape {
    abstract double calculateArea();

    abstract double calculatePerimeter();

}

class Triangle extends Shape {
    int l = 90;
    int b = 80;
    int h = 98;

    @Override
    double calculateArea() {
        return .5 * (b * h);
    }

    @Override
    double calculatePerimeter() {
        return l + b + h;
    }

}

class Rectangle extends Shape {
    int l = 30;
    int b = 38;
    int h = 28;

    @Override
    double calculateArea() {
        return l * b;
    }

    @Override
    double calculatePerimeter() {
        return l + b + h;
    }

}

class Circle extends Shape {
    int r = 30;

    @Override
    double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

}

/*
 * You are building a shape hierarchy for a drawing application.
 * Design an abstract class named "Shape" with the following abstract methods:
 * 
 * calculateArea():
 * This method should calculate and return the area of the shape.
 * 
 * calculatePerimeter():
 * This method should calculate and return the perimeter of the shape.
 * 
 * Implement the abstract class and provide concrete implementations for
 * the abstract methods. Create subclasses for different shapes such as
 * "Circle,"
 * "Rectangle," and "Triangle."
 * Each subclass should provide specific implementations for
 * calculating the area and perimeter of that shape.
 * Create instances of each shape class and demonstrate
 * how you can calculate their respective areas and perimeters.
 */