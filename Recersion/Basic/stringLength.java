package Recersion.Basic;
public class stringLength {
    static int find(String s){
        int c = 0;
        return helper(s,c);
    }
    private static int helper(String s, int c){
        if(s.isEmpty()) return c;

    return helper(s.substring(1), c+1);
    }
    public static void main(String[] args) {
        String s = "Pranav";
        System.out.println(find(s));
    }
}
