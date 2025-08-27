package BitWishOprators;

public class reset_ith_bit {
    static int reset(int n,int x){
        return x & ~(1<<(n-1)); 
    }
    public static void main(String[] args) {
        int num = 5;
        int x = 2;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toBinaryString(reset(x, num)));

    }
}
