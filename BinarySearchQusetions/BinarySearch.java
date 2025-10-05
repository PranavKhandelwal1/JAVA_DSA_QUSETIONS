public class BinarySearch {
    static int binarySearch(int[] arr, int target) {
        int start = 0; 
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2; // To avoid overflow
            
            if(arr[mid] == target) {
                return mid; // Target found
            } else if(arr[mid] < target) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not founds
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = binarySearch(arr, target);
        System.out.println("Element found at index: " + result); // Output: Element found at index: 4
    }
}
