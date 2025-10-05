package StringsAndStringbuilders;

public class mergeTwoStr {
    //https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
    public static String mergeAlternately(String arr1, String arr2) {
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < arr1.length() && j < arr2.length()) {
            sb.append(arr1.charAt(i++));
            sb.append(arr2.charAt(j++));
        }
        while (i < arr1.length()) {
            sb.append(arr1.charAt(i++));
        }
        while (j < arr2.length()) {
            sb.append(arr2.charAt(j++));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String arr1 = "abc";
        String arr2 = "pqrstu";
        System.out.println(mergeAlternately(arr1, arr2)); // apbqcrstu
    }
}
