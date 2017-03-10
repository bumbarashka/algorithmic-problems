package by.bogdan.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Solution496Test {
    @Test
    public void testNextGreaterElement() {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        assertArrayEquals(new int[]{-1, 3, -1}, new Solution496().nextGreaterElement(nums1, nums2));
    }

    @Test
    public void testNextGreaterElement2() {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        assertArrayEquals(new int[]{3, -1}, new Solution496().nextGreaterElement(nums1, nums2));
    }
}
