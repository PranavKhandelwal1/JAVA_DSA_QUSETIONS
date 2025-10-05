package Recersion.Basic;
// import static Recursion.Arrays.BinarySearchRecursion.BinarySearch;  
import java.util.*;
//https://www.codechef.com/problems/FIBXOR01/

//its not workin in vs code but working on codechef
public class specialFebonachi {

     // Function to get the nth number in the modified Fibonacci-like sequence
    static long febo(long x, long y, long n) {
        long mod = n % 3;
        if (mod == 0) return x;
        if (mod == 1) return y;
        return x ^ y; // XOR of x and y
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("Enter x, y, n: ");
            long x = sc.nextLong();
            long y = sc.nextLong();
            long n = sc.nextLong();
            System.out.println(febo(x, y, n));
        }

        sc.close();
    }
}
