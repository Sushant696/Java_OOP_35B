package week11_poly;

public class Polymorphism {
    public static void main(String[] args) {
        mathOperation m = new mathOperation();
        System.out.println(m.add(2, 3));
        System.out.println(m.add(2, 3, 4));
        System.out.println(m.add(2.5, 3.5));
        m.add();
    }
}

// method overloading compile polymorphism
// making same functiom multiple times with diff in parameters

class mathOperation {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    void add() {
        System.out.println("invalid operation");
    }

}

// note method overloading expects the unique in data type of parameters
// cannot overload method just by chanding variable
// Eg: int add (int a, int b) cannot do this as add with 3 int already made
// cannot overload by just chanign return data type
// Eg: double add (int a, int b) cannot do this as add with 3 int already made
