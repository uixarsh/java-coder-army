public class Constructor_1 {
    public static void main(String[] args) {

        Student s1 = new Student("Arsh", 25, 4, "IIT Roorkee");
        s1.markAttendance();
        s1.markAttendance();
        s1.markAttendance();

        Student s2 = new Student();
        s2.markAttendance();
    }
}

class Student {
    String name;
    int age;
    int rollNo;
    String college;
    int attendance;

    // Constructor Chaining
    Student () {
        this("Unknown", 0, 0, "Unknown");
    }

    // Parameterized Constructor
    Student (String name, int age, int rollNo, String college) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;
        this.attendance = 0;
    }

    void markAttendance () {
        System.out.println("The attendance has been marked by the Student: " + this.name);
        this.attendance++;
    }

    int getAttendance () {
        return this.attendance;
    }
}
