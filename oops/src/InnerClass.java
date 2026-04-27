// Inner Class

public class InnerClass {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        Outer1.Inner inner = outer.new Inner();
        Outer1.Inner inner2 = new Outer1().new Inner();

    }
}


class Outer1 {
    int x = 10;

    class Inner {
        int x = 20;
        static int y = 100;
        Inner () {
            System.out.println(x);
            System.out.println(Outer1.this.x);
            System.out.println(y);
        }
    }
}