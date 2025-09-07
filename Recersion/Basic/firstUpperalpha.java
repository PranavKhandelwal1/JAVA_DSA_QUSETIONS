package Recersion.Basic;

public class firstUpperalpha {
    public static char firt(String s,int i){
        if(i >s.length()-1) return '_';

        if(Character.isUpperCase(s.charAt(i))) return s.charAt(i);
    return firt(s.substring(1), i);
    }
    public static void main(String[] args) {
        System.out.println(firt("njdjsds", 0));
    }
}
