package BitWishOprators;
//https://leetcode.com/problems/counting-bits/
import java.util.Arrays;

public class countBits {
    public static int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i=1;i<=n;i++){
            int x = i;
            int c=0;
            while(x>0){
                c++;
                x=(x&(x-1));
            }
            arr[i]=c;
        }
    return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
    }
}
