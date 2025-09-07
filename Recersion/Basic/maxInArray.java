package Recersion.Basic;

public class maxInArray {
    static int max(int[] arr,int i ,int max){
        if(i==arr.length) return max;
        if(arr[i] > max) {
            max = arr[i];
        }
    return max(arr,i+1,max);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        System.out.println(max(arr, 0,0));
    }
}
