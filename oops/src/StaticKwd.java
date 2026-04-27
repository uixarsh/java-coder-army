public class StaticKwd {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Arsh", 25, 101);
        Student1 s2 = new Student1("Rohit", 28, 102);
        System.out.println(s1.name + " " + Student1.college);
        System.out.println(s2.name + " " + Student1.college);
    }
}

class Student1 {
    String name;
    int age;
    int rollNo;
    static String college;

    Student1 (String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // Static Block -> Used to initialize the static variables...
    static {
        college = "IIT Guwahati";
    }
}