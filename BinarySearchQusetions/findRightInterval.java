
//https://leetcode.com/problems/find-right-interval/description/?envType=study-plan-v2&envId=binary-search

import java.util.Arrays;

public class findRightInterval {
    public static int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            int t = intervals[i][1];
            int res = binary(intervals, t);
            ans[i] = res;
        }
        return ans;
    }

    private static int binary(int[][] arr, int t) {
        if (arr.length == 0)
            return -1;
        if (arr[0][0] <= arr[arr.length - 1][0]) {
            return acending(arr, t);
        } else {
            return discending(arr, t);
        }
    }

    private static int acending(int[][] arr, int t) {
        int s = 0, e = arr.length - 1;
        if (t > arr[e][0]) {
            return -1;
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid][0] == t)
                return mid;
            if (arr[mid][0] < t)
                s = mid + 1;
            else
                e = mid - 1;
        }
        return s;
    }

    private static int discending(int[][] arr, int t) {
        int s = 0, e = arr.length - 1;
        if (t < arr[e][0]) {
            return -1;
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid][0] == t)
                return mid;
            if (arr[mid][0] > t)
                s = mid + 1;
            else
                e = mid - 1;
        }
        return e;
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1,4 }, { 2, 3 }, { 3,4 } };
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }
}
