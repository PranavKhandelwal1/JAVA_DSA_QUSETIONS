package Recersion.MuliDArrays;
//https://leetcode.com/problems/sudoku-solver/description/
public class sudokuSolver {
    public static void solveSudoku(int[][] board) {
        helper(board, 0, 0);
    }

    private static boolean helper(int[][] board, int r, int c) {
        if (r == board.length)
            return true; // solved

        // move to next row if end of col
        if (c == board[0].length)
            return helper(board, r + 1, 0);

        // skip filled cells
        if (board[r][c] != 0)
            return helper(board, r, c + 1);

        // try digits 1–9
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, r, c, num)) {
                board[r][c] = num;
                if (helper(board, r, c + 1))
                    return true; // solved
                board[r][c] = 0; // backtrack
            }
        }
        return false; // no solution
    }

    private static boolean isSafe(int[][] arr, int r, int c, int num) {

        // Sub matrix
        int sqrt = (int) Math.sqrt(arr.length);
        int start = r - r % sqrt;
        int end = c - c % sqrt;
        for (int i = start; i < start + sqrt; i++) {
            for (int j = end; j < end + sqrt; j++) {
                if (arr[i][j] == num) {
                    return false;
                }
            }
        }
        // left side
        for (int i = c - 1; i >= 0; i--) {
            if (arr[r][i] == num)
                return false;
        }
        // right
        for (int i = c + 1; i < arr.length; i++) {
            if (arr[r][i] == num)
                return false;
        }
        // top
        for (int i = r - 1; i >= 0; i--) {
            if (arr[i][c] == num)
                return false;
        }
        // down
        for (int i = r + 1; i < arr.length; i++) {
            if (arr[i][c] == num)
                return false;
        }
        return true;
    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
        solveSudoku(arr);
        printBoard(arr);
    }
}
