package oops.staticKeywordConstructors;

class test {
    static int name;

    test(int name) {
        test.name = name;
    }
}

public class classes {
    public static void main(String[] args) {
        Student s1 = new Student(); // default constructor
        Student s2 = new Student("Pranav", 1); // parameterized constructor
        Student s3 = new Student(s2);

        System.out.println(s1.name + " " + s1.roll);
        System.out.println(s2.name + " " + s2.roll);
        System.out.println(s3.name + " " + s3.roll);

        s1.message();
        s2.message();
        s3.message();

        test t = new test(0);
        System.out.println(test.name);
        test te = new test(1);
        System.out.println(test.name);

    }
}

class Student {
    final static String schoolName = "Central Academy";

    String name;
    int roll;
    static int totalStudent;

    Student() {
        this("Harry", 1000);
    }

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        Student.totalStudent += 1;
    }

    Student(Student s) {
        this.name = s.name;
        this.roll = s.roll;
        Student.totalStudent += 1;
    }

    void message() {
        System.out.println("I am " + this.name + ", My roll num. is " + this.roll + " I Study in " + schoolName);
    }
}
