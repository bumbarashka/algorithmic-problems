package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution029Test {
    @Test
    public void divide() throws Exception {
        assertEquals(Integer.MIN_VALUE, new Solution029().divide(Integer.MIN_VALUE, 1));
        assertEquals(Integer.MAX_VALUE, new Solution029().divide(Integer.MIN_VALUE, -1));
        assertEquals(Integer.MIN_VALUE / 2, new Solution029().divide(Integer.MIN_VALUE, 2));
        assertEquals(1, new Solution029().divide(Integer.MIN_VALUE, Integer.MIN_VALUE));
        assertEquals(0, new Solution029().divide(1, Integer.MIN_VALUE));
        assertEquals(0, new Solution029().divide(-1, Integer.MIN_VALUE));

        assertEquals(Integer.MAX_VALUE, new Solution029().divide(Integer.MAX_VALUE, 1));
        assertEquals(Integer.MAX_VALUE / 2, new Solution029().divide(Integer.MAX_VALUE, 2));
        assertEquals(-Integer.MAX_VALUE, new Solution029().divide(Integer.MAX_VALUE, -1));
        assertEquals(1, new Solution029().divide(Integer.MAX_VALUE, Integer.MAX_VALUE));
        assertEquals(0, new Solution029().divide(1, Integer.MAX_VALUE));
        assertEquals(0, new Solution029().divide(-1, Integer.MAX_VALUE));

        assertEquals(3, new Solution029().divide(55, 17));
        assertEquals(-3, new Solution029().divide(-55, 17));
        assertEquals(3, new Solution029().divide(-55, -17));
        assertEquals(-3, new Solution029().divide(55, -17));
    }
}