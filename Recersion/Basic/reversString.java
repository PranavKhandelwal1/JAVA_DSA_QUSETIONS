package Recersion.Basic;

public class reversString {
    public static void reverseString(char[] s) {
        int i=0,j=s.length-1;
        helper(s, i,j);
    }
    private static char[] helper (char[] s,int i,int j){
        if(i>=j) return s;
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        return helper(s, i+1,j-1);
    }
    public static void main(String[] args) {
        char[] a = {'a','b','c'};
        reverseString(a);
        System.out.println(java.util.Arrays.toString(a));
    }
}
