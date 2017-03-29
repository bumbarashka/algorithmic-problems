package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution055Test {
    @Test
    public void canJump() throws Exception {
        assertTrue(new Solution055().canJump(new int[]{2, 3, 1, 1, 4}));
        assertTrue(new Solution055().canJump(new int[]{0}));
        assertFalse(new Solution055().canJump(new int[]{0, 1}));
        assertFalse(new Solution055().canJump(new int[]{3, 2, 1, 0, 4}));
        assertFalse(new Solution055().canJump(null));
    }

}