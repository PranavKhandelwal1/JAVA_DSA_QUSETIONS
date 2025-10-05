package Recersion.MuliDArrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/n-queens/description/
public class nQueen {
    public static List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];        
        return helper(board, 0, 0);
    }

    private static List<List<String>> helper(boolean[][] arr, int row, int col) {
        int n = arr[0].length;
        List<List<String>> res = new ArrayList<>();
        // if all rows are filled, save solution
        if (row == n) {
            res.add(display(arr));
            return res;
        }

        // if we checked all columns in this row, move to next row
        if (col == n) {
            return res;
        }

        // place queen if safe
        if (checkIsSafe(arr, row, col)) {
            arr[row][col] = true;
            res.addAll(helper(arr, row + 1, 0)); // move to next row, reset col to 0
            arr[row][col] = false; // backtrack
        }

        // try next column in same row
        res.addAll(helper(arr, row, col + 1));
    return res;
    }

    // checking if the Queen exist in upper level
    private static boolean checkIsSafe(boolean[][] arr, int r, int c) {
        // checking in top
        for (int i = r; i >= 0; i--) {
            if (arr[i][c])
                return false;
        }
        int min = Math.min(r, c);
        // left dignonal
        for (int i = min; i >= 0; i--) {
            if (arr[r - i][c - i])
                return false;
        }

        int min2 = Math.min(r, arr[0].length - c - 1);
        // right dignonal
        for (int i = min2; i >= 0; i--) {
            if (arr[r - i][c + i])
                return false;
        }
        return true;
    }

    // display matrix as String
    private static List<String> display(boolean[][] arr) {
        List<String> list = new ArrayList<>();
        for (boolean[] a : arr) {
            StringBuilder sb = new StringBuilder();
            for (boolean b : a) {
                if (b) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            list.add(sb.toString());
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
}
