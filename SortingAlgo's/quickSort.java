import java.util.Arrays;

public class quickSort {

    public static void quick(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                swap(arr, s, e);
                s++;
                e--;
            }
        }
        quick(arr, low, e);
        quick(arr, s, high);

    }

    // choose last element
    public static int[] sortLastIndex(int[] arr, int s, int e) {
        if (s >= e) {
            return arr;
        }
        int pivot_index = placeAtrightIdx(arr, s, e);
        sortLastIndex(arr, s, pivot_index - 1);
        sortLastIndex(arr, pivot_index + 1, e);
        return arr;
    }

    private static int placeAtrightIdx(int[] arr, int s, int e) {
        int pivot = arr[e];
        int i = s - 1;

        for (int j = s; j < e; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, e);
        return i + 1;
    }

    // choose first element
    public static int[] sortFirstIndex(int[] arr, int s, int e) {
        if (s >= e) {
            return arr;
        }
        int pivot_index = placeAtRightIdx_II(arr, s, e);
        sortFirstIndex(arr, s, pivot_index - 1);
        sortFirstIndex(arr, pivot_index + 1, e);
        return arr;
    }

    private static int placeAtRightIdx_II(int[] arr, int s, int e) {
        int pivot = arr[s];
        int i = s;

        for (int j = s + 1; j <= e; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, s, i);
        return i;
    }

    // choose mid element
    public static int[] sortUsingMid(int[] arr, int s, int e) {
        if (s >= e)
            return arr;
        int pivot_index = placeAtrightIdxMid(arr, s, e);
        sortUsingMid(arr, s, pivot_index - 1);
        sortUsingMid(arr, pivot_index + 1, e);
        return arr;

    }

    private static int placeAtrightIdxMid(int[] arr, int s, int e) {
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                swap(arr, s, e);
                s++;
                e--;
            }
        }
        return s;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 9, 8, 4, 2, 6, 3, 5, 7 };
        int n = arr.length;

        System.out.println("Sorted Using Last Pivot Array is : " + Arrays.toString(sortLastIndex(arr, 0, n - 1)));
        System.out.println("Sorted Using First Pivot Array is : " + Arrays.toString(sortFirstIndex(arr, 0, n - 1)));
        System.out.println("Sorted Using Mid Pivot Array is : " + Arrays.toString(sortUsingMid(arr, 0, n - 1)));
    }
}
