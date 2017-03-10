package by.bogdan.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution for 'Two Sum' algorithmic problem.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * @see <a href="https://leetcode.com/problems/two-sum">1. Two Sum (on leetcode.com)</a>
 */
public class Solution1 {
    /**
     * Brute force solution
     * O(n^2) time and O(1) memory usage.
     * @param nums
     *          array of integers
     * @param target
     *          target value for sum of two integer
     * @return indices of the two numbers such that they add up to a specific target
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    i = nums.length;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Faster solution using {@link HashMap} to keep and check numbers have been already processed.
     * O(n) time and O(n) memory usage.
     * @param nums
     *          array of integers
     * @param target
     *          target value for sum of two integer
     * @return indices of the two numbers such that they add up to a specific target
     */
    public int[] twoSumFaster(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> numsToIndexes = new HashMap<>(nums.length);
        numsToIndexes.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (numsToIndexes.containsKey(target - nums[i])) {
                result[0] = numsToIndexes.get(target - nums[i]);
                result[1] = i;
                break;
            }
            numsToIndexes.put(nums[i], i);
        }
        return result;
    }
}
