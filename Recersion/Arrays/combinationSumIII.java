package Recersion.Arrays;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/combination-sum-iii/?envType=problem-list-v2&envId=backtracking
public class combinationSumIII {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), k, n, 1);
        return result;
    }
    private static void helper(List<List<Integer>> result, List<Integer> comb, int k, int remain, int start) {
        if (remain == 0 && comb.size() == k) {
            result.add(new ArrayList<>(comb));
            return;
        }
        if (remain < 0 || comb.size() > k) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            comb.add(i);
            helper(result, comb, k, remain - i, i + 1);
            comb.remove(comb.size() - 1);
        }
    }
    public static void main(String[] args) {
        int k = 3, n = 7;
        System.out.println(combinationSum3(k, n)); // [[1,2,4]]

        k = 3;
        n = 9;
        System.out.println(combinationSum3(k, n)); // [[1,2,6],[1,3,5],[2,3,4]]

        k = 4;
        n = 1;
        System.out.println(combinationSum3(k, n)); // []

        k = 3;
        n = 2;
        System.out.println(combinationSum3(k, n)); // []

        k = 9;
        n = 45;
        System.out.println(combinationSum3(k, n)); // [[1,2,3,4,5,6,7,8,9]]
    }
}


// Start: [], remain = 7, k = 3

//  ├── pick 1 → [1], remain = 6
//  │     ├── pick 2 → [1,2], remain = 4
//  │     │     ├── pick 3 → [1,2,3], remain = 1 (too small, fail)
//  │     │     ├── pick 4 → [1,2,4], remain = 0 ✅ valid
//  │     │     ├── pick 5 → [1,2,5], remain = -1 (fail)
//  │     │     └── ... (larger numbers fail)
//  │     ├── pick 3 → [1,3], remain = 3
//  │     │     ├── pick 4 → [1,3,4], remain = -1 (fail)
//  │     │     └── ...
//  │     ├── pick 4 → [1,4], remain = 2
//  │     │     ├── pick 5 → [1,4,5], remain = -3 (fail)
//  │     │     └── ...
//  │     └── ...
//  │
//  ├── pick 2 → [2], remain = 5
//  │     ├── pick 3 → [2,3], remain = 2
//  │     │     ├── pick 4 → [2,3,4], remain = -2 (fail)
//  │     │     └── ...
//  │     ├── pick 4 → [2,4], remain = 1
//  │     │     ├── pick 5 → [2,4,5], remain = -4 (fail)
//  │     │     └── ...
//  │     └── ...
//  │
//  ├── pick 3 → [3], remain = 4
//  │     ├── pick 4 → [3,4], remain = 0 but only 2 numbers (need 3) → fail
//  │     └── ...
//  │
//  ├── pick 4 → [4], remain = 3 (too small for 2 numbers left)
//  └── ...
