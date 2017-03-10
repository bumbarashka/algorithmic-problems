package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution191Test {
    @Test
    public void hammingWeight() throws Exception {
        assertEquals(3, new Solution191().hammingWeight(11));
    }

    @Test
    public void hammingWeight2() throws Exception {
        assertEquals(3, new Solution191().hammingWeight2(11));
    }

    @Test
    public void hammingWeight3() throws Exception {
        assertEquals(3, new Solution191().hammingWeight3(11));
    }
}