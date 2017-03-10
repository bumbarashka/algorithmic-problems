package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution506Test {
    @Test
    public void findRelativeRanks() throws Exception {
        int[] nums = {5, 4, 3, 2, 1};
        assertArrayEquals(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"},
                new Solution506().findRelativeRanks(nums));

        nums = new int[]{1};
        assertArrayEquals(new String[]{"Gold Medal"},
                new Solution506().findRelativeRanks(nums));

        nums = new int[]{5, 6, 3, 8, 1};
        assertArrayEquals(new String[]{"Bronze Medal", "Silver Medal", "4", "Gold Medal", "5"},
                new Solution506().findRelativeRanks(nums));
    }
}