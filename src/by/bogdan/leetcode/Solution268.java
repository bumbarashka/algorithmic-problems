package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/missing-number
 */
public class Solution268 {
    public int missingNumber(int[] nums) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += i + 1 - nums[i];
        }
        return (int) sum;
    }

    public int missingNumber2(int[] nums) {
        int xor = 0, i;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor ^ i;
    }
}
