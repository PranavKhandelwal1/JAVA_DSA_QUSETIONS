package BitWishOprators;
//convert to binary and multipli it with 5^1 5^2 5^3......5^n, addd them all after.
public class magicNUmber {
    static int find(int n){
        int base = 5, ans = 0;
        while (n>0) {
            int lastDigit = n&1;
            n = n >> 1;
            ans = ans + base * lastDigit;
            base = base*5;
        }
    return ans;
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println(find(n));
    }
}
