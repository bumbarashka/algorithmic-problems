package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution540Test {
    @Test
    public void singleNonDuplicate() throws Exception {
        assertEquals(9, new Solution540().singleNonDuplicate(new int[]{1, 1, 2, 2, 4, 4, 5, 5, 9}));
        assertEquals(2, new Solution540().singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
        assertEquals(10, new Solution540().singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));
        assertEquals(3, new Solution540().singleNonDuplicate(new int[]{3}));
        assertEquals(3, new Solution540().singleNonDuplicate(new int[]{3, 5, 5}));
    }

    @Test
    public void singleNonDuplicate2() throws Exception {
        assertEquals(9, new Solution540().singleNonDuplicate2(new int[]{1, 1, 2, 2, 4, 4, 5, 5, 9}));
        assertEquals(2, new Solution540().singleNonDuplicate2(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
        assertEquals(10, new Solution540().singleNonDuplicate2(new int[]{3, 3, 7, 7, 10, 11, 11}));
        assertEquals(3, new Solution540().singleNonDuplicate2(new int[]{3}));
        assertEquals(3, new Solution540().singleNonDuplicate2(new int[]{3, 5, 5}));
    }

}