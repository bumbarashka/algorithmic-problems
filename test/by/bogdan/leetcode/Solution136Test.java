package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution136Test {
    @Test
    public void singleNumber() throws Exception {
        assertEquals(17, new Solution136().singleNumber(new int[]{1, 3, 5, 17, 3, 5, 1, 6, 6, 8, 8, 123456, 123456}));
    }
}