package oops.Inheritence;
class Vehicle {
    int speed = 50;
    Vehicle() {
        System.out.println("Vehicle constructor");
    }
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    int speed = 100;

    Car() {
        super(); // calls Vehicle() constructor
        System.out.println("Car constructor");
    }
    Car(Car c, int speed){
        this.speed = c.speed;
    }

    void display() {
        System.out.println("Car speed: " + speed);
        System.out.println("Vehicle speed: " + super.speed); // use speed of vehicle
        super.start(); // calls Vehicle's start()
    }
}

public class inheritence {
    public static void main(String[] args) {
        Car c = new Car();
        c.display(); 
    }
}
