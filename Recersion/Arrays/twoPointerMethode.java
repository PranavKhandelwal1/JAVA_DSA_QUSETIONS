package Recersion.Arrays;

import java.util.ArrayList;

public class twoPointerMethode {
    public static ArrayList<ArrayList<Integer>> hasPairWithSum(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        return helper(arr, target, 0, arr.length - 1, result);
    }
    private static ArrayList<ArrayList<Integer>> helper(int[] arr, int target, int left, int right,
                                                                    ArrayList<ArrayList<Integer>> result) {
        if(left >= right) return result; // base case: no pair found
         

        int sum = arr[left] + arr[right];
        if (sum == target) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(arr[left]);
            pair.add(arr[right]);
            result.add(pair);
            return helper(arr, target, left+1, right-1, result);
        }
        else if (sum < target) return helper(arr, target, left+1, right, result);   // need bigger sum
        else return helper(arr, target, left, right-1, result);                   // need smaller sum
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 9;
        System.out.println(hasPairWithSum(arr, target)); // true (2+6, 3+5)
    }
}
