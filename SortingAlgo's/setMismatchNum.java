

// https://leetcode.com/problems/set-mismatch/description/
public class setMismatchNum {
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int i=0;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[i] != nums[index]) {
                // Swap nums[i] with nums[index]
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            } 
            else{
                i++;
            }
        } 
        for(int j=0; j<nums.length ; j++){
            if(nums[j] != j + 1) {
                result[0] = nums[j]; // The duplicate number
                result[1] = j + 1; // The missing number
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 4};
        int[] result = findErrorNums(arr);
        System.out.println("Result Array: " + java.util.Arrays.toString(result)); // Output: Result Array: [2, 3]
        // Note: The result array contains the duplicate and missing numbers.
        // The original array is modified, but the result array contains the duplicate and missing numbers.
        System.out.println("Original Array: " + java.util.Arrays.toString(arr)); // Output: Original Array: [1, 2, 2, 4]
        // Note: The original array is modified, but the result array contains the duplicate and missing    
        // numbers.
        
    }
}
