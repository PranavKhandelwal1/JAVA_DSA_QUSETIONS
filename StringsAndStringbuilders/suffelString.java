package StringsAndStringbuilders;

// 
// https://leetcode.com/problems/shuffle-string/
public class suffelString {
    public static String restoreString(String s, int[] arr) {
        StringBuilder string = new StringBuilder(s);
        
        for(int i = 0; i < arr.length; i++){
            char ch = s.charAt(i);
            string.setCharAt(arr[i], ch);
        }
    return string.toString();
    }
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String aString = restoreString(s, indices);
        System.out.println(aString);
    }
}
