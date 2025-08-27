public class findPivotWithDuplicate {
     public static int findPivotInRotatedDuplicateArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if(arr[start] < arr[end]) {
            return arr[start]; // Array is not rotated
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return arr[mid+1]; // Found the maximum element
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return arr[mid]; // Found the maximum element
            }

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                end--;
                start++;
            }
            else if(arr[mid] > arr[start]){
                start = mid +1 ;
            }else{
                end = mid -1;
            }
        }
    return arr[start] ;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,4,2};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {1,1,1,1,1,1,1,1,1};
        System.out.println(findPivotInRotatedDuplicateArray(arr3));
        System.out.println(findPivotInRotatedDuplicateArray(arr));
        System.out.println(findPivotInRotatedDuplicateArray(arr2));
    }
}
