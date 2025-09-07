package Recersion.Basic;

import java.util.Scanner;

//https://www.codechef.com/problems/FIBXOR01/
public class specialFebonachi {

    static int febo(int x, int y, int n){
        int mod = n % 3;
        if(mod == 0) return x;
        if(mod == 1) return y;
    return x ^ y;   
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int n = sc.nextInt();
		    System.out.println(febo(x,y,n));
		}
		sc.close();
	}
}
