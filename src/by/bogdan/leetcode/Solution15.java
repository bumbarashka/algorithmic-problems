package by.bogdan.leetcode;

import java.util.*;

/**
 * Solution for https://leetcode.com/problems/3sum
 */
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return list;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i == 0 || nums[i] != nums[i - 1]) {
                int low = i + 1;
                int hi = nums.length - 1;
                while (low < hi) {
                    int sum = nums[i] + nums[low] + nums[hi];
                    if (sum == 0) {
                        List<Integer> tripleList = new ArrayList<Integer>();
                        tripleList.add(nums[i]);
                        tripleList.add(nums[low]);
                        tripleList.add(nums[hi]);
                        list.add(tripleList);
                        while (++low < hi && nums[low] == nums[low - 1]) ;
                        while (low < --hi && nums[hi] == nums[hi + 1]) ;
                    } else if (sum < 0) {
                        low++;
                    } else if (sum > 0) {
                        hi--;
                    }
                }
            }
        }
        return list;
    }
}
