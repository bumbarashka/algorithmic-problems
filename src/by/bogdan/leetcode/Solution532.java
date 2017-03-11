package by.bogdan.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution for 'K-diff Pairs in an Array' algorithmic problem.
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array.
 * Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute
 * difference is k.
 *
 * @see <a href="https://leetcode.com/problems/k-diff-pairs-in-an-array">532. K-diff Pairs in an Array (on leetcode.com)</a>
 */
public class Solution532 {
    /**
     * Efficiency is O(n). Memory usage is O(n).
     *
     * @param nums array of integers
     * @param k    an integer k
     * @return the number of unique k-diff pairs in the array
     */
    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        Map<Integer, boolean[]> previous = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (previous.containsKey(nums[i] - k) && previous.get(nums[i] - k)[1]) {
                count++;
                previous.get(nums[i] - k)[1] = false;
                if (!previous.containsKey(nums[i])) {
                    previous.put(nums[i], new boolean[]{false, true});
                } else {
                    previous.get(nums[i])[0] = false;
                }
            }
            if (previous.containsKey(nums[i] + k) && previous.get(nums[i] + k)[0]) {
                count++;
                previous.get(nums[i] + k)[0] = false;
                if (!previous.containsKey(nums[i])) {
                    previous.put(nums[i], new boolean[]{true, false});
                } else {
                    previous.get(nums[i])[1] = false;
                }
            }
            if (!previous.containsKey(nums[i])) {
                previous.put(nums[i], new boolean[]{true, true});
            }
        }
        return count;
    }

    /**
     * Efficiency is O(n). Memory usage is O(n).
     *
     * @param nums array of integers
     * @param k    an integer k
     * @return the number of unique k-diff pairs in the array
     */
    public int findPairs2(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }
        int count = 0;
        Map<Integer, Integer> numsToCount = new HashMap<>();
        for(int i: nums) {
            numsToCount.put(i, numsToCount.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer,Integer> entry: numsToCount.entrySet()) {
            if (k == 0) {
                // zero target can only be if some value is repeated at least once
                if(entry.getValue() > 1) {
                    count++;
                }
            } else {
                // It checks only <code>entry.getKey() + k</code> because <code>entry.getKey() - k</code> map's key will
                // be checked within another iteration if it exists
                if(numsToCount.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}
