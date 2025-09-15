package oops;

public class classes {
    public static void main(String[] args) {
        student s = new student();
        // s.roll = 12;
        // s.name = " piyush";
        System.out.println(s.roll);
        System.out.println(s.name);
        
    }
}
class student{
    int roll = 123;
    String name = "wvrv";
    student(){
      
    }
    student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
}
