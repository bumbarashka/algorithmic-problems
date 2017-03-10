package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution338Test {
    @Test
    public void countBits() throws Exception {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, new Solution338().countBits(5));
    }
}