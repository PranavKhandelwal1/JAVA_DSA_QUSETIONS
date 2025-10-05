import java.util.Arrays;
public class selectionSort {
    public static int[] selection_Sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int max = 0;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]>arr[max]){
                    max = j;
                }
            }
            int temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[max];
            arr[max] = temp;
        }
    return arr;
    }
    public static int[] selection_Sort2(int[] arr,int i, int j, int max){
        if(i == arr.length){
            return arr;
        }
        if(j<arr.length-i){
            if(arr[j]>arr[max]){
                max = j;
            }
            return selection_Sort2(arr, i, j+1, max);
        }
        int temp = arr[arr.length-1-i];
        arr[arr.length-1-i] = arr[max]; 
        arr[max] = temp;
        return selection_Sort2(arr, i+1, 0, 0);
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(selection_Sort2(arr,0,0,0)));
    }
}
