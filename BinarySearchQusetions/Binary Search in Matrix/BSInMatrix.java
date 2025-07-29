public class BSInMatrix {
    //https://leetcode.com/problems/search-a-2d-matrix/description/?envType=problem-list-v2&envId=binary-search
    public static boolean searchMatrix(int[][] arr, int target) {
        int start = 0, end = arr[0].length-1;
        while(start < arr.length && end >= 0) {
            
            if(target == arr[start][end]) return true;
            else if(target > arr[start][end]){
                start++;
            }
            else if(target < arr[start][end]){
                end--;
            }
        }
    return false;
    }
    public static void main(String[] args) {
        // int [][] arr = {
        //     {1, 3, 5, 7},
        //     {10, 11, 16, 20},
        //     {23, 30, 34, 60}
        // };
        int[][] arr2 = {
          {1,2,3,4,5},
          {6,7,8,9,10},
          {11,12,13,14,15},
          {16,17,18,19,20},
          {21,22,23,24,25} // Example matrix  
        };
        // int target = 1, target2 = 3, target3 = 5, target4 = 7, target5 = 10,  target6 = 11, 
        // target7 = 16, target8 = 20, target9 = 23, target10 = 30, target11 = 34, target12 = 60, target13 = 100;

        // System.out.println(searchMatrix(arr, target)); // Output: true
        // System.out.println(searchMatrix(arr, target2)); // Output: true
        // System.out.println(searchMatrix(arr, target3)); // Output: true
        // System.out.println(searchMatrix(arr, target4)); // Output: true
        // System.out.println(searchMatrix(arr, target5)); // Output: true
        // System.out.println(searchMatrix(arr, target6)); // Output: true
        // System.out.println(searchMatrix(arr, target7)); // Output: true
        // System.out.println(searchMatrix(arr, target8)); // Output: true
        // System.out.println(searchMatrix(arr, target9)); // Output: true
        // System.out.println(searchMatrix(arr, target10)); // Output: true
        // System.out.println(searchMatrix(arr, target11)); // Output: true
        // System.out.println(searchMatrix(arr, target12)); // Output: true
        // System.out.println(searchMatrix(arr, target13)); // Output: false

        System.out.println(searchMatrix(arr2, 20)); // Output: true
        System.out.println(searchMatrix(arr2, 100)); // Output: false
        System.out.println(searchMatrix(arr2, 1)); // Output: true
    }
}
