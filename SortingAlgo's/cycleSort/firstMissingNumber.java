package cycleSort;

// https://leetcode.com/problems/first-missing-positive/

import java.util.Arrays;

public class firstMissingNumber {
    
    public static int missingNumber(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int index = arr[i] - 1; 
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;   
            } else {
                i++;        
            }
        }
        for(int j=0; j<arr.length ;j++){
            if(arr[j] != j+1){
                return j+1; // Return the missing number
            }
        }
        System.out.println("All numbers from 1 to " + arr.length + " are present.");
    return arr.length + 1; // Placeholder return value, to be replaced with actual logic
    }
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,7,8,9,10};
        System.out.println(missingNumber(arr)); // Output: 2
        System.out.println("Sorted Array: " + Arrays.toString(arr)); // Output: [-
    }
}
