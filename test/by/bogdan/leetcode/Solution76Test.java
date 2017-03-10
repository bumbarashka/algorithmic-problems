package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution76Test {
    @Test
    public void minWindow() throws Exception {
        assertEquals("BANC", new Solution76().minWindow("ADOBECODEBANC", "ABC"));
        assertEquals("BANC", new Solution76().minWindow("BANCADOBECODE", "ABC"));
        assertEquals("", new Solution76().minWindow("ADOBECODEBANC", "YWZ"));
        assertEquals("", new Solution76().minWindow("ABC", "ABCD"));
        assertEquals("B", new Solution76().minWindow("ABCBBC", "B"));
        assertEquals("ABC", new Solution76().minWindow("ABABABDDCADDABC", "ABC"));
        assertEquals("", new Solution76().minWindow("", "ABC"));
        assertEquals("", new Solution76().minWindow(null, "ABC"));
        assertEquals("", new Solution76().minWindow("ABABABDDCADDABC", ""));
        assertEquals("", new Solution76().minWindow("ABABABDDCADDABC", null));
        assertEquals("", new Solution76().minWindow("a", "aa"));
    }

}