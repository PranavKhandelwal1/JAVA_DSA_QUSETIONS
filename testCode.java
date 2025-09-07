import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// https://leetcode.com/problems/missing-number/?envType=problem-list-v2&envId=binary-search
public class testCode {
    static int sort(int[] arr){
        int i =0;
        int a = 0;
        while(i<arr.length){
    
            int index = arr[i] -1;
            if(arr[i] > 0 && arr[i]<=arr.length && arr[i] != arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }else{
                i++;
            }
        }
        
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
                a = j+1;
            }
        }
    return a;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,0};
        System.out.println(sort(arr));
    }
}
