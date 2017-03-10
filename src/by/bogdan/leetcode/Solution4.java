package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] shorter;
        int[] longer;
        if (nums1.length < nums2.length) {
            shorter = nums1;
            longer = nums2;
        } else {
            shorter = nums2;
            longer = nums1;
        }
        int shorterLength = shorter.length;
        int longerLength = longer.length;
        if (longerLength == 0) {
            return 0;
        }

        int length = shorterLength + longerLength;
        int halfLength = length / 2;

        int left = 0;
        int right = shorterLength;

        while (left <= right) {
            int i = (right + left) / 2;
            int j = halfLength - i;
            if (i < shorterLength && longer[j - 1] > shorter[i]) {
                left = i + 1;
            } else if (i > 0 && longer[j] < shorter[i - 1]) {
                right = i - 1;
            } else {
                int minRight;
                if (i == shorterLength) {
                    minRight = longer[j];
                } else if (j == longerLength) {
                    minRight = shorter[i];
                } else {
                    minRight = Math.min(shorter[i], longer[j]);
                }
                if (length % 2 == 1) {
                    return minRight;
                }
                int maxLeft;
                if (i == 0) {
                    maxLeft = longer[j - 1];
                } else if (j == 0) {
                    maxLeft = shorter[i - 1];
                } else {
                    maxLeft = Math.max(shorter[i - 1], longer[j - 1]);
                }
                return (maxLeft + minRight) / 2.0;
            }

        }
        return 0.0;
    }
}

