package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution54Test {
    @Test
    public void spiralOrder() throws Exception {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertArrayEquals(new Integer[]{1, 2, 3, 6, 9, 8, 7, 4, 5}, new Solution54().spiralOrder(matrix).toArray(new Integer[9]));

        matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7}, new Solution54().spiralOrder(matrix).toArray(new Integer[12]));

        matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10}, new Solution54().spiralOrder(matrix).toArray(new Integer[16]));

        matrix = new int[][]{
                {1, 2},
                {3, 4}
        };
        assertArrayEquals(new Integer[]{1, 2, 4, 3}, new Solution54().spiralOrder(matrix).toArray(new Integer[4]));

        matrix = new int[][]{{1}};
        assertArrayEquals(new Integer[]{1}, new Solution54().spiralOrder(matrix).toArray(new Integer[1]));
    }

}