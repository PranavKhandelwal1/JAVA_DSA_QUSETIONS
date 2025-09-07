package Recersion.Basic;

import java.util.Scanner;

public class OnetoN {
    static void printNum(int start, int end ){
        if(start==end){
            System.out.println(end);
            return;
        }
        System.out.println(start);
        printNum(start+1,end);
    }
    public static void printNos(int n) {
        // Code here
        if(n==0) return;
        printNos(n-1);
        System.out.print(n);
    }
    public static void main(String[] args) {
        printNos(10);
    }
}
