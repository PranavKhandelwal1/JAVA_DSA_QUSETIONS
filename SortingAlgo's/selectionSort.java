import java.util.Arrays;

public class selectionSort {
    
    public static void selectionSortAlgo(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int last = n - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    private static void swap(int[] arr,int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp; 
    }
    // Method to find the index of the maximum element in arr between start and end (inclusive)
    private static int getMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSortAlgo(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5]
    }
}
