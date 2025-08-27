package BitWishOprators;

import java.util.Arrays;

// https://leetcode.com/problems/find-xor-sum-of-all-pairs-bitwise-and/description/
public class XORSumofAllPairsBitwiseAND {

    //Not so optimized O(M*N) time O(N*M) 
    public static int getXORSum(int[] arr1, int[] arr2) {
        
        int n = arr1.length;
        int m = arr2.length;
        int[] xor = new int[n*m];
        int ans = 0;
        int k = 0;
        while(k <= (n*m)-1){
            for(int i = 0 ; i <= n-1 ; i++){
                for(int j = 0 ; j <= m-1 ; j++){
                    xor[k] = arr1[i] & arr2[j];
                    ans ^= xor[k];
                    k++;
                }
            }
        }
    return ans;
    }

    //optimise one
    public static int getXORSumOptimisedSolution(int[] arr1, int[] arr2) {
        
        return xorOfArr(arr1) & xorOfArr(arr2);
    }

    public static int xorOfArr(int[] arr){
        int xor =  0;
        for(int i=0 ; i<=arr.length-1 ; i++){
            xor ^= arr[i];
        }
    return xor;
    }
    public static void main(String[] args) {
        int arr1[] = {12};
        int[] arr2 = {4};
        System.out.println(getXORSumOptimisedSolution(arr1, arr2));
    }
}
