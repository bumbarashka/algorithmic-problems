package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution074Test {
    @Test
    public void searchMatrix() throws Exception {
        assertTrue(new Solution074().searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 3));
        assertTrue(new Solution074().searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 1));
        assertTrue(new Solution074().searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 7));
        assertTrue(new Solution074().searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 50));

        assertFalse(new Solution074().searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, -1));
        assertFalse(new Solution074().searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 4));
        assertFalse(new Solution074().searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 100));
    }

    @Test
    public void searchMatrix2() throws Exception {
        assertTrue(new Solution074().searchMatrix2(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 3));
        assertTrue(new Solution074().searchMatrix2(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 1));
        assertTrue(new Solution074().searchMatrix2(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 7));
        assertTrue(new Solution074().searchMatrix2(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 50));

        assertFalse(new Solution074().searchMatrix2(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, -1));
        assertFalse(new Solution074().searchMatrix2(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 4));
        assertFalse(new Solution074().searchMatrix2(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 100));
    }

}