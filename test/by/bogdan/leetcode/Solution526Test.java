package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution526Test {
    @Test
    public void countArrangement() throws Exception {
        assertEquals(1, new Solution526().countArrangement(1));
        assertEquals(2, new Solution526().countArrangement(2));
        assertEquals(3, new Solution526().countArrangement(3));
        assertEquals(8, new Solution526().countArrangement(4));
        assertEquals(10, new Solution526().countArrangement(5));
        assertEquals(36, new Solution526().countArrangement(6));
        assertEquals(24679, new Solution526().countArrangement(15));
    }
}