

import java.util.ArrayList;

public class twoPointerMethode {
    public static ArrayList<ArrayList<Integer>> hasPairWithSum(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                result.add(pair);
                left++;
                right--;
                // pair found
            }
            else if (sum < target) left++;   // need bigger sum
            else right--;                   // need smaller sum
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 8;
        System.out.println(hasPairWithSum(arr, target)); // true (2+6, 3+5)
    }
}
