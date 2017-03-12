package by.bogdan.leetcode;

/**
 * Solution for 'Single Element in a Sorted Array ' algorithmic problem.
 * Given a sorted array consisting of only integers where every element appears twice except for one element which appears once. Find this single element that appears only once.
 * Note: Your solution should run in O(log n) time and O(1) space.
 *
 * @see <a href="https://leetcode.com/problems/single-element-in-a-sorted-array">540. Single Element in a Sorted Array (on leetcode.com)</a>
 */
public class Solution540 {
    /**
     * O(log n) time and O(1) space.
     *
     * @param nums a sorted array consisting of only integers where every element appears twice except for one element which appears once
     * @return single element
     */
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int hi = nums.length;
        while (low < hi) {
            int mid = low + (hi - low) / 2;
            if (mid > 0 && nums[mid] == nums[mid - 1]) {
                if (mid % 2 == 0) {
                    hi = mid - 2;
                } else {
                    low = mid + 1;
                }
            } else if (mid < nums.length - 1 && nums[mid] == nums[mid + 1]) {
                if ((mid + 1) % 2 == 0) {
                    hi = mid - 1;
                } else {
                    low = mid + 2;
                }
            } else {
                return nums[mid];
            }
        }
        return nums[low];
    }

    /**
     * O(log n) time and O(1) space.
     *
     * @param nums a sorted array consisting of only integers where every element appears twice except for one element which appears once
     * @return single element
     */
    public int singleNonDuplicate2(int[] nums) {
        // hi and low here are pair of indexes
        int low = 0;
        int hi = nums.length / 2;
        while (low < hi) {
            int mid = low + (hi - low) / 2;
            if (nums[mid * 2] != nums[mid * 2 + 1]) {
                hi = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[low * 2];
    }
}
