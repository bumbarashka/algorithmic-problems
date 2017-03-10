package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution001Test {
    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int[] result = new Solution001().twoSum(nums, 9);
        assertEquals(result[0], 0);
        assertEquals(result[1], 1);
    }

    @Test
    public void testTwoSumFaster() {
        int[] nums = {2, 7, 11, 15};
        int[] result = new Solution001().twoSumFaster(nums, 9);
        assertEquals(result[0], 0);
        assertEquals(result[1], 1);

        nums = new int[]{3, 2, 4};
        result = new Solution001().twoSumFaster(nums, 6);
        assertEquals(result[0], 1);
        assertEquals(result[1], 2);
    }
}
