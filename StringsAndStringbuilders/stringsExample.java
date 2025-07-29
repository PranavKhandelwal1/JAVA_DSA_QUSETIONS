package StringsAndStringbuilders;

public class stringsExample {
    public static void main(String[] args) {
        String king = "1.1.11.1";
        System.out.println(king.replace(".", "[.]"));

        
        // String name = "Pranav";
        // String name2 = "Pranav";

        // String name3 = new String("Pranav");
        // String name4 = new String("Pranav");

        // //Coz both name and name2 refer to the same string literal in the string pool
        // //Java optimizes memory by storing string literals in a common pool.
        // System.out.println("is name, name2 pointing to the same obj? " + (name == name2)); // Output: true
        
        // // name3 and name4 are different objects in memory
        // // even though they have the same content.
        // // They are created using the 'new' keyword.
        // System.out.println("is name3, name4 pointing to the same obj? " + (name3 == name4)); // Output: false

        // // Using equals() method to compare content
        // // This checks if the content of the strings is the same.
        // System.out.println(name.equals(name2)); // Output: true
        // System.out.println(name3.equals(name4)); // Output: true

        // System.out.println("Charactor at 2 index is: "+name.charAt(2)); // Output: a
        // System.out.println("Length of string is: "+name.length()); // Output: 6
        // System.out.println("Hello " + name + "!"); // Output: Hello Pranav!


        // System.out.println(Arrays.toString(king.toCharArray()));
    }
}
