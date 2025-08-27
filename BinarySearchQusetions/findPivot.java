public class findPivot {
     public static int findMaxNumberInRotatedArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if(arr[start] <= arr[end]) {
            return -1; // Array is not rotated
        }
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if( mid > start && arr[mid] > arr[mid + 1]) {
                return arr[mid+1]; // Found the maximum element
            }
            if( mid < end && arr[mid] < arr[mid - 1]) {
                return arr[mid]; // Found the maximum element
            }
            if(arr[mid] >= arr[start]){
                start = mid +1 ;
            }
            else{
                end = mid - 1;
            }
        }
    return -1 ;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 10, 2, 3, 4, 5};
        System.out.println(findMaxNumberInRotatedArray(arr));
        int[] arr2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMaxNumberInRotatedArray(arr2));
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println(findMaxNumberInRotatedArray(arr3));
        int[] arr4 = {8,9,1,2,3,4,5,6,7};
        System.out.println(findMaxNumberInRotatedArray(arr4));
        int[] arr5 = {4,5,6,7,8,9,3};
        System.out.println(findMaxNumberInRotatedArray(arr5));
    }
}
