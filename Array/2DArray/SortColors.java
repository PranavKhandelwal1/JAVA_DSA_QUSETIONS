import java.util.Arrays;
public class SortColors {
    /// https://leetcode.com/problems/sort-colors/description/
    ///
    public static void sortColors(int[] arr) {
        int start = 0, mid = 0, end = arr.length - 1;
        while (mid <= end) {
            if (arr[mid] == 0) {
                swap(arr, start, mid);
                start++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, end);
                end--;
                mid++;
            }
        }

    }

    private static void swap(int[] arr, int start, int mid) {
        int temp = arr[mid];
        arr[mid] = arr[start];
        arr[start] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
