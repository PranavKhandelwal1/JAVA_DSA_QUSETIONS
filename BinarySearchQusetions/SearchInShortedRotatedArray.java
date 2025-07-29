//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
public class SearchInShortedRotatedArray {
    public static boolean search(int[] nums, int target) {
        int peak = findPeak(nums);
        int a = binarySearch(nums,target,0,peak);
        int b = binarySearch(nums,target,peak+1,nums.length-1);
        if(nums[peak] == target)
            return true;
        if(b != -1 || a != -1) {
            return true;
        }
       
        // If array is not rotated, search entire array
    return false;

    }
    public static int findPeak(int[] nums){
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    private static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start) / 2;

            if(target == arr[mid]){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return -1;
    }

}
