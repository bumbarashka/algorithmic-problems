package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution258Test {
    @Test
    public void addDigits() throws Exception {
        assertEquals(0, new Solution258().addDigits(0));
        assertEquals(2, new Solution258().addDigits(38));
        assertEquals(1, new Solution258().addDigits(Integer.MAX_VALUE));
    }
}