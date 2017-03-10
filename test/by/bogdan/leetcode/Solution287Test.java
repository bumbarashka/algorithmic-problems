package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution287Test {
    @Test
    public void findDuplicate() throws Exception {
        assertEquals(1, new Solution287().findDuplicate(new int[]{1, 1}));
        assertEquals(3, new Solution287().findDuplicate(new int[]{1, 2, 3, 3, 4}));
        assertEquals(3, new Solution287().findDuplicate(new int[]{1, 2, 3, 3, 4, 5}));
        assertEquals(3, new Solution287().findDuplicate(new int[]{3, 3, 3, 3, 3}));
        assertEquals(5, new Solution287().findDuplicate(new int[]{2, 3, 1, 7, 4, 5, 5, 6}));
    }

    @Test
    public void findDuplicate2() throws Exception {
        assertEquals(1, new Solution287().findDuplicate2(new int[]{1, 1}));
        assertEquals(3, new Solution287().findDuplicate2(new int[]{1, 2, 3, 3, 4}));
        assertEquals(3, new Solution287().findDuplicate2(new int[]{1, 2, 3, 3, 4, 5}));
        assertEquals(3, new Solution287().findDuplicate2(new int[]{3, 3, 3, 3, 3}));
        assertEquals(5, new Solution287().findDuplicate2(new int[]{2, 3, 1, 7, 4, 5, 5, 6}));
    }
}