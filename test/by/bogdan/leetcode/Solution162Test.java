package by.bogdan.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.*;

public class Solution162Test {
    @Test
    public void findPeakElement() throws Exception {
        assertEquals(2, new Solution162().findPeakElement(new int[]{1, 2, 3, 1}));
        assertEquals(0, new Solution162().findPeakElement(new int[]{1}));
        assertEquals(0, new Solution162().findPeakElement(new int[]{5, 1}));
        assertEquals(1, new Solution162().findPeakElement(new int[]{1, 5}));
        assertThat(new Solution162().findPeakElement(new int[]{1, 2, 3, 1, 2, 4, 1, 3, 1}), anyOf(is(2), is(5)));
    }
}