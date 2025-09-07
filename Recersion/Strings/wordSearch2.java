package Recersion.Strings;

import java.util.Arrays;

public class wordSearch2 {
    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols]; // keep track of visited cells

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, String word, int r, int c, int index, boolean[][] visited) {
        // ✅ matched all characters
        if (index == word.length()) {
            return true;
        }

        // ❌ invalid position or already visited
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length) {
            return false;
        }
        if (visited[r][c]) {
            return false;
        }
        if (board[r][c] != word.charAt(index)) {
            return false;
        }

        // mark current cell as visited
        visited[r][c] = true;

        // explore neighbors
        boolean found = dfs(board, word, r + 1, c, index + 1, visited) ||
                        dfs(board, word, r - 1, c, index + 1, visited) ||
                        dfs(board, word, r, c + 1, index + 1, visited) ||
                        dfs(board, word, r, c - 1, index + 1, visited);

        // backtrack (unmark the cell)
        visited[r][c] = false;

        return found;
    }
    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        System.out.println(exist(board, "ABC"));    // true
        System.out.println(exist(board, "SEE"));    // true
        System.out.println(exist(board, "ABCCED")); // true 
        System.out.println(exist(board, "AFCCED")); // false 
    }
}
