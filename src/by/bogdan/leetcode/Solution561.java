package by.bogdan.leetcode;

import java.util.Arrays;

/**
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer,
 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 * Notes:
 * <ul>
 * <li>n is a positive integer, which is in the range of [1, 10000].</li>
 * <li>All the integers in the array will be in the range of [-10000, 10000].</li>
 * </ul>
 *
 * @see <a href="https://leetcode.com/problems/array-partition-i">561. Array Partition I  (on leetcode.com)</a>
 */
public class Solution561 {
    /**
     * Time complexity is O(n*log(n)). Memory usage is O(1)
     *
     * @param nums an array of 2n integers
     * @return sum of min values as large as possible
     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0, max = nums.length / 2; i < max; i++) {
            sum += nums[i * 2];
        }
        return sum;
    }
}
