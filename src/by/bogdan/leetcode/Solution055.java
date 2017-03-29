package by.bogdan.leetcode;

/**
 * Solution for 'Jump Game' algorithmic problem.
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Determine if you are able to reach the last index.
 *
 * @see <a href="https://leetcode.com/problems/jump-game">55. Jump Game (on leetcode.com)</a>
 */
public class Solution055 {
    /**
     * Time complexity is O(n). Space complexity O(1).
     * @param nums an array of non-negative integers
     * @return <code>true</code> if you are able to reach the last index, otherwise <code>false</code>.
     */
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int pos = nums.length - 1;
        int i = nums.length - 1;
        while (i > 0) {
            if (nums[i] >= pos - i) {
                pos = i;
            }
            i--;
        }
        return nums[0] >= pos;
    }
}
