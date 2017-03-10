package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;


public class Solution461Test {
    @Test
    public void hammingDistance() throws Exception {
        assertEquals(2, new Solution461().hammingDistance(1, 4));
        assertEquals(3, new Solution461().hammingDistance(1, 15));
    }
}