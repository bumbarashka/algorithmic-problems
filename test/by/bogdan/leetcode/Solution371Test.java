package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;


public class Solution371Test {
    @Test
    public void getSum() throws Exception {
        assertEquals(3, new Solution371().getSum(1, 2));
        assertEquals(65434 + 12345, new Solution371().getSum(65434, 12345));
        assertEquals(-65434 - 12345, new Solution371().getSum(-65434, -12345));
    }

    @Test
    public void getSumRecursive() throws Exception {
        assertEquals(3, new Solution371().getSumRecursive(1, 2));
        assertEquals(65434 + 12345, new Solution371().getSumRecursive(65434, 12345));
        assertEquals(-65434 - 12345, new Solution371().getSumRecursive(-65434, -12345));
    }
}