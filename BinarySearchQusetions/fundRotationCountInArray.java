

public class fundRotationCountInArray {
    
    public static int findRotationCount(int[] arr) {
        int start = 0, end = arr.length - 1;

        if (arr[start] < arr[end]) {
            return 0; // Array is not rotated
        }
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return arr[start];
    }
    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Handle case when array is not rotated
        if (arr.length == 1 || arr[start] < arr[end]) {
            return end;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Check if mid-1 is pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Decide search side
            if (arr[mid] >= arr[start]) {
                start = mid + 1; // Go right
            } else {
                end = mid - 1; // Go left
            }
        }

        return -1; // Should not reach here
    }
    public static void main(String[] args) {
        int [] arr = {15, 18, 2, 3, 6, 12};
        // int[] arr2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Rotation Count: " + findRotationCount(arr));

        int[] test1 = {4, 5, 6, 7, 0, 1, 2};    // Pivot at index 3 (7)
        int[] test2 = {6, 7, 1, 2, 3, 4, 5};    // Pivot at index 1 (7)
        int[] test3 = {1, 2, 3, 4, 5};          // No rotation, pivot at index 4 (5)
        int[] test4 = {2, 3, 4, 5, 1};          // Pivot at index 3 (5)
        int[] test5 = {5, 1, 2, 3, 4};          // Pivot at index 0 (5)
        int[] test6 = {2, 1};                   // Pivot at index 0 (2)
        int[] test7 = {1};          // No rotation, pivot at index 0 (1)
        System.out.println(findPivot(test1)); // Output: 3
        System.out.println(findPivot(test2)); // Output: 1
        System.out.println(findPivot(test3)); // Output: 4
        System.out.println(findPivot(test4)); // Output: 3
        System.out.println(findPivot(test5)); // Output: 0
        System.out.println(findPivot(test6)); // Output: 0
        System.out.println(findPivot(test7)); // Output: 0
        
    }    
}
