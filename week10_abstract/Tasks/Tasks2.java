package week10_abstract.Tasks;

public class Tasks2 {
    public static void main(String[] args) {
        softwareDeveloper dev1 = new softwareDeveloper();
        dev1.work();
        dev1.getSalary();
    }
}

// You are developing a restaurant management system that handles different
// types of employees, such as chefs and waiters. Design an interface named
// "Employee" with the following methods:
// work(): This method should define the work responsibilities of the employee.
// getSalary(): This method should return the salary of the employee.

interface Employee {
    void work();

    void getSalary();
}

class softwareDeveloper implements Employee {

    public void work() {
        System.out.println("The work is remote but you know code code and more code.......");
    };

    public void getSalary() {
        System.out.println("$100k ++ ;-}");

    };
}