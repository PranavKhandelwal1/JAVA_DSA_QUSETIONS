package Recersion.Basic;
//https://www.geeksforgeeks.org/problems/geek-onacci-number/0
import java.util.Scanner;

public class coustimNacchiSeries {

    //1 2 3 6 11 19 ........
    public static int nacci(int a,int b,int c,int n){
        if(n==1) return a;
        if(n==2) return b;
        if(n==3) return c;
        return nacci(a, b, c, n-1) + nacci(a, b, c, n-2) + nacci(a, b, c, n-3);
    }
	public static void main (String[] args) {
		//code here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    int n = sc.nextInt();
			System.out.print(nacci(x,y,z,n));
		}
	}
}
