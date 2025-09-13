package Recersion.MuliDArrays;

public class nQueenNumber {
    public static int totalNQueens(int n) {
        boolean[][] arr = new boolean[n][n];
        return helper(arr, 0);
    }

    private static int helper(boolean[][] arr, int r) {
        if (r == arr.length) {
            return 1;
        }
        int count = 0;
        for (int c = 0; c < arr[0].length; c++) {
            if (isSafe(arr, r, c)) {
                arr[r][c] = true;
                count += helper(arr, r + 1);
                arr[r][c] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] arr, int r, int c) {
        // top
        for (int i = r; i >= 0; i--) {
            if (arr[i][c])
                return false;
        }
        // up-left
        int min = Math.min(r, c);
        for (int i = min; i >= 0; i--) {
            if (arr[r - i][c - i])
                return false;
        }
        int minR = Math.min(r, arr.length - c - 1);
        // up-right
        for (int i = minR; i >= 0; i--) {
            if (arr[r - i][c + i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(totalNQueens(5)); //10
        System.out.println(totalNQueens(4)); //2
    }
}
