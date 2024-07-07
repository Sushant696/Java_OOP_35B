package week7.Tasks;

public class Task1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(1219);
        c1.getRadius();
        System.out.println(c1.areaOfCircle());
        System.out.println(c1.circumferenceOfCircle());

        // c1.areaOfCircle();
    }
}

class Circle {
    private int radius;

    void setRadius(int radius) {
        this.radius = radius;
    }

    int getRadius() {
        return this.radius;
    }

    double areaOfCircle() {
        return Math.PI * radius * radius;
    }

    double circumferenceOfCircle() {
        return 2 * 3.14 * radius;
    }

}
// 1. Write a Java program to create a class called "Circle" with a radius
// attribute. You can access this attribute using setter and getter method.
// Calculate the area and circumference of the circle.
