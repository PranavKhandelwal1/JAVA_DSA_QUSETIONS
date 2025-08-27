package BitWishOprators;
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class numberOfStage {
    public static int numberOfSteps(int n) {
        int c=0;
        while (n>0) {
            if((n&1) != 1){
                n /= 2;
                c++;
            } else{
                n--;
                c++;
            }
        }
    return c;
    }
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
