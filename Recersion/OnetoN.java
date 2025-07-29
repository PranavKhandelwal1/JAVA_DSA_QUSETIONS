package Recersion;

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
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter last number: ");
        int end = sc.nextInt();

        printNum(1,end);
        sc.close();
    }
}
