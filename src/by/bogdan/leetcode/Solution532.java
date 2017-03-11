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
}
