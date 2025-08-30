package Recersion.Arrays;

import java.util.ArrayList;

public class slidingWindowRecursion {
    // Public method: user only passes arr and window size
    public static ArrayList<Integer> sliding_Window(int[] arr, int k) {
        return slidingWindowAlgorecursion(arr, 0, k - 1, new ArrayList<>());
    }
    private static ArrayList<Integer> slidingWindowAlgorecursion(int[] arr,int s, int e, ArrayList<Integer> temp){
        
        if(e >= arr.length) return temp;
        int sum = initialSum(arr, s, e);
        temp.add(sum);
    
        return slidingWindowAlgorecursion(arr, s+1, e+1,temp);
    }
    private static int initialSum(int[] arr, int s, int e){
        if(s>e) return 0;
        return arr[s] + initialSum(arr, s+1, e);
    }

    
    // Using Recursion - Optimal Approach
    public static ArrayList<Integer> slidingUsingRecursion(int[] arr, int windowSize){
        ArrayList<Integer> temp = new ArrayList<>();
        int sum = initialSum(arr, 0, windowSize-1);
        temp.add(sum);
        return helper(arr, windowSize, windowSize,sum,temp);
    }
    private static ArrayList<Integer> helper(int[] arr, int index, int windowSize, int sum, ArrayList<Integer> result) {
        if (index >= arr.length) return result;
        sum = sum + arr[index] - arr[index - windowSize];
        result.add(sum);
        return helper(arr, index + 1, windowSize, sum, result);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int windowSize = 3;
        System.out.println(sliding_Window(arr, windowSize));
        System.out.println(slidingUsingRecursion(arr, windowSize));
    }
}
