public class H_Index {
//https://leetcode.com/problems/h-index/
    public static int hIndex(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            // Number of papers with citations >= arr[i] is (n - i)
            int h = n - i;
            if (arr[i] >= h) {
                ans = h; // update answer
                break; // since array is sorted, this is the max h
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 0, 6, 1, 5 };
        System.out.println(hIndex(arr));
    }
}
