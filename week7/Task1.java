package week7;

public class Task1 {
    public static void main(String[] args) {
        circle firstCircle = new circle();
        firstCircle.setRadius(7);
        firstCircle.getRadius();
        firstCircle.areaOfCircle();
        firstCircle.circumferenceOfCircle();

    }
}

class circle {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void areaOfCircle() {
        System.out.println(Math.PI * (radius * radius));
    }

    public void circumferenceOfCircle() {
        System.out.println(2 * Math.PI * radius);
    }
}

// 1. Write a Java program to create a class called "Circle" with a radius
// attribute. You can access this attribute using setter and getter method.
// Calculate the area and circumference of the circle.