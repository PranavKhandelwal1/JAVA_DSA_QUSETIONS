public class SplitArrayLargestSum {
   //https://leetcode.com/problems/split-array-largest-sum/description/
    public static int splitArray(int[] nums, int k) {
        int start = 0, end = 0;
        int result = -1;
        for (int i : nums) {
            end += i;
            start = Math.max(start, i);
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(nums, k, mid)) {
                result = mid;
                end = mid - 1;
                
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    private static boolean isPossible(int[] arr, int k, int mid) {
        int count = 1;
        int currSum = 0;
        for (int num : arr) {
            if (num > mid)
                return false;
            if (currSum + num > mid) {
                count++;
                currSum = num;
                if (count > k) {
                    return false;
                }
            } else {
                currSum += num;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
