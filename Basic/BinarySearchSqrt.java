package Basic;
public class BinarySearchSqrt {
    
    public static double sqrt(int n, int d){
        double root = 0.0;
        int s=0,e=n;
    
        while (s<=e) {
            int m = s+(e-s)/2;
            if(m*m == n){
                return m;
            }
            else if(m*m > n){
                e = m - 1;
            }
            else{
                s = m + 1;
            }
        }
        double increment = 0.1;
        for(int i = 0 ; i < d ; i++){
            while (root * root <= n) {
                root = root + increment;
            }
            root = root - increment;
            increment = increment / 10;
        }
        
    return root;
    }

    public static void main(String[] args) {
        int n = 30, n2 =36;
        System.out.printf("%.100f%n",sqrt(n, 100));
        System.out.println(sqrt(n2, 0));
    }
}
