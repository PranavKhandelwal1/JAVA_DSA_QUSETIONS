public class BinarySearchQusetions {

    public static int findMin(int[] nums) {
    int n = nums.length;
    
    // Edge case: not rotated or only one element
    if (n == 1 || nums[0] < nums[n - 1]) {
        return nums[0];
    }

    int left = 0, right = n - 1;

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] > nums[right]) {
            // Minimum is in the right half
            left = mid + 1;
        } else if (nums[mid] < nums[right]) {
            // Minimum is in the left half or at mid
            right = mid;
        } else {
            // nums[mid] == nums[right] → can't decide, reduce right
            right--;
        }
    }

    return nums[left];
}

    public static void main(String[] args) {
        int [] nums = {4,4,5,6,6,0, 1,2,3,3,4,4};
        System.out.println(findMin(nums)); // Output: 1
    }
}