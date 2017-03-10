package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution520Test {
    @Test
    public void detectCapitalUse() throws Exception {
        assertEquals(true, new Solution520().detectCapitalUse("USA"));
        assertEquals(true, new Solution520().detectCapitalUse("Alex"));
        assertEquals(true, new Solution520().detectCapitalUse("discover"));
        assertEquals(false, new Solution520().detectCapitalUse("USa"));
        assertEquals(false, new Solution520().detectCapitalUse("appLe"));
        assertEquals(false, new Solution520().detectCapitalUse("aPPLE"));
        assertEquals(true, new Solution520().detectCapitalUse("U"));
        assertEquals(true, new Solution520().detectCapitalUse(""));
        assertEquals(true, new Solution520().detectCapitalUse("u"));
    }
}