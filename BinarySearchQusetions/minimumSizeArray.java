public class minimumSizeArray {
    //https://leetcode.com/problems/minimum-size-subarray-sum/?envType=problem-list-v2&envId=binary-search
    public static int minSubArrayLen(int target, int[] arr) {
        int start = 0;
        int a[] = {2,3,1,2,4,3};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            for(int j=1; sum < arr.length;j++){
                if(sum < target){
                    sum += arr[j];
                }
                else{
                    sum -= arr[i];
                }
            }
        }
    return start-1;
    }
}
