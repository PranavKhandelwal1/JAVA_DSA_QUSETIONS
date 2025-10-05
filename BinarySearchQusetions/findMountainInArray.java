
// https://leetcode.com/problems/find-in-mountain-array/description/

public class findMountainInArray {
    public static int findInMountainArray(int target, int[] arr) {
        int start = 0, end = arr.length - 1 ; 

        // Find the peak index in the mountain array
        int peakIndex = MaxInArray(arr);
        
        // Perform binary search on the left side of the peak
        int SearchLeft = binarySearch(arr, target, start, peakIndex - 1,true);
    
        int SearchRight = binarySearch(arr, target, peakIndex + 1, end,false);
        // If found in the left side, return the index
        if(SearchLeft != -1) {  
            return SearchLeft;
        }
        // If found in the right side, return the index
        if(SearchRight != -1) {
            return SearchRight;
        }
        // If not found, return -1
        return -1;
    }
    public static int MaxInArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while(start < end){
            int mid = start + (end-start) / 2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int binarySearch(int[] array, int target, int start, int end, boolean left) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(array[mid] == target){
                return mid;
            }
            if(left){
                if(array[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else{
                if(array[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println("Index of target in mountain array: " + findInMountainArray(3, arr)); // Output: Index of target in mountain array: 2
    }
}
