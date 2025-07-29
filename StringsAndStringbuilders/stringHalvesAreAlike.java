package StringsAndStringbuilders;

public class stringHalvesAreAlike {
    public static boolean halvesAreAlike(String s) {
        int l = 0;
        int r = 0;

        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                if(i<s.length()/2){
                    l++;
                }
                else{
                    r++;
                }
            }
        }
        if(l!=r){
            return false;
        }
    return true;
    }
    public static void main(String[] args) {
        String s = "snah";
        System.out.println(halvesAreAlike(s));
    }
}
