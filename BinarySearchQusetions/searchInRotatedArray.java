
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class searchInRotatedArray {
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If target is the smallest element
        if (nums[pivot] == target)
            return pivot;

        // If array is not rotated, search entire array
        if (pivot == 0)
            return binarySearch(nums, target, 0, nums.length - 1);

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot, nums.length - 1);
    }

    // Find index of the smallest element (rotation pivot)
    public static int findPivot(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start; // pivot index (smallest element)
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return -1;
    }

    // method2
    public static int search2(int[] arr, int t) {
        return helper(arr, t, 0, arr.length - 1);
    }

    private static int helper(int[] arr, int t, int s, int e) {
        if (s > e)
            return -1;

        int m = s + (e - s) / 2;
        if (arr[m] == t)
            return m;
        if (arr[s] <= arr[m]) {
            if (arr[s] <= t && t <= arr[m]) {
                return helper(arr, t, s, m-1);
            } else {
                return helper(arr, t, m+1, e);
            }
        } else {
            if (arr[m] <= t && t <= arr[e]) {
                return helper(arr, t, m+1, e);
            } else {
                return helper(arr, t, s, m-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 4;
        // System.out.println(search2(arr, target)); // Output: 2
        for(int n: arr){
            System.out.println(search2(arr, n));
            System.out.println(search2(arr,8));
        }
    }
}
