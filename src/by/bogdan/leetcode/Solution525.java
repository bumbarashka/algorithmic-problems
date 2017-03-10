package by.bogdan.leetcode;

import java.util.HashMap;

/**
 * Solution for https://leetcode.com/problems/contiguous-array
 */
public class Solution525 {
    public int findMaxLength(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int max = 0;
        HashMap<Integer, Integer> counters = new HashMap<>();
        counters.put(0, -1);
        int counter = 0;
        for (int end = 0; end < nums.length; end++) {
            counter += nums[end] == 1 ? 1 : -1;
            if (counters.containsKey(counter)) {
                int start = counters.get(counter);
                if (end - start > max) {
                    max = end - start;
                }
            } else {
                counters.put(counter, end);
            }
        }
        return max;
    }
}
