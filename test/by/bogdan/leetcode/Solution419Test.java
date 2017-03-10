package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution419Test {
    @Test
    public void countBattleships() throws Exception {
        char[][] board = {
                {'X', '.', '.', 'X'},
                {'.', '.', '.', 'X'},
                {'.', '.', '.', 'X'}
        };
        assertEquals(2, new Solution419().countBattleships(board));
    }
}