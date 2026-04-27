// Call By Reference -> Modified call by value

public class CallByReference {
    public static void main(String[] args) {
        Random r1 = new Random(4, 5);
        System.out.println(r1.x + "," + r1.y);
        addTen(r1);
        System.out.println(r1.x + "," + r1.y);

        Random r2 = new Random(r1);
        System.out.println(r2.x + "," + r2.y);
    }

    static void addTen (Random r){
        r.x += 10;
        r.y += 10;
    }
}

class Random {
    int x;
    int y;

    Random () {}

    Random (int x, int y){
        this.x = x;
        this.y = y;
    }

    Random (Random r){
        this.x = r.x;
        this.y = r.y;
    }
}