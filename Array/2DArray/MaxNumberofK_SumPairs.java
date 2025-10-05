// https://leetcode.com/problems/max-number-of-k-sum-pairs/description/?envType=study-plan-v2&envId=leetcode-75
import java.util.Arrays;

public class MaxNumberofK_SumPairs {
    public static int maxOperations(int[] nums, int k) {
        int i=0, j=nums.length-1;
        int count = 0;
        Arrays.sort(nums);
        while(i<j){
            if(nums[i] + nums[j] == k){
                count++;
                i++;
                j--;
            } else if(nums[i] + nums[j] < k){
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 10;
        System.out.println(maxOperations(nums, k));
    }
}
