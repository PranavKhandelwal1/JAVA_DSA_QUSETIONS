package Recersion.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/permutations-ii/?envType=problem-list-v2&envId=backtracking
public class permutationWithDuplicate {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // Important: sort first -> [1,1,2,2]
        backtrack(nums, 0, res);
        return res;
    }

    private static void backtrack(int[] arr, int i, List<List<Integer>> res) {
        if (i == arr.length) {
            List<Integer> temp = new ArrayList<>();
            for (int x : arr) temp.add(x);
            res.add(temp);
            return;
        }

        for (int j = i; j < arr.length; j++) {
            // Skip duplicates by ensuring only the first occurrence is used at this level
            if (hasDuplicate(arr, i, j)) continue;

            swap(arr, i, j);
            backtrack(arr, i + 1, res);
            swap(arr, i, j);
        }
    }
    private static boolean hasDuplicate(int[] arr, int start, int end) {
        for (int k = start; k < end; k++) {
            if (arr[k] == arr[end]) return true;
        }
        return false;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2 ,2 };
        System.out.println(permuteUnique(arr));
    }
}
