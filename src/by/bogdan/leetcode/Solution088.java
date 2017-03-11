package by.bogdan.leetcode;

/**
 * Solution for 'Merge Sorted Array' algorithmic problem.
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * @see <a href="https://leetcode.com/problems/merge-sorted-array">88. Merge Sorted Array on leetcode.com</a>
 */
public class Solution088 {
    /**
     * Efficiensy O(n + m). Memory usage is O(1).
     * @param nums1 sorted integer array. It must contains space for all elements from <code>nums2</code> parameter
     * @param m number of elements in nums1 without space for nums2 elements, so <code>nums1.length >= m + n</code>.
     * @param nums2 sorted integer array.
     * @param n number of elements in nums2 array.
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        --m;
        --n;
        while(n >= 0) {
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[m + n + 1] = nums1[m];
                --m;
            } else {
                nums1[m + n + 1] = nums2[n];
                --n;
            }
        }
    }
}
