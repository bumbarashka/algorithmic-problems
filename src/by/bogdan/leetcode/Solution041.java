package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/first-missing-positive
 */
public class Solution041 {
    public int firstMissingPositive(int[] nums) {
        int maxNum = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (0 < nums[i] && nums[i] <= maxNum) {
                while (nums[i] != i + 1 && 0 < nums[i] && nums[i] <= maxNum && nums[nums[i] - 1] != nums[i]) {
                    int num = nums[i];
                    nums[i] = nums[num - 1];
                    nums[num - 1] = num;
                }
            } else {
                maxNum--;
            }
        }
        int i = 0;
        while (i < maxNum && i + 1 == nums[i]) {
            i++;
        }
        return i + 1;
    }
}
