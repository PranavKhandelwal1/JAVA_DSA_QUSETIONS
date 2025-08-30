package Recersion.Strings;

public class removeString {
    
    public static String removeStr(String s, String target){
        if(s.isEmpty()) return "";
        if(s.startsWith(target)) return removeStr(s.substring(target.length()), target);
        else return s.charAt(0) + removeStr(s.substring(1), target);
    }
    public static void remove_String(String s, String target){
        if(s.isEmpty()) return;
        if(s.startsWith(target)) 
            remove_String(s.substring(target.length()), target);
        else{ 
            System.out.print(s.charAt(0));
            remove_String(s.substring(1), target);
        } 
    }
    public static void main(String[] args) {
        String s = "baccappledadapple";
        String target = "apple";
        System.out.println(removeStr(s, target)); // Output: baccdad
        remove_String(s, target);
    }
}
