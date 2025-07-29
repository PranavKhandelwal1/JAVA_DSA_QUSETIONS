
import java.util.Arrays;

public class bubbleSort {
    
    public static void bubbleSortAlgo(int[] arr){
        boolean swapped = false;
        int n = arr.length;

        for(int i=0 ; i<n-1 ; i++){
            for(int j=1 ; j<n-1-i ; j++){
                if(arr[j] < arr[j-1] ){ // Change to < for ascending order
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break; // No swaps means the array is sorted
            }
        }   
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        bubbleSortAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }
}
