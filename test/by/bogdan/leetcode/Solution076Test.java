package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution076Test {
    @Test
    public void minWindow() throws Exception {
        assertEquals("BANC", new Solution076().minWindow("ADOBECODEBANC", "ABC"));
        assertEquals("BANC", new Solution076().minWindow("BANCADOBECODE", "ABC"));
        assertEquals("", new Solution076().minWindow("ADOBECODEBANC", "YWZ"));
        assertEquals("", new Solution076().minWindow("ABC", "ABCD"));
        assertEquals("B", new Solution076().minWindow("ABCBBC", "B"));
        assertEquals("ABC", new Solution076().minWindow("ABABABDDCADDABC", "ABC"));
        assertEquals("", new Solution076().minWindow("", "ABC"));
        assertEquals("", new Solution076().minWindow(null, "ABC"));
        assertEquals("", new Solution076().minWindow("ABABABDDCADDABC", ""));
        assertEquals("", new Solution076().minWindow("ABABABDDCADDABC", null));
        assertEquals("", new Solution076().minWindow("a", "aa"));
    }

}