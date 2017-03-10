package by.bogdan.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution for https://leetcode.com/problems/continuous-subarray-sum
 */
public class Solution523 {
    // O(n^2) time, O(1) space
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if ((k == 0 && sum == 0) || (k != 0 && sum % k == 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    // O(n) time, O(k) space
    public boolean checkSubarraySum2(int[] nums, int k) {
        Map<Integer, Integer> indexByMod = new HashMap<>();
        indexByMod.put(0, -1); // ???
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) {
                sum %= k;
            }
            Integer index = indexByMod.get(sum);
            if (index == null) {
                indexByMod.put(sum, i);
            } else if (i - index > 1) {
                return true;
            }
        }
        return false;
    }
}
