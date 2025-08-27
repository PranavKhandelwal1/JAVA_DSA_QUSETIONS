package cycleSort;
import java.util.Arrays;
public class cycleSortAlgo {

    public static void cycleSortAlgorithem(int[] arr){
        int i=0;

        while (i<arr.length) {
            int index = arr[i] - 1;
            if(arr[i] != arr[index] ){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;   
            } else{
                i++;
            }
        }
    }
    
    public static void main(String[] args) {
        int [] arr = {3,2,1,5,43,2};
        cycleSortAlgorithem(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5]
    }
}