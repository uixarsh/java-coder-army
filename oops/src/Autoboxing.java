public class Autoboxing {
    public static void main(String[] args) {
        // Autoboxing
        int x = 10;
        Integer y = x;  // Integer y = Integer.valueOf(x);

        System.out.println(x);
        System.out.println(y);  // unboxing

        // Unboxing
        Integer a = new Integer(10);
        int b = a;  // int b = a.intValue();
        Integer c = 20;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Method Calls (Autoboxing / Unboxing)
        Integer z = 10;
        printInteger(z);

        // Arithmetic Operations (Autoboxing / Unboxing)
        Integer ab = 10;
        Integer bc = 20;
        int zc = ab + bc;
        System.out.println(zc);

        Integer q = 100;
        Integer w = 100;
        System.out.println(q.equals(w));
    }


    static void printInteger (int x) {
        System.out.println(x);
    }
}
