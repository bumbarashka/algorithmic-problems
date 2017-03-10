package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution504Test {
    @Test
    public void convertToBase7() throws Exception {
        assertEquals("202", new Solution504().convertToBase7(100));
        assertEquals("-10", new Solution504().convertToBase7(-7));
    }

    @Test
    public void convertToBase7Simple() throws Exception {
        assertEquals("202", new Solution504().convertToBase7Simple(100));
        assertEquals("-10", new Solution504().convertToBase7Simple(-7));
    }
}