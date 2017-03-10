package by.bogdan.leetcode;

import java.util.Arrays;

/**
 * Solution for https://leetcode.com/problems/relative-ranks
 */
public class Solution506 {
    public String[] findRelativeRanks(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new String[0];
        }
        Integer[] ranks = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ranks[i] = i;
        }
        Arrays.sort(ranks, (a, b) -> nums[b] - nums[a]);

        String[] result = new String[nums.length];
        result[ranks[0]] = "Gold Medal";
        if (nums.length > 1) {
            result[ranks[1]] = "Silver Medal";
        }
        if (nums.length > 2) {
            result[ranks[2]] = "Bronze Medal";
        }
        if (nums.length > 3) {
            for (int i = 3; i < nums.length; i++) {
                result[ranks[i]] = Integer.toString(i + 1);
            }
        }
        return result;
    }
}
