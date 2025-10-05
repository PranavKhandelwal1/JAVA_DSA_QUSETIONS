package oops;

import java.util.Arrays;

public class classes {
    public static void main(String[] args) {
        // student s = new student();
        // // s.roll = 12;
        // // s.name = " piyush";
        // System.out.println(s.roll);
        // System.out.println(s.name);
        Student s1 = new Student(); // default constructor
        Student s2 = new Student(101, "Pranav"); // parameterized constructor

        System.out.println(s1.roll + " " + s1.name);
        System.out.println(s2.roll + " " + s2.name);

        s1.message();
        s2.message();
        
    }
}
class Student{
    int roll = 123;
    String name = "wvrv";
    Student(){
      
    }
    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    void message(){
        System.out.println("I study");
    }
}
