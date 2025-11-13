package StacksAndQueues.Stacks;

import java.util.*;

//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
public class MinimumAddtoMakeParenthesesValid {

    // O(n) O(n)
    public static int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(c);
            } else {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }else {
                    st.push(c);
                }
            }
        }
        return st.size();
    }
    // O(n) O(1)
    public static int minAddToMakeValidOptimized(String s) {
    int open = 0;  // Count of unmatched '('
    int add = 0;   // Count of needed ')'
    for (char c : s.toCharArray()) {
        if (c == '(') {
            open++;
        } else {
            if (open > 0) {
                open--;  // Matches an existing '('
            } else {
                add++;   // Need an extra '('
            }
        }
    }
    return open + add;
}

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("(()(((")); // 4
        System.out.println(minAddToMakeValid("(()())")); // 0
        System.out.println(minAddToMakeValid("()))((")); // 4
        System.out.println(minAddToMakeValid(")")); // 1
        System.out.println(minAddToMakeValid("((())")); // 1
        System.out.println(minAddToMakeValid("(()(((")); // 4
    }
}
