package oops.staticKeywordConstructors;

public class static_keywords {
    public static void main(String[] args) {
        Student pranav = new Student("Pranav", 123);
        Student piyush = new Student("Piyush", 2);

        System.out.println(pranav.name + " " + pranav.name);
        pranav.message();
        System.out.println(piyush.name + " " + piyush.name);
        piyush.message();
        System.out.println("Total student: " + Student.totalStudent);
        System.out.println("Total student: " + Student.totalStudent);

        System.out.println("This is static method: " + isAlive());


        //this is how we can access non static function, with objects only.
        static_keywords s = new static_keywords();
        System.out.println("This is non-static method: "+ s.isDead());;
    }

    // if you remove static, you wont able to access this method inside main
    // function, we can call static function only, inside the static methods.
    private static boolean isAlive() {
        return true;
    }
    private boolean isDead(){
        return false;
    }
}
