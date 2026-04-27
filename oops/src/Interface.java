public class Interface {
    public static void main(String[] args) {
        Car1 car = new FuelCar1();
        car.accelerate();
        car.start();
        car.brake();
    }
}

interface Car1 {
    void accelerate ();
    void brake ();
    void start ();
}

class FuelCar1 implements Car1 {
    @Override
    public void accelerate () {

    }

    @Override
    public void brake() {

    }

    @Override
    public void start() {

    }
}