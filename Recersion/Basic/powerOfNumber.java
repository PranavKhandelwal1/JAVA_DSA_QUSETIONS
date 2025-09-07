package Recersion.Basic;
//https://leetcode.com/problems/powx-n/description/
public class powerOfNumber {
    public static double myPow(double x, int n) {
        long N = n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        
        if(N==0) return 1;

        double half = myPow(x, (int)(N/2));
        
        if(N%2==0){
            return half * half;
        }else{ 
            return x * half *half;
        }
    }
    public static void main(String[] args) {
        System.out.println(myPow(2, 2147483646));
        System.out.println(myPow(2, -2147483647));
    }
}
