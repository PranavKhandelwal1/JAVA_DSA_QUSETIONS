
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/?envType=study-plan-v2&envId=binary-search
public class findMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        if(nums[0] < nums[end]) return nums[0];
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            }
            else if(nums[mid] == nums[end]){
                end--;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,0,1};
        System.out.println(findMin(arr));
    }
}
