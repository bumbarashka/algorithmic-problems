package by.bogdan.leetcode;

/**
 * Solution for 'Word Search' algorithmic problem.
 * Given a 2D board and a word, find if the word exists in the grid.
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally
 * or vertically neighboring. The same letter cell may not be used more than once.
 * @see <a href="https://leetcode.com/problems/word-search">79. Word Search (on leetcode.com)</a>
 */
public class Solution079 {
    /**
     * Worst case efficiency is O(n*m*word.length()). Memory usage is O(1).
     * @param board
     *          a 2D board
     * @param word
     *          a word
     * @return if the word exists in the grid
     */
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        if (word == null || word.length() == 0) {
            return true;
        }
        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if (checkCell(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] board, int i, int j, String word, int k) {
        if (k == word.length()) {
            return true;
        }
        if (i > 0 && checkCell(board, i - 1, j, word, k)) {
            return true;
        }
        if (j > 0 &&  checkCell(board, i, j - 1, word, k)) {
            return true;
        }
        if (i < board.length - 1 && checkCell(board, i + 1, j, word, k)) {
            return true;
        }
        if (j < board[0].length - 1 && checkCell(board, i, j + 1, word, k)) {
            return true;
        }
        return false;
    }

    private boolean checkCell(char[][] board, int i, int j, String word, int k) {
        if (board[i][j] == word.charAt(k)) {
            // because  a == a ^ b ^ b
            // and for any english letter: c ^ 256 > 256 => c != c ^ 256
            board[i][j] ^= 256;
            if (exist(board, i, j, word, k + 1)) {
                return true;
            }
            board[i][j] ^= 256;
        }
        return false;
    }
}
