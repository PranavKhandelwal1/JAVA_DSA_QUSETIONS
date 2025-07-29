public class InfinitArrayKeyFind {
    
    // Q.1 Find the index of target number in an infinite sorted array
    static int findIndex(int[] arr, int target) {
        int start = 0;
        int end = 1;
        // Expand the range until the target is within the bounds
        while (target > arr[end]) {
            int newStart = end;
            end = end + (end - start + 1)* 2; // Double the end index
            start = newStart; // Update start to the previous end
        }

        // Perform binary search in the identified range
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(array[mid] == target){
                return mid;
            }
            else if(array[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(findIndex(array, 13));
    }
}
