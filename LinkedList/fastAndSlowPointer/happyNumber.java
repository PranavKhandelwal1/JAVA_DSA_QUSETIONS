package LinkedList.fastAndSlowPointer;
// /https://leetcode.com/problems/happy-number/submissions/
public class happyNumber {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        int slow = n, fast = n;
        do{
            slow = findSqr(slow);
            fast = findSqr(findSqr(fast));
        }while(slow != fast);

        if(slow ==1){
            return true;
        }
    return false;
    }

    private static int findSqr(int n) {
        int ans = 0;
        while (n > 0) {
            int r = n % 10;
            ans += r * r;
            n /= 10;
        }
        return ans;
    }
}
