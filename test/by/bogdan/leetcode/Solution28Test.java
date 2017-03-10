package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution28Test {
    @Test
    public void strStr() throws Exception {
        assertEquals(4, new Solution28().strStr("mississippi", "issip"));
        assertEquals(-1, new Solution28().strStr("mississippi", "issipa"));
        assertEquals(0, new Solution28().strStr("", ""));
    }
}