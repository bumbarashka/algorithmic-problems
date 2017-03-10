package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution518Test {
    @Test
    public void change() throws Exception {
        assertEquals(1, new Solution518().change(0, new int[0]));
        assertEquals(0, new Solution518().change(1, new int[0]));
        assertEquals(4, new Solution518().change(5, new int[]{1, 2, 5}));
        assertEquals(35502874, new Solution518().change(500, new int[]{3, 5, 7, 8, 9, 10, 11}));
        assertEquals(1952879228, new Solution518().change(1000, new int[]{3, 5, 7, 8, 9, 10, 11}));
    }
}