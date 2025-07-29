// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class peakIndexInMountain {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while(start < end){
            int mid = start + (end-start) / 2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        System.out.println(arr[start]);
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,8,5,3,9,5,3,4,2,6,9,1,0,2,77,8};
        int peakIndex = peakIndexInMountainArray(arr);
        System.out.println("Peak Index in Mountain Array: " + peakIndex); // Output: 
    }
}
