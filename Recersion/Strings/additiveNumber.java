package Recersion.Strings;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/additive-number/description/?envType=problem-list-v2&envId=backtracking
public class additiveNumber {
    public static boolean isAdditiveNumber(String num) {
        for (int i = 0; i < num.length(); i++) {
            for (int j = i + 1; j < num.length(); j++) {
                if (helper(num, 0, i + 1, i + 1, j + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean helper(String str, int is, int ie, int js, int je) {
        //if either number has leading zero and is longer than 1 digit
        // 01, 00 etc.
        if ((str.charAt(is) == '0' && ie - is > 1) ||
                (str.charAt(js) == '0' && je - js > 1)) {
            return false;
        }
        int x0 = Integer.parseInt(str.substring(is, ie));
        int x1 = Integer.parseInt(str.substring(js, je));
        int sum = x0 + x1;
        int nextJEnd = je + String.valueOf(sum).length();
        if (nextJEnd > str.length()) {
            return false;
        }
        if (!str.startsWith(String.valueOf(sum), je)) {
            return false;
        }
        if (nextJEnd == str.length()) {
            return true;
        }
        return helper(str, js, je, je, nextJEnd);
    }

    public static void main(String[] args) {
        System.out.println(isAdditiveNumber("199100199")); // true
        System.out.println(isAdditiveNumber("000")); // true
        System.out.println(isAdditiveNumber("101202303")); // true
        System.out.println(isAdditiveNumber("011235")); // true

        System.out.println(isAdditiveNumber("1023")); // false
        System.out.println(isAdditiveNumber("1234")); // false
        System.out.println(isAdditiveNumber("1203")); // false
        System.out.println(isAdditiveNumber("112347")); // false
    }
}