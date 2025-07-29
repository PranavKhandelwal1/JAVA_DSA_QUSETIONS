import java.util.Arrays;

public class insertionSortAlog {

    public static void insertionSortAlogrithem(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1 ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {5,2,4,1,3};
        insertionSortAlogrithem(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums)); // Output: [1, 2, 3, 4, 5]
    }
}
