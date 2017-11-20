package by.bogdan.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an array of distinct numbers, return all possible permutations.
 * <p>
 * For example,
 * [1,2,3] have the following permutations:
 * <p>
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 *
 * * @see <a href="https://leetcode.com/problems/permutations/description/">46. Permutations (on leetcode.com)</a>
 */
public class Solution046 {
    /**
     * Recursive solution.
     * Time complexity is O(). Space complexity O().
     * @param nums array of distinct numbers
     * @return all possible permutations
     */
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }
        boolean[] usedNums = new boolean[nums.length];
        return permuteRecursive(new ArrayList<>(), nums, usedNums);
    }

    public List<List<Integer>> permuteRecursive(List<Integer> base, int[] nums, boolean[] usedNums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean stopRecursion = true;
        for (int i = 0; i < nums.length; i++) {
            if (!usedNums[i]) {
                stopRecursion = false;
                List<Integer> newBase = new ArrayList<>(base);
                newBase.add(nums[i]);
                usedNums[i] = true;
                result.addAll(permuteRecursive(newBase, nums, usedNums));
                usedNums[i] = false;
            }
        }
        if (stopRecursion) {
            return Collections.singletonList(base);
        }
        return result;
    }
}
