package Recersion;

public class quickSort {
    
    public static void quick(int arr[], int low, int high) {
        if(low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];


        while (s<=e) {
            while (arr[s] < pivot) {
                s++;    
            }
            while (arr[e] > pivot) {
                e--;
            }
            if(s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quick(arr, low, e);
        quick(arr, s, high);

    }
    
    public static void main(String[] args) {
        int arr[] = {1,8,4,9,6,2,3,5};
        int n = arr.length;
        quick(arr, 0, n-1);
        System.out.println("Sorted Array is : " + java.util.Arrays.toString(arr));
    }
}
