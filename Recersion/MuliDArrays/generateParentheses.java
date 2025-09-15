package Recersion.MuliDArrays;

import java.util.ArrayList;
import java.util.List;

public class generateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", n, n);
        return res;
    }
    private static void backtrack(List<String> result, String current, int left, int right) {
        // Base case: no brackets left
        if (left == 0 && right == 0) {
            result.add(current);
            return;
        }

        // If we can still place '('
        if (left > 0) {
            backtrack(result, current + "(", left - 1, right);
        }

        // If we can place ')', must have more right than left
        if (right > left) {
            backtrack(result, current + ")", left, right - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
