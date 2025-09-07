package Recersion.Arrays;

public class targetSum {
    public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        int c = 0;
        if(sum==target) c++;
        if(sum>target){
            for(int i=0;i<nums.length;i++){
                int sumIN=0;
                int neg = (0 - nums[i]);
                for(int j=0;j<nums.length;j++){    
                    if(i==j){
                        continue;   
                    }
                    sumIN += nums[j];
                }
                int ans = sumIN + neg;
                if(ans==target){
                    c++;
                }

            }
        }
    return c;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5};
        System.out.println(findTargetSumWays(arr, 0));
    }
}
