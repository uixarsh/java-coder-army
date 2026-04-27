import java.io.*;
import java.util.Scanner;

public class IODeepDive {
    public static void main(String[] args) throws IOException {
//        System.out.println("Arsh");
//        System.err.println("Bye");

//        int x = System.in.read();
//        System.out.println((char)x);

//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        String name = br.readLine();
//        System.out.println(name);

        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        System.out.println(t);
        String name = sc.next();
        System.out.println(name);

        sc.nextInt();
        sc.nextLine();
        sc.nextDouble();
        sc.nextFloat();
        boolean x = sc.nextBoolean();
    }
}
