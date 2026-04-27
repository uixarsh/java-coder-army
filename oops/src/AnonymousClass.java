public class AnonymousClass {
    public static void main(String[] args) {
        People p1 = new People();
        p1.introduce();

        People p2 = new People(){
            String name = "Arsh";

            // No constructors ...

            @Override
            public void introduce() {
                greet();
                System.out.println("Hi, I'm a Guest !");
            }

            void greet () {
                System.out.println("Hello World!");
            }
        };
        p2.introduce();
//        p2.greet();
    }
}


class People {
    void introduce() {
        System.out.println("Hi I'm a person !");
    }
}