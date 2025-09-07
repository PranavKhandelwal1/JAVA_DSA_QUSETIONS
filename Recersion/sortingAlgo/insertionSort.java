package Recersion.sortingAlgo;

import java.util.Arrays;

public class insertionSort {
    static void sort(int[] arr){
        for(int i=0 ;i<arr.length-1 ;i++){
            for(int j=0; j<i+1 ;j++){
                if(arr[j] > arr[i+1]){
                    int temp = arr[j];
                    arr[j] = arr[i+1];
                    arr[i+1] = temp; 
                }
            }
        }
    }
    public static int[] insertionSortAlgo(int[] arr, int i,int j){
        if(j == arr.length){
            return arr;
        }
        if(i < j && arr[j] < arr[i]){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            return insertionSortAlgo(arr, i+1, j);
        }
        if(i>=j) return insertionSortAlgo(arr, 0, j+1);
        return insertionSortAlgo(arr, i+1,j);
    }
    static int[] bbl(int[] arr, int i,int j){
        if(j==0) return arr;
        if(i<j){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            return bbl(arr, i+1, j);
        }else{
            return bbl(arr, 0, j-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(bbl(arr, 0, arr.length-1)));

        // System.out.println(insertionSortAlgo(arr, 1));
        // System.out.println(arr.toString());
    }
}
