package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution41Test {
    @Test
    public void firstMissingPositive() throws Exception {
        assertEquals(3, new Solution41().firstMissingPositive(new int[]{1, 2, 0}));
        assertEquals(2, new Solution41().firstMissingPositive(new int[]{3, 4, -1, 1}));
        assertEquals(1, new Solution41().firstMissingPositive(new int[]{6, 6, 6, 6, 2, 2, 2, 2}));
    }
}