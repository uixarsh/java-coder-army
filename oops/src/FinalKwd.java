public class FinalKwd {
    public static void main(String[] args) {
        Random1 r1 = new Random1();
        System.out.println(r1.PI);

        final int x;
        x = 10;
        System.out.println(x);
    }
}

class Random1 {
    final double PI;

    Random1 () {
        this.PI = 3.14;
    }
}

class Random2 {
    static final double PI;

    static {
        PI = 3.14;
    }
}