package Recersion.Strings;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class combinationOfMobile {
    public static List<String> letterCombinations(String digits) {
    if (digits.isEmpty()) {
        return new ArrayList<>(); // original call with ""
    }
    return helper(digits);
}

private static List<String> helper(String digits) {
    if (digits.isEmpty()) {
        List<String> base = new ArrayList<>();
        base.add(""); // important for recursion
        return base;
    }

    int digit = digits.charAt(0) - '0';
    int start = 0, end = 0;

    switch (digit) {
        case 7:
            start = ((digit - 1) * 3 - 3);
            end = ((digit - 1) * 3 + 1);
            break;
        case 8:
            start = ((digit - 1) * 3 - 2);
            end = ((digit - 1) * 3 + 1);
            break;
        case 9:
            start = ((digit - 1) * 3 - 2);
            end = ((digit - 1) * 3 + 2);
            break;
        default:
            start = ((digit - 1) * 3 - 3);
            end = ((digit - 1) * 3);
            break;
    }

    List<String> res = new ArrayList<>();
    for (int i = start; i < end; i++) {
        char ch = (char) ('a' + i);
        List<String> sub = helper(digits.substring(1));
        for (String s : sub) {
            res.add(ch + s);
        }
    }
    return res;
}
    public static void main(String[] args) {
        String s = "23456789";
        System.out.println(letterCombinations(s));
    }
}
