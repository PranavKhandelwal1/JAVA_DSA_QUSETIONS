import java.util.Arrays;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/?envType=problem-list-v2&envId=binary-search
public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                return new int[]{start + 1, end + 1}; // 1-based index
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return new int[]{-1, -1}; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;

        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result)); // Output: [1, 4] 
        // Explanation: numbers[0] + numbers[3] = 1 + 4 = 5
    }
}
