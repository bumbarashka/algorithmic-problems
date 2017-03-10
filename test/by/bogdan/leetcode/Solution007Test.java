package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution007Test {
    @Test
    public void reverse() throws Exception {
        assertEquals(321, new Solution007().reverse(123));
        assertEquals(4321, new Solution007().reverse(1234));
        assertEquals(-123, new Solution007().reverse(-321));
        assertEquals(-1234, new Solution007().reverse(-4321));
        assertEquals(0, new Solution007().reverse(Integer.MAX_VALUE));
    }
}