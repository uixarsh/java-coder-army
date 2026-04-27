public class LocalClass {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.greet();
    }
}

class Outer3 {

    void greet () {
        // Effective final variable
        final int y = 5;

        class Local {
            void sayHello () {
                System.out.println(y);
                System.out.println("Hello");
            }
        }

        Local local = new Local();
        local.sayHello();
    }
}


// Effective Final Variable Example
class Outer4 {
    Object greet () {
        int y = 10;
        class Local2 {
            void fun () {
                System.out.println(y);
            }
        }

        Local2 local2 = new Local2();
        local2.fun();
        return local2;
    }

    void fun3 () {
        Object o = greet();
        System.out.println(o);
    }
}