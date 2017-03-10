package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution476Test {
    @Test
    public void findComplement() throws Exception {
        assertEquals(2, new Solution476().findComplement(5));
        assertEquals(0, new Solution476().findComplement(1));
        assertEquals(0, new Solution476().findComplement(0));
    }

    @Test
    public void findComplementOneLine() throws Exception {
        assertEquals(2, new Solution476().findComplementOneLine(5));
        assertEquals(0, new Solution476().findComplementOneLine(1));
        assertEquals(0, new Solution476().findComplementOneLine(0));
    }
}