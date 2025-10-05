public class MaximumAverageSubarrayI {
    // https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int maxAvg = 0;
        for(int i=0 ; i<k; i++){
            sum += nums[i];
        }
        maxAvg = sum;
        for(int i=k; i<nums.length; i++){
            sum += nums[i] - nums[i-k];
            maxAvg = Math.max(maxAvg, sum);
        }   
    return (double)maxAvg/k;
    }
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k)); //12.75
    }
}
