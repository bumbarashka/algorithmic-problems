package by.bogdan.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution079Test {
    private char[][] board;

    @Before
    public void setUp() throws Exception {
        board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
    }

    @Test
    public void existMethodFoundWord() throws Exception {
        assertTrue(new Solution079().exist(board, "ABCCED"));
    }

    @Test
    public void existMethodFoundSmallWord() throws Exception {
        assertTrue(new Solution079().exist(board, "SEE"));
    }

    @Test
    public void existMethodDoesNotFoundWord() throws Exception {
        assertFalse(new Solution079().exist(board, "ABCB"));
    }

    @Test
    public void existMethodFoundSingleLetter() throws Exception {
        assertTrue(new Solution079().exist(new char[][]{{'a'}}, "a"));
    }
}