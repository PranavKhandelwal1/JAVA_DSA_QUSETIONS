package Basic;
public class sqrtNewtonraphson {
    
    public static double sqrt(double n, double tolerence){
        double x=n;
        double nextX;

        while (true) {
            nextX = (x+n/x)/2;

            if(Math.abs(nextX - x) < tolerence){//Math.ads take only positive number |1.212-1.214| < 0.001
                break;
            }
            x  = nextX; //update x value with nextX
            
        }
        return nextX;
    }

    public static void main(String[] args) {
        System.out.printf ("%.6f",sqrt(20, 0.0001));
    }
}
