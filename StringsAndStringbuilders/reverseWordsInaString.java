package StringsAndStringbuilders;
//https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75
public class reverseWordsInaString {
    public static String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i]);
            if(i > 0){
                sb.append(" ");
            }
        }
    return sb.toString();
    }
    public static void main(String[] args) {
        String str = "  hello world  ";
        System.out.println(reverseWords(str)); // world hello
    }
}
