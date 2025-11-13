package oops.Inheritence;

class A {
    A() {
        System.out.println("A's no-arg constructor");
    }

    A(String msg) {
        System.out.println("A's parameterized constructor: " + msg);
    }
}

class B extends A {
    B() {
        this("Hello from B"); // calls B(String)
        System.out.println("B's no-arg constructor");
    }

    B(String msg) {
        super(msg); // calls A(String)
        System.out.println("B's parameterized constructor");
    }
}

class C extends B {
    C() {
        super(); // calls B()
        System.out.println("C's constructor");
    }
}

public class thisAndSuperKeyWord {

    public class Main {
        public static void main(String[] args) {
            C c = new C();
        }
    }

}
