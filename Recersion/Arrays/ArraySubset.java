package Recersion.Arrays;

import java.util.*;

public class ArraySubset {
    public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), arr, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> temp, int[] arr, int start) {
        result.add(new ArrayList<>(temp));
        for (int i = start; i < arr.length; i++) {
            temp.add(arr[i]);
            backtrack(result, temp, arr, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3 };

        System.out.println(subsets(arr1));
    }
}
