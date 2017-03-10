package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/single-number
 */
public class Solution136 {
    public int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[0] = nums[0] ^ nums[i];
        }
        return nums[0];
    }
}
