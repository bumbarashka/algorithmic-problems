package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution042Test {
    @Test
    public void trap() throws Exception {
        assertEquals(6, new Solution042().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        assertEquals(0, new Solution042().trap(new int[]{}));
        assertEquals(0, new Solution042().trap(new int[]{1}));
        assertEquals(0, new Solution042().trap(new int[]{1, 1}));
        assertEquals(2, new Solution042().trap(new int[]{1, 0, 2, 1, 2}));
    }

}