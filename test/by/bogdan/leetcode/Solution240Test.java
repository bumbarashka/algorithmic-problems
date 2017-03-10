package by.bogdan.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution240Test {
    private int[][] matrix;
    private int[][] matrix2;

    @Before
    public void setUp() throws Exception {
        matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        matrix2 = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
    }

    @Test
    public void searchMatrix() throws Exception {
        assertFalse(new Solution240().searchMatrix(null, 20));
        assertFalse(new Solution240().searchMatrix(new int[0][0], 20));

        assertTrue(new Solution240().searchMatrix(matrix, 5));
        assertFalse(new Solution240().searchMatrix(matrix, 20));
        assertFalse(new Solution240().searchMatrix(matrix, 100));
        assertFalse(new Solution240().searchMatrix(matrix, 0));

        assertFalse(new Solution240().searchMatrix(new int[][]{{1}}, 20));
        assertFalse(new Solution240().searchMatrix(new int[][]{{20}}, 1));
        assertTrue(new Solution240().searchMatrix(new int[][]{{20}}, 20));

        assertFalse(new Solution240().searchMatrix(new int[][]{{1, 2, 3, 4, 7}}, 6));
        assertFalse(new Solution240().searchMatrix(new int[][]{{1, 2, 3, 4, 7}}, -1));
        assertFalse(new Solution240().searchMatrix(new int[][]{{1, 2, 3, 4, 7}}, 8));
        assertTrue(new Solution240().searchMatrix(new int[][]{{1, 2, 3, 4, 7}}, 4));

        assertTrue(new Solution240().searchMatrix(new int[][]{{-1, 3}}, 3));

        assertTrue(new Solution240().searchMatrix(matrix2, 15));
    }
}