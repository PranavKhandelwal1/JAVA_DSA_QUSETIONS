public class findMax {
    public static int findPivotNumberInRotatedArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if(arr[start] < arr[end]) {
            return arr[end]; // Array is not rotated
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[start]){
                start = mid;
            }
            else{
                end = mid - 1;
            }
        }
    return arr[start];
    }
    public static void main(String[] args) {
         int[] arr = {1,1,1,1,1,1,1,1,1};
        System.out.println(findPivotNumberInRotatedArray(arr));
    }
}
