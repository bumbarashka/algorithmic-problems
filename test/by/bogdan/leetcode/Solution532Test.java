package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution532Test {
    @Test
    public void findPairs() throws Exception {
        assertEquals(2, new Solution532().findPairs(new int[]{3, 1, 4, 1, 5}, 2));
        assertEquals(4, new Solution532().findPairs(new int[]{1, 2, 3, 4, 5}, 1));
        assertEquals(1, new Solution532().findPairs(new int[]{1, 3, 1, 5, 4}, 0));
        assertEquals(0, new Solution532().findPairs(new int[]{1, 3, 1, 5, 4}, -1));
        assertEquals(1, new Solution532().findPairs(new int[]{1, 1, 1, 2, 1}, 1));
    }

    @Test
    public void findPairs2() throws Exception {
        assertEquals(2, new Solution532().findPairs2(new int[]{3, 1, 4, 1, 5}, 2));
        assertEquals(4, new Solution532().findPairs2(new int[]{1, 2, 3, 4, 5}, 1));
        assertEquals(1, new Solution532().findPairs2(new int[]{1, 3, 1, 5, 4}, 0));
        assertEquals(0, new Solution532().findPairs2(new int[]{1, 3, 1, 5, 4}, -1));
        assertEquals(1, new Solution532().findPairs2(new int[]{1, 1, 1, 2, 1}, 1));
    }
}