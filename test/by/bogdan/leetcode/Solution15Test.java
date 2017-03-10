package by.bogdan.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution15Test {
    @Test
    public void threeSum() throws Exception {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = new Solution15().threeSum(nums);
        assertEquals(2, result.size());
        assertEquals(3, result.get(0).size());
        assertEquals(3, result.get(1).size());

        assertTrue(result.get(0).contains(-1));
        assertTrue(result.get(0).contains(2));

        assertTrue(result.get(1).contains(-1));
        assertTrue(result.get(1).contains(0));
        assertTrue(result.get(1).contains(1));

        nums = new int[]{0, 0, 0};
        result = new Solution15().threeSum(nums);
        assertEquals(1, result.size());
        assertEquals(3, result.get(0).size());
        assertEquals(Integer.valueOf(0), result.get(0).get(0));
        assertEquals(Integer.valueOf(0), result.get(0).get(1));
        assertEquals(Integer.valueOf(0), result.get(0).get(2));
    }
}