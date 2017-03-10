package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution322Test {
    @Test
    public void coinChange() throws Exception {
        assertEquals(3, new Solution322().coinChange(new int[]{1, 2, 5}, 11));
        assertEquals(-1, new Solution322().coinChange(new int[]{2}, 3));
        assertEquals(-1, new Solution322().coinChange(new int[]{}, 3));
        assertEquals(0, new Solution322().coinChange(new int[]{}, 0));
        assertEquals(-1, new Solution322().coinChange(new int[]{1}, -1));
        assertEquals(20, new Solution322().coinChange(new int[]{186, 419, 83, 408}, 6249));
    }

    @Test
    public void coinChange2() throws Exception {
        assertEquals(3, new Solution322().coinChange2(new int[]{1, 2, 5}, 11));
        assertEquals(-1, new Solution322().coinChange2(new int[]{2}, 3));
        assertEquals(-1, new Solution322().coinChange2(new int[]{}, 3));
        assertEquals(0, new Solution322().coinChange2(new int[]{}, 0));
        assertEquals(-1, new Solution322().coinChange2(new int[]{1}, -1));
        assertEquals(20, new Solution322().coinChange2(new int[]{186, 419, 83, 408}, 6249));
    }
}