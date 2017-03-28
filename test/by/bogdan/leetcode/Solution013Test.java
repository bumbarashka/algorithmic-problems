package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution013Test {
    @Test
    public void romanToInt() throws Exception {
        assertEquals(0, new Solution013().romanToInt(""));
        assertEquals(0, new Solution013().romanToInt(null));
        assertEquals(1, new Solution013().romanToInt("I"));
        assertEquals(621, new Solution013().romanToInt("DCXXI"));
        assertEquals(449, new Solution013().romanToInt("CDXLIX"));
        assertEquals(1904, new Solution013().romanToInt("MCMIV"));
        assertEquals(1443, new Solution013().romanToInt("CMCDXCXLIXIV"));
        assertEquals(1666, new Solution013().romanToInt("MDCLXVI"));
    }

}