package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/battleships-in-a-board/
 */
public class Solution419 {
    public int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'X' && (j == 0 || (board[i][j - 1] != 'X')) && (i == 0 || (board[i - 1][j] != 'X'))) {
                    count++;
                }
            }
        }
        return count;
    }
}
