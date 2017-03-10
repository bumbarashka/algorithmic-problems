package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;


public class Solution502Test {
    @Test
    public void findMaximizedCapital() throws Exception {
        assertEquals(4, new Solution502().findMaximizedCapital(2, 0, new int[]{1, 2, 3}, new int[]{0, 1, 1}));
    }
}