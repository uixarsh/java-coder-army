public class EnumsExp {
    public static void main(String[] args) {
//        int status = PaymentStatus.SUCCESS;
//        System.out.println(status);

//        PaymentStatus status = PaymentStatus.PENDING;
//        System.out.println(status.name());
//
//        Direction d1 = Direction.NORTH;
//        Direction d2 = Direction.EAST;
//        System.out.println(d2.getDegree());
//
//        Direction2 d3 = Direction2.SOUTH;
//        d3.move();

        // values () --> We can iterate in this enum
        Direction3 [] directions = Direction3.values();

        for (Direction3 d : directions) {
            System.out.println(d.name());
        }

        // valueOf () --> Convert a string into an Enum Constant
        Direction3 d4 = Direction3.valueOf("EAST");
        System.out.println(d4.name());

        //ordinal()
        System.out.println(d4.ordinal());
    }
}


//class PaymentStatus {
//    public static final int SUCCESS = 1;
//    public static final int FAILED = 2;
//    public static final int PENDING = 3;
//}
//
//class Role {
//    public static final int ADMIN = 1;
//    public static final int USER = 2;
//    public static final int MANAGER = 2;
//}

enum PaymentStatus {
    SUCCESS,
    FAILED,
    PENDING;
}


// Internal working of Java Enums
enum Direction {
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(270);

    private final int degree;

    Direction(int degree) {
        this.degree = degree;
    }

    public int getDegree() {
        return this.degree;
    }

}


enum Direction2 {
    NORTH (){
        @Override
        public void move () {
            System.out.println("(Y+1)");
        }
    },
    EAST (){
        @Override
        public void move () {
            System.out.println("(X+1)");
        }
    },
    SOUTH (){
        @Override
        public void move () {
            System.out.println("(Y-1)");
        }
    },
    WEST (){
        @Override
        public void move () {
            System.out.println("(X+1)");
        }
    };

    public abstract void move ();
}

enum Direction3 {
    NORTH,
    EAST,
    SOUTH,
    WEST;
}


//final class Direction1 extends Enum<Direction1>{
//    public static final Direction1 NORTH = new Direction1();
//    public static final Direction1 WEST = new Direction1();
//    public static final Direction1 SOUTH = new Direction1();
//    public static final Direction1 EAST = new Direction1();
//    private Direction1() {}
//}