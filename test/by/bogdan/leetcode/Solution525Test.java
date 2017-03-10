package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution525Test {
    @Test
    public void findMaxLength() throws Exception {
        assertEquals(2, new Solution525().findMaxLength(new int[]{0, 1, 0}));
        assertEquals(2, new Solution525().findMaxLength(new int[]{0, 1}));
        assertEquals(4, new Solution525().findMaxLength(new int[]{0, 1, 0, 0, 1, 0, 0, 1, 0, 0}));
        assertEquals(14, new Solution525().findMaxLength(new int[]{0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1}));
        assertEquals(0, new Solution525().findMaxLength(new int[0]));
        assertEquals(0, new Solution525().findMaxLength(new int[]{1}));
        assertEquals(0, new Solution525().findMaxLength(null));
    }
}