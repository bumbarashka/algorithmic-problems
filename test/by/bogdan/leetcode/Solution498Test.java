package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class Solution498Test {
    @Test
    public void testFindDiagonalOrder() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertArrayEquals(new int[]{1, 2, 4, 7, 5, 3, 6, 8, 9}, new Solution498().findDiagonalOrder(matrix));
    }

    @Test
    public void testFindDiagonalOrderEmpty() {
        int[][] matrix = {};
        assertArrayEquals(new int[0], new Solution498().findDiagonalOrder(matrix));
        matrix = new int[][]{{}};
        assertArrayEquals(new int[0], new Solution498().findDiagonalOrder(matrix));
    }

    @Test
    public void testFindDiagonalOrderSingle() {
        int[][] matrix = {{1}};
        assertArrayEquals(new int[]{1}, new Solution498().findDiagonalOrder(matrix));
    }

    @Test
    public void testFindDiagonalOrderTwoElements() {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        assertArrayEquals(new int[]{1, 2, 3, 4}, new Solution498().findDiagonalOrder(matrix));
    }

    @Test
    public void testFindDiagonalOrderRectangle() {
        int[][] matrix = {
                {1, 2, 3, 4, 5}
        };
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, new Solution498().findDiagonalOrder(matrix));
    }

    @Test
    public void testFindDiagonalOrderRectangle2() {
        int[][] matrix = {
                {1},
                {2},
                {3},
                {4},
                {5}
        };
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, new Solution498().findDiagonalOrder(matrix));
    }
}
