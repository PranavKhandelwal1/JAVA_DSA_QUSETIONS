// https://leetcode.com/problems/missing-number/description/
import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int index = arr[i];
            if(arr[i] != i && arr[i] < arr.length){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;   
            } else {
                i++;        
            }
        }
        for(int j=0; j<arr.length ;j++){
            if(arr[j] != j){
                return j; // Return the missing number
            }
        }
    return -1; // Placeholder return value, to be replaced with actual logic
    }
    public static void main(String[] args) {
        int[] arr =  {5 ,0, 1, 2, 3};
        System.out.println(missingNumber(arr)); // Output: 4
        System.out.println("Sorted Array: " + Arrays.toString(arr)); // Output: [0, 1, 2, 3, 5]
    }
}
