package oops.Inheritence;

class Vehicle {
    String name;

    Vehicle() {
        System.out.println("Vehicle no-arg constructor");
    }

    Vehicle(String name) { //4
        this.name = name;
        System.out.println("Vehicle parameterized constructor: " + name);
    }

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    int wheels;

    Car() { //2
        this(4); // calls Car(int)
        System.out.println("Car no-arg constructor");
    }

    Car(int wheels) { //3
        super("Car"); // calls Vehicle(String)
        this.wheels = wheels;
        System.out.println("Car parameterized constructor: " + wheels + " wheels");
    }

    @Override //this is annotation
    void start() {
        System.out.println("Car is starting...");
        super.start(); // calls Vehicle's start()
    }

    void showWheels() {
        System.out.println("Car has " + wheels + " wheels");
    }
}

class ElectricCar extends Car {
    int battery;

    ElectricCar() {  //1
        super(); // calls Car()
        battery = 100;
        System.out.println("ElectricCar constructor with battery: " + battery + "%");
    }

    @Override
    void start() { //5
        System.out.println("ElectricCar is starting silently...");
        super.start(); // calls Car's start()
    }
}

public class override {
    public static void main(String[] args) {
        System.out.println("--- Creating ElectricCar object ---");
        Vehicle v = new ElectricCar();  // upcasting
        v.start();                      // dynamic polymorphism

        // Downcasting to access child-specific methods
        if (v instanceof ElectricCar) {
            ElectricCar e = (ElectricCar) v;
            e.showWheels();
        }
    }
}

