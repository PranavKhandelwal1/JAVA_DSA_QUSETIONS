package Basic;

public class sqrtOfNumber {
    public static double root(int n, int digits) {
        int s = 0, e = n;
        double root = 0.0;
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == n)
                return m;
            if (m * m > n)
                e = m - 1;
            else
                s = m + 1;
        }
        double increment = 0.1;
        for (int i = 0; i < digits; i++) {
            while (root * root <= n) {
                root += + increment;
            }
            root -= increment;
            increment /= 10;
        }
        return root;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(root(n, 3));
    }
}
