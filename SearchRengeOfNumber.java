public class SearchRengeOfNumber {
    //Q.4 Search for a range of target in a sorted array
    // This method returns the starting and ending index of the target in the array
    public static int[] searchRange(int[] nums, int target) {
        // Default result if target not found
        int[] result = {-1, -1};

        // Search for the leftmost (first) occurrence of target
        int leftIndex = binarySearch(nums, target, true);
        
        // Search for the rightmost (last) occurrence of target
        int rightIndex = binarySearch(nums, target, false);

        result[0] = leftIndex;
        result[1] = rightIndex;

        return result;
    }
    // Modified binary search to find leftmost or rightmost index of target
    public static int binarySearch(int[] nums, int target, boolean findFirst) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                // Move to the right half
                start = mid + 1;
            } else if (nums[mid] > target) {
                // Move to the left half
                end = mid - 1;
            } else {
                // Target found. Store index and continue search in desired direction
                ans = mid;
                if (findFirst) {
                    end = mid - 1; // Look on left side
                } else {
                    start = mid + 1; // Look on right side
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println("Start index: " + result[0] + ", End index: " + result[1]); // Output: Start index: 3, End index: 4
    }
}
