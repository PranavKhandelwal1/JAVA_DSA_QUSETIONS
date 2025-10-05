package BitWishOprators;

public class powerOfThree {
    static int find(int base, int power){
        int ans=1;
        while (power>0) {
            if((power&1) == 1){
                ans = base * ans;
            }
            base = base * base;
            power = power >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int b=2,p=5;
        System.out.println(find(b, p));
    }
}
