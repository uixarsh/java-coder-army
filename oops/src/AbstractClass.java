public class AbstractClass {
    public static void main(String[] args) {
//        Car ec = new ElectricCar();
//        Car fc = new FuelCar();
//
//        ec.start();
//        ec.accelerate();
//        ec.brake();
//
//        fc.start();
//        fc.accelerate();
//        fc.brake();

        Animal1 a = new Dog1();
        a.makeSound();
    }
}

abstract class Car {
    void start(){
        System.out.println("Car Started");
    }

    abstract void accelerate ();
    abstract void brake ();
}

class FuelCar extends Car {
    FuelCar () {}

    @Override
    void accelerate () {
        System.out.println("Fuel car is accelerating");
    }

    @Override
    void brake () {
        System.out.println("Fuel car is stopping");
    }
}

class ElectricCar extends Car {
    ElectricCar () {}

    @Override
    void accelerate () {
        System.out.println("Electric car is accelerating");
    }

    @Override
    void brake () {
        System.out.println("Electric Car is stopping !");
    }

}

abstract class Animal1 {
    String name;
    Animal1 (String name) {
        this.name = name;
    }
    abstract void makeSound ();
    void sleep () {
        System.out.println("Sleeping");
    }

    private void eat () {
        System.out.println("Eating");
    }
}

class Dog1 extends Animal1{
    Dog1 () {
        super("Tom");
    }
    @Override
    void makeSound() {
        System.out.println("Barking Sound");
    }
}