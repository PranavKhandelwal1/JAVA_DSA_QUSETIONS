package Recersion.Basic;

public class sumOfDigit {
    public static int sumOfDigits(int n,int sum){
        if(n==0) return 0;
        sum = n%10;

    return sum + sumOfDigits(n/10,sum);
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sumOfDigits(n,0));
    }
}
