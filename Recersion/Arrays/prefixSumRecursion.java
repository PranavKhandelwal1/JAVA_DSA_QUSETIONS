package Recersion.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class prefixSumRecursion {
    public static int[] recursivePrefix(int[] arr){
        int[] prefix = new int[arr.length];
        return helper(arr, prefix, 0);
    }
    private static int[] helper(int[] arr, int[] prefix, int i){
        if(i == arr.length) return prefix;
        if(i == 0) prefix[i] = arr[i];
        else prefix[i] = prefix[i-1] + arr[i];
        return helper(arr, prefix, i+1);
    }


    // prefix sum using recursion without extra space
    public static void PrefixSum(int[] arr, int i) {
        if (i == arr.length) return;
        if(i == 0) i++;
        // if (i > 0) {
        arr[i] += arr[i - 1];  // overwrite with cumulative sum
        
        PrefixSum(arr, i + 1);
    }

    // prefix sum using range based
    public static void prefixSumRang(int[] arr, int s, int e,int currentSum) {
        if (s>e) return;
        if(s > 0){
            arr[s] += currentSum;  // overwrite with cumulative sum
        }

        prefixSumRang(arr, s + 1,e,arr[s]);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        // prefixSumRang(arr,1,4,0);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(java.util.Arrays.toString(recursivePrefix(arr))); //[1, 3, 6, 10, 15]
        PrefixSum(arr, 0);
        System.out.println(java.util.Arrays.toString(arr)); //[1, 3, 6, 10, 15]
    }
}
