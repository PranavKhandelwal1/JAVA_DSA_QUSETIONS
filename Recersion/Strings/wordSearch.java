package Recersion.Strings;

public class wordSearch {
    public static boolean exist(char[][] board, String word) {
        return helper(board, word, 0, 0);
    }
    private static boolean helper(char[][] board, String s, int i, int j){
        if(s.isEmpty()) return true;
        if(i >= board.length || j >= board[0].length) return false;
        char c = s.charAt(0);
        if(c==board[i][j]){
            if(helper(board,s.substring(1),i,0)){
                return true;
            }
            if(helper(board,s.substring(1),i,j+1)){
                return true;
            }
        }
        if(helper(board, s, i, j+1)){
            return true;
        }
        return helper(board, s, i+1, 0);
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
        System.out.println(exist(board, "AFCEE"));    // true
        System.out.println(exist(board, "SSA"));    // true
        System.out.println(exist(board, "AFEE")); // true 
        System.out.println(exist(board, "ECBA"));    // true
        System.out.println(exist(board, "AEB"));    // true
        System.out.println(exist(board, "AFEES")); // false
        System.out.println(exist(board, "AFEES")); // false
        System.out.println(exist(board, "AFXJGES")); // false
    }
}
