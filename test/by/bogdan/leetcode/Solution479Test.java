package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution479Test {
    @Test
    public void largestPalindrome() throws Exception {
        assertEquals(987, new Solution479().largestPalindrome(2));
        assertEquals(677, new Solution479().largestPalindrome(5));
    }
}