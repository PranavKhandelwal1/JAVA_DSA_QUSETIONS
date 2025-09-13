package Recersion.MuliDArrays;

import java.util.ArrayList;
import java.util.List;

//you have horse on chess board
public class nKnight {
    public static List<List<String>> knight(boolean[][] arr, int r, int c, int knight) {
        List<List<String>> res = new ArrayList<>();
        if (knight == 0) {
            res.add(display(arr));
            return res;
        }

        if (r == arr.length) {
            return res;
        }
        if (c == arr[0].length) {
            return knight(arr, r + 1, 0, knight);
        }
        if (isSafe(arr, r, c)) {
            arr[r][c] = true;
            res.addAll(knight(arr, r, c + 1, knight - 1));
            arr[r][c] = false;
        }
        res.addAll(knight(arr, r, c + 1, knight));
    return res;
    }

    private static boolean isSafe(boolean[][] arr, int r, int c) {
        // Check each possible knight move separately
        if (r - 2 >= 0 && c + 1 < arr[0].length && arr[r - 2][c + 1]) {
            return false;
        }
        if (r - 2 >= 0 && c - 1 >= 0 && arr[r - 2][c - 1]) {
            return false;
        }
        if (r - 1 >= 0 && c + 2 < arr[0].length && arr[r - 1][c + 2]) {
            return false;
        }
        if (r - 1 >= 0 && c - 2 >= 0 && arr[r - 1][c - 2]) {
            return false;
        }

        return true; // Safe if no knights attack
    }

    private static List<String> display(boolean[][] arr) {
        List<String> board = new ArrayList<>();
        for (boolean[] row : arr) {
            StringBuilder rowString = new StringBuilder();
            for (boolean cell : row) {
                rowString.append(cell ? "k " : "_ ");
            }
            board.add(rowString.toString());
        }
        return board;
    }

    public static void main(String[] args) {
        boolean[][] arr = new boolean[3][3];
        System.out.println(knight(arr, 0, 0, 5));
    }
}
