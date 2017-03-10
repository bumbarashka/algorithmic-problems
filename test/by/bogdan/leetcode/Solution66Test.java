package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution66Test {
    @Test
    public void plusOne() throws Exception {
        assertArrayEquals(new int[]{1, 0, 0, 0}, new Solution66().plusOne(new int[]{9, 9, 9}));
        assertArrayEquals(new int[]{1, 0}, new Solution66().plusOne(new int[]{9}));
        assertArrayEquals(new int[]{2}, new Solution66().plusOne(new int[]{1}));
        assertArrayEquals(new int[]{3, 4, 6, 0}, new Solution66().plusOne(new int[]{3, 4, 5, 9}));
    }

}