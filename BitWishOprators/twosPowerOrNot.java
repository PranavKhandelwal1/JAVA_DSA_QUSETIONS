package BitWishOprators;

public class twosPowerOrNot {
    public static boolean find(int n){
        int c=0;
        while (n>0) {
            int last = n&1;
            n = n>>1;
            if(last != 1){
                continue;
            }
            else{
                c++;
            }
        }
        if(c==1){
            return true;
        }
    return false;
    }
    public static boolean find2(int n){
        return ((n&(n-1)) == 0);
    }
    public static void main(String[] args) {
     
        for(int i=1; i <=1024;i=i*3){
            System.out.println(i);
            System.out.println(find2(i));
        }
        
    }
}
