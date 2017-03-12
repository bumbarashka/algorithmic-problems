package by.bogdan.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Solution539Test {
    @Test
    public void findMinDifference() throws Exception {
        assertEquals(1, new Solution539().findMinDifference(Arrays.asList("23:59", "00:00")));
        assertEquals(0, new Solution539().findMinDifference(Arrays.asList("00:00", "23:59", "00:00")));
        assertEquals(147, new Solution539().findMinDifference(Arrays.asList("05:31", "22:08", "00:35")));
    }

    @Test
    public void findMinDifference2() throws Exception {
        assertEquals(1, new Solution539().findMinDifference2(Arrays.asList("23:59", "00:00")));
        assertEquals(0, new Solution539().findMinDifference2(Arrays.asList("00:00", "23:59", "00:00")));
        assertEquals(147, new Solution539().findMinDifference2(Arrays.asList("05:31", "22:08", "00:35")));
    }
}