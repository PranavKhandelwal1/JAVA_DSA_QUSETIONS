package Recersion.MuliDArrays;

public class sudokuSolverCharArrray {
    public static void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    private static boolean helper(char[][] board, int r, int c) {
        if (r == 9)
            return true; // solved all rows

        if (c == 9)
            return helper(board, r + 1, 0); // move to next row

        if (board[r][c] != '.')
            return helper(board, r, c + 1); // skip filled

        for (char num = '1'; num <= '9'; num++) {
            if (isSafe(board, r, c, num)) {
                board[r][c] = num;
                if (helper(board, r, c + 1))
                    return true; // solved
                board[r][c] = '.'; // backtrack
            }
        }
        return false; // no valid number
    }

    private static boolean isSafe(char[][] board, int r, int c, char num) {
        // row + col
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == num || board[i][c] == num)
                return false;
        }

        // 3x3 subgrid
        int startRow = r - r % 3;
        int startCol = c - c % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num)
                    return false;
            }
        }
        return true;
    }

    // for testing
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        solveSudoku(board);
        // print solved board
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
