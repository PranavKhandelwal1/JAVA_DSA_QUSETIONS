package Recersion.MuliDArrays;

import java.util.ArrayList;

public class mazeWithObstical {
    public static ArrayList<ArrayList<String>> maze(int[][] arr,String s, int StartRow,
                                                                     int StartC,int obsI,int obsJ){
        if(StartRow == arr.length-1 && StartC == arr[0].length-1){
            ArrayList<ArrayList<String>> outer = new ArrayList<>();
            ArrayList<String> in = new ArrayList<>();
            in.add(s);
            outer.add(in);
            return outer;
        }
        ArrayList<ArrayList<String>> outer = new ArrayList<>();
        //this is the only change in code otherwish its the same!!
        if(StartRow == obsI && StartC == obsJ){
            return outer;
        }
        if(StartRow < arr.length-1 ) {
            outer.addAll(maze(arr, s+"Down -> ", StartRow+1, StartC,obsI,obsJ));
        }
        if(StartC < arr[0].length-1) {
            outer.addAll(maze(arr, s+"Right -> ", StartRow, StartC+1,obsI,obsJ));
        }

    return outer;
    }

    //print the actuall direction path including dignonal in arrayList
    public static ArrayList<ArrayList<String>> printPathDignonal(int[][] arr,String s, int StartRow,
                                                                     int StartC,int obsI,int obsJ){
        if(StartRow == arr.length-1 && StartC == arr[0].length-1){
            ArrayList<ArrayList<String>> outer = new ArrayList<>();
            ArrayList<String> in = new ArrayList<>();
            in.add(s);
            outer.add(in);
            return outer;
        }
        ArrayList<ArrayList<String>> outer = new ArrayList<>();

        if(StartRow == obsI && StartC == obsJ){
            return outer;
        }
        if(StartRow < arr.length-1) {
            outer.addAll(printPathDignonal(arr, s+"D,", StartRow+1, StartC, obsI, obsJ));
        }
        if(StartC < arr[0].length-1 && StartRow < arr.length-1) {
            outer.addAll(printPathDignonal(arr, s+"Di,", StartRow+1, StartC+1, obsI, obsJ));
        }
        if(StartC < arr[0].length-1) {
            outer.addAll(printPathDignonal(arr, s+"R,", StartRow, StartC+1, obsI, obsJ));
        }

    return outer;
    }
    public static void main(String[] args) {
        int[][]arr = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        System.out.println(printPathDignonal(arr, "", 0, 0, 1, 1));

    }
}
