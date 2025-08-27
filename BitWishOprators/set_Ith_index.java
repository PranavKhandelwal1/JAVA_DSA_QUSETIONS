package BitWishOprators;

public class set_Ith_index {

    static int set(int n, int x){
        return x | (1<<(n-1));
    }
    public static void main(String[] args) {
        int n = 17;
        int x = 2;
        System.out.println(Integer.toBinaryString(n));
        System.out.println("set 1 At index:" + x);
        System.out.println(Integer.toBinaryString(set(x, n)));
    }
}
