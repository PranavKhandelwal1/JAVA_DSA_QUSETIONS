import java.util.Arrays;
//https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75
public class mulipleOfArrayExpectSelf {
    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];

         // Prefix product
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        // Suffix product
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, };
        System.out.println(Arrays.toString(productExceptSelf(nums))); // Output: [24, 12, 8, 6]
    }
}
