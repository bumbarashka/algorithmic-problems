package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution202Test {
    @Test
    public void isHappy() throws Exception {
        assertFalse(new Solution202().isHappy(0));
        assertTrue(new Solution202().isHappy(1));
        assertTrue(new Solution202().isHappy(19));
        assertFalse(new Solution202().isHappy(20));
    }
}