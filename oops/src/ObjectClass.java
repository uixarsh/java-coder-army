import java.util.Objects;

public class ObjectClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student5 s1 = new Student5("Arsh", 25);
        Student5 s2 = new Student5("Arsh", 25);
        Student5 s3 = null;
        Integer i = 324;


//        System.out.println(s1.getClass().getName());
//        System.out.println(s1 instanceof Student5);
//
//        System.out.println(s1);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equals(i));
//        System.out.println(s1.equals(s1));
//
//        System.out.println(s1.hashCode()==s2.hashCode());
//        System.out.println(s1.hashCode()==s3.hashCode());

        Student5 s4 = (Student5) s1.clone();
        System.out.println(s4);
    }
}

class Student5 implements Cloneable {
    final private String name;
    final private int age;

    Student5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj  == null) return false;     // Object is Null
        if (obj.getClass() != this.getClass()) return false;    // ClassCastException
        Student5 s = (Student5)obj;
        return this.name.equals(s.name) && this.age == s.age;
    }

    @Override
    public int hashCode() {
        // PRIME NUMBERS
//        int result = 17;
//        result = result * 31 + this.age;
//        result = result * 31 + ((this.name == null) ? 0 : this.name.hashCode());
//        return result;

        return Objects.hash(this.name, this.age);
    }

    protected Object clone () throws CloneNotSupportedException {
        return super.clone();
    }
}
