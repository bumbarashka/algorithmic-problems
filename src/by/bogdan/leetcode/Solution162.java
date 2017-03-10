package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/find-peak-element/
 */
public class Solution162 {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int hi = nums.length - 1;
        while (low < hi) {
            int mid = low + (hi - low) / 2;
            if (mid != 0 && nums[mid - 1] > nums[mid]) {
                hi = mid - 1;
            } else if (mid != nums.length - 1 && nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return low;
    }
}
