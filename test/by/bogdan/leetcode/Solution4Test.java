package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution4Test {
    @Test
    public void testFindMedianSortedArrays() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        assertEquals(new Solution4().findMedianSortedArrays(nums1, nums2), 2.0, 0);

        nums1 = new int[]{1, 2};
        nums2 = new int[]{3, 4};
        assertEquals(new Solution4().findMedianSortedArrays(nums1, nums2), 2.5, 0);

        nums1 = new int[]{1, 2, 5, 6, 7, 8, 9, 10};
        nums2 = new int[]{3, 4};
        assertEquals(new Solution4().findMedianSortedArrays(nums1, nums2), 5.5, 0);

        nums1 = new int[]{1, 2};
        nums2 = new int[]{3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(new Solution4().findMedianSortedArrays(nums1, nums2), 5.5, 0);

        nums1 = new int[]{1, 2};
        nums2 = new int[]{};
        assertEquals(new Solution4().findMedianSortedArrays(nums1, nums2), 1.5, 0);

        nums1 = new int[]{1};
        nums2 = new int[]{};
        assertEquals(new Solution4().findMedianSortedArrays(nums1, nums2), 1.0, 0);

        nums1 = new int[]{};
        nums2 = new int[]{};
        assertEquals(new Solution4().findMedianSortedArrays(nums1, nums2), 0.0, 0);
    }
}
