package Recersion.sortingAlgo;

import java.util.Arrays;

public class margeSort {
    
    public static void mergeIndex(int arr[], int s, int e){
        if(e-s==1) return;
        int m = s+(e-s)/2;

        mergeIndex(arr, s, m);
        mergeIndex(arr, m, e);

        mersortArray(arr, s, m, e);
    }
    private static void mersortArray(int arr[], int s, int m, int e){
        int[] temp = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;

        while (i<m && j<e) {
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            } 
            k++;
        }
        while (i<m) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            temp[k] = arr[j];
            j++;
            k++;    
        }

        for(int l=0;l<temp.length;l++){
            arr[s+l] = temp[l];
        }
    }


    public static int[] merge(int arr[]){
        if(arr.length==1) return arr;
        int m = arr.length/2;
        int left[] = merge(Arrays.copyOfRange(arr, 0, m));
        int right[] = merge(Arrays.copyOfRange(arr, m,arr.length));

        return mersort(left,right);
    }
    private static int[] mersort(int left[], int[] right){
        int[] temp = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i<left.length && j<right.length) {
            if(left[i] < right[j]){
                temp[k] = left[i];
                i++;
            }else{
                temp[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<left.length) {
            temp[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            temp[k] = right[j];
            j++;
            k++;    
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] arr1 = {9,8,7,6,5,4,3,2,1};
        mergeIndex(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        // merge(arr1);
        // System.out.println(Arrays.toString(arr1));
    }
}
