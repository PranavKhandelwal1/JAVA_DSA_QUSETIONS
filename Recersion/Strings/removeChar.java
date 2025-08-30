package Recersion.Strings;

public class removeChar {
    
    static String removeChar(String str, String t){
        if(str.length() == 0){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == t.charAt(0)){
            return removeChar(str.substring(1), t);
        }else{
            return ch + removeChar(str.substring(1), t);
        }
    }
    public static void main(String[] args) {
        String str = "baccad";
        String t = "a";
        System.out.println(removeChar(str, t));
    }
}
