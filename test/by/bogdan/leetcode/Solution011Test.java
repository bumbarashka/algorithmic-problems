package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution011Test {
    @Test
    public void maxArea() throws Exception {
        assertEquals(1, new Solution011().maxArea(new int[]{1, 1}));
        assertEquals(0, new Solution011().maxArea(new int[]{1, 0}));
        assertEquals(42, new Solution011().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 6}));
    }
}