public class Immutable {
    public static void main(String[] args) {
        College college = new College("IITR", "Roorkee");

        // MUTABLE
        Student2 s2 = new Student2(25, "Arsh", college);
        System.out.println(s2.getCollege().name);
        s2.getCollege().name = "IITB";
        System.out.println(s2.getCollege().name);

        System.out.println();

        // IMMUTABLE
        Student3 s3 = new Student3(23, "Shubham", college);
        System.out.println(s3.getCollege().name);
        s3.getCollege().name = "Shivalik";
        System.out.println(s3.getCollege().name);
    }
}

class College {
    String name;
    String address;

    College(String name, String address) {
        this.address = address;
        this.name = name;
    }

    College(College college) {
        this.address = college.address;
        this.name = college.name;
    }
}

// Mutable
// Shallow Copy
// As we returned the college object directly
final class Student2 {
    final private int age;
    final private String name;
    final private College college;

    Student2(int age, String name, College college) {
        this.age = age;
        this.name = name;
        this.college = college;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public College getCollege() {
        return college;
    }
}


// Immutable complete
// Deep Copy
// Defensive Copy
final class Student3 {
    final private int age;
    final private String name;
    final private College college;

    Student3(int age, String name, College college) {
        this.age = age;
        this.name = name;
        this.college = college;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public College getCollege() {
        return new College(college);
    }
}