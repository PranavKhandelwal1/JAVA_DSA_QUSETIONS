
public class searchInSortedMatrix {
    //https://leetcode.com/problems/search-a-2d-matrix/description/?envType=problem-list-v2&envId=binary-search
    
    public static boolean searchMatrix(int[][] arr, int target) {
        int start = 0, end = arr[0].length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid][end] == target) {
                return true;
            } else if (arr[mid][end] < target) {
                start= mid + 1;
            } else {
                end = mid - 1;
            }
            if(start == mid && mid == end) {
                return binarySearch(arr, target, start,arr.length-1);
            }
        }
        return false;
    } 
    public static boolean binarySearch(int[][] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid][0] == target) {
                return true;
            } else if (arr[mid][0] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            
        }
    return false;
    }
    public static void main(String[] args) {
        int[][] arr = {
          {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25} // Example matrix  
        };
        int target = 20; // Example target
        System.out.println(searchMatrix(arr, target)); // Output: true
    }
}

