package week8_encaps.Tasks;

public class Task3 {
    public static void main(String[] args) {
        student s1 = new student(3.45);
        s1.setId(12123);
        s1.setStdName("Chattan sharma");
        int id = s1.getId();
        String name = s1.getStdName();
        System.out.println(" student id: " + id + " Name: " + name + " Mark " + s1.getGpa());

    }
}

class student {
    private String stdName;
    private int id;
    private final double gpa;

    student(double gpa) {
        this.gpa = gpa;

    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // read only method
    public double getGpa() {
        return gpa;
    }

    // getter and setter for name and id
    // gpa ready only can be set within the class constructor...
}

// You are working on a student information system and need to create a Student
// class. The student class should have private instance variables for the
// student's name, ID number, and grade point average (GPA). Implement getter
// and setter methods for the name and ID number, ensuring that they can be
// accessed and modified only through these methods. However, the GPA should be
// read-only and can only be set within the class constructor.