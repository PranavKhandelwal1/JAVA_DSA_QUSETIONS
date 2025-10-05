import java.util.Arrays;

public class LongestSubarrayof1sAfterDeletingOneElement {
    //https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/?envType=study-plan-v2&envId=leetcode-75
    public static int longestSubarray(int[] arr) {
        int[] temp = new int[arr.length+1];
        temp[0] = 0;
        for(int i=1; i<temp.length; i++){
            temp[i] = temp[i-1] + arr[i-1];
        }
        int max = 0;
        for(int i=1; i<temp.length; i++){
            if(temp[i] > max) max = temp[i];
        }
    return max;
    }

    public static void main(String[] args) {
        int arr[] = { -5,1,5,0,-7 };
        System.out.println((longestSubarray(arr)));

    }
}
