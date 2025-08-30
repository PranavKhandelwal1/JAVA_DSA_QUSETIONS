package Recersion.Strings;

public class skipStringWithDuplicate {
    
    public static void remove_String(String s, String target){
        if(s.isEmpty()) return;
        if(s.startsWith("app") && !s.startsWith("apple")) 
            remove_String(s.substring(target.length()), target);
        else{ 
            System.out.print(s.charAt(0));
            remove_String(s.substring(1), target);
        } 
    }
    public static void main(String[] args) {
        String s = "appbananaappleappcat";
        String target = "app";
        remove_String(s, target); // Output: appbananappcat
    }
}
