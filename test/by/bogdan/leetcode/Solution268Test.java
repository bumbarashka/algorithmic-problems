package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution268Test {
    @Test
    public void missingNumber() throws Exception {
        assertEquals(2, new Solution268().missingNumber(new int[]{0, 1, 3}));
    }

    @Test
    public void missingNumber2() throws Exception {
        assertEquals(2, new Solution268().missingNumber2(new int[]{0, 1, 3}));
        assertEquals(2, new Solution268().missingNumber2(new int[]{3, 0, 1}));
        assertEquals(4, new Solution268().missingNumber2(new int[]{3, 0, 1, 2}));
    }
}