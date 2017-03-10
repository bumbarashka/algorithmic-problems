package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution7Test {
    @Test
    public void reverse() throws Exception {
        assertEquals(321, new Solution7().reverse(123));
        assertEquals(4321, new Solution7().reverse(1234));
        assertEquals(-123, new Solution7().reverse(-321));
        assertEquals(-1234, new Solution7().reverse(-4321));
        assertEquals(0, new Solution7().reverse(Integer.MAX_VALUE));
    }
}