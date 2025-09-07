package Recersion.Basic;

public class minInArray {
    static int min(int[] arr,int i ,int min){
        if(i==arr.length) return min;
        if(arr[i] < min) {
            min = arr[i];
        }
    return min(arr,i+1,min);
    }
    public static void main(String[] args) {
        int[] arr = {5,3,1,4};
        System.out.println(min(arr, 0,arr[0]));
    }
}
