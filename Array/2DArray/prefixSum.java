import java.lang.reflect.Array;
import java.util.Arrays;

public class prefixSum {
    public static int[] prefix(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
    return prefix;
    }
    public static int rangeSum(int[] prefix, int l, int r){
        if(l == 0) return prefix[r];
        return prefix[r] - prefix[l-1];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(prefix(arr))); //[1, 3, 6, 10, 15]
    }
}
