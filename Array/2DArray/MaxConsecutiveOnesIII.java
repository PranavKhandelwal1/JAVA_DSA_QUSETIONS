public class MaxConsecutiveOnesIII {
    //https://leetcode.com/problems/max-consecutive-ones-iii/description/?envType=study-plan-v2&envId=leetcode-75
    public static int longestOnes(int[] nums, int k) {
        int i=0,maxZero=0,maxLength=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] == 0) maxZero++;
            while(maxZero>k){
                if(nums[i] == 0){
                    maxZero--;
                }
                i++;
            }
            maxLength = Math.max(maxLength,j-i+1);
        }
    return maxLength;

    }
}
