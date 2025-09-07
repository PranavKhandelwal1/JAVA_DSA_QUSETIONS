import java.util.ArrayList;
import java.util.Arrays;

public class slidingWindow {
    // Brute Force Approach
    public static void slidingWindowAlgo(int[] arr,int k){
        int n = arr.length;
        
        for(int i=0;i<n-2;i++){
            int sum = 0;
            for(int j = i; j < k; j++){
                sum = sum + arr[j];
            }
            k++;
            System.out.print(sum+",");
        }
        // System.out.println(sum);
    }
    // Optimal Approach
    public static void slidingWindowAlgo2(int[] arr, int k){
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum = sum + arr[i];
        }
        System.out.print(sum+",");
        for(int i=k;i<n;i++){
            sum = sum + arr[k] - arr[i-k];
            System.out.print(sum+" ");
        }
    }
    // Optimal Approach - return array
    public static int[] slidingWindowAlgo3(int[] arr, int k){
        
        int[] temp = new int[arr.length - k + 1];
        
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum = sum + arr[i];
        }
        int j = 0;
        temp[j++] = sum;
        
        for(int i=k;i<n;i++){
            sum = sum + arr[k] - arr[i-k];
            temp[j++] = sum;
        }
        return temp;
    }

    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int windowSize = 3;
        slidingWindowAlgo2(arr,3);
        System.out.println();
    }
}