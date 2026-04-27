// Inner Class

public class InnerClass {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        Outer1.Inner inner = outer.new Inner();
        inner.fun();

        Outer1.Inner inner2 = new Outer1().new Inner();
        inner2.fun();
    }
}


class Outer1 {
    Outer1 () {
        System.out.println("Outer constructor");
    }
    class Inner {
        Inner () {
            System.out.println("Inner Constructor");
        }
        void fun () {
            System.out.println("fun");
        }
    }
}