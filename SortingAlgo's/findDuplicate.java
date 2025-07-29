public class findDuplicate {
    public static int findDuplicates(int[] nums) {
    
        int i = 0;

        while (i < nums.length){
            if (nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
    
    private static void swap(int[] arr, int first, int second) {
        
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int a= findDuplicates(arr);
        System.out.println("Duplicate number: " + a); // Output: Duplicate number: 2
        // The array will be modified in place, but we can print it if needed
        System.out.println("Modified Array: " + java.util.Arrays.toString(arr)); // Output
    }
}
