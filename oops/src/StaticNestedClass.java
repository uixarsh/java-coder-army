public class StaticNestedClass {
    public static void main(String[] args) {
        Outer outer = new Outer ();

        Outer.Inner inner = new Outer.Inner(outer);
        inner.fun();
        Outer.Inner.one2ka4();
    }
}

class Outer {

    static int x;
    private int y;

    static void greet () {
        System.out.println("Greetings");
    }

    int getY () {
        return this.y;
    }

    // STATIC NESTED CLASS
    static class Inner {

        Outer outer;
        static int number;

        Inner (Outer outer){
            this.outer = outer;
        }

        void fun () {
            greet();
            System.out.println("Hello");
            System.out.println(outer.y);
        }

        static void one2ka4 () {
            System.out.println("1 2 ka 4");
        }
    }
}


class BankAcc {
    private static class InterestCalculator {
        static double calculateYearly (double principal, double rate, int tenure){
            return principal*rate*tenure;
        }
    }

    public void computeInterest (double principal) {
        double interest = InterestCalculator.calculateYearly(principal, 2.5, 1);
        System.out.println(interest);
    }
}