package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution463Test {
    @Test
    public void islandPerimeter() throws Exception {
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};
        assertEquals(16, new Solution463().islandPerimeter(grid));
    }
}