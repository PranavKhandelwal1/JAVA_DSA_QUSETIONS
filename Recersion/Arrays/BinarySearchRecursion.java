package Recersion.Arrays;

public class BinarySearchRecursion {

    static int BinarySearch(int arr[], int t, int s, int e){

        int mid = s + (e-s)/2;
        if(s>e){
            return -1;
        }
        if(t == arr[mid]){
            return mid;
        }
        else if(t < arr[mid]){
            return BinarySearch(arr, t, s, mid-1);
        }
        return BinarySearch(arr, t, mid+1, e);
    }

    public static void main(String[] args) {
        int[] ar = {1,2,4,7,8,9,14,16,20};
        System.out.println(BinarySearch(ar, 7, 0, ar.length-1));
    }
}