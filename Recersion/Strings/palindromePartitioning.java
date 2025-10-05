package Recersion.Strings;

import java.util.ArrayList;
import java.util.List;
// Start: "aab", path = []

// 1) Choose prefix "a" → path = ["a"], remaining = "ab"
//     a) Choose prefix "a" → path = ["a","a"], remaining = "b"
//         i) Choose prefix "b" → path = ["a","a","b"], remaining = ""
//             → Save ["a","a","b"]
//         ii) Backtrack → remove "b" → path = ["a","a"]
//     b) Choose prefix "ab" → not palindrome → skip
//     c) Backtrack → remove "a" → path = ["a"]
// 2) Choose prefix "aa" → path = ["aa"], remaining = "b"
//     a) Choose prefix "b" → path = ["aa","b"], remaining = ""
//         → Save ["aa","b"]
//     b) Backtrack → remove "b" → path = ["aa"]
// 3) Choose prefix "aab" → not palindrome → skip
// https://leetcode.com/problems/palindrome-partitioning/?envType=problem-list-v2&envId=backtracking
public class palindromePartitioning {
    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper(s, res, new ArrayList<>());
        return res;
    }

    private static void helper(String s, List<List<String>> res, List<String> path) {
        if(s.isEmpty()) {
            res.add(new ArrayList<>(path));
            return;
        }
        // String temp = "";
        for(int j=1; j<=s.length() ; j++){
            String sub = s.substring(0, j);
            if(palindrome(sub)){
                path.add(s.substring(0, j));
                helper(s.substring(j), res, path);
                path.remove(path.size() - 1);
            }
        }
    }
    private static boolean palindrome(String s){
        for(int i=0 ; i<s.length()/2 ; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
    return true;
    }
    public static void main(String[] args) {
        System.out.println(partition("aab")); // [[a, a, b], [aa, b]
    }
}
