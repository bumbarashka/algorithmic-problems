package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution006Test {
    @Test
    public void convert() throws Exception {
        assertEquals("a", new Solution006().convert("a", 1));
        assertEquals("PAHNAPLSIIGYIR", new Solution006().convert("PAYPALISHIRING", 3));
    }
}