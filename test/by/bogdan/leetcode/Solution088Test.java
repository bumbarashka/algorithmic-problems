package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution088Test {
    @Test
    public void mergeEmptyArrays() throws Exception {
        int[] nums1 = {};
        new Solution088().merge(nums1, 0, new int[0], 0);
        assertArrayEquals(new int[0], nums1);
    }

    @Test
    public void mergeEmptyArrayToNotEmpty() throws Exception {
        int[] nums1 = {1};
        new Solution088().merge(nums1, 1, new int[0], 0);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void mergeArrayToEmpty() throws Exception {
        int[] nums1 = new int[1];
        new Solution088().merge(nums1, 0, new int[]{3}, 1);
        assertArrayEquals(new int[]{3}, nums1);
    }

    @Test
    public void mergeAllToTail() throws Exception {
        int[] nums1 = {1, 2, 3, 0, 0};
        new Solution088().merge(nums1, 3, new int[]{4, 5}, 2);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, nums1);
    }

    @Test
    public void mergeAllToHead() throws Exception {
        int[] nums1 = {4, 5, 6, 0, 0};
        new Solution088().merge(nums1, 3, new int[]{1, 2}, 2);
        assertArrayEquals(new int[]{1, 2, 4, 5, 6}, nums1);
    }

    @Test
    public void mergeMixedArrays() throws Exception {
        int[] nums1 = {1, 3, 6, 0, 0, 0};
        new Solution088().merge(nums1, 3, new int[]{2, 3, 5}, 3);
        assertArrayEquals(new int[]{1, 2, 3, 3, 5, 6}, nums1);
    }
}