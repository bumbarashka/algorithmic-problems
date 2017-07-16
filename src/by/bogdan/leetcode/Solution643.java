package by.bogdan.leetcode;

/**
 *  Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value.
 *  And you need to output the maximum average value.
 *  Note:
 *  <ul>
 *      <li>1 <= k <= n <= 30,000.</li>
 *      <li>Elements of the given array will be in the range [-10,000, 10,000]</li>
 *  </ul>
 *  @see <a href="https://leetcode.com/problems/maximum-average-subarray-i">643. Maximum Average Subarray I (on leetcode.com)</a>
 */
public class Solution643 {
    /**
     * Time complexity is O(n)
     * @param nums an array consisting of n integers
     * @param k given length of subarray
     * @return the maximum average value of the contiguous subarray of given length k
     */
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;
        while (right < k) {
            sum += nums[right];
            right++;
        }

        int maxSum = sum;

        while (right < nums.length) {
            sum -= nums[left];
            left++;
            sum += nums[right];
            if (maxSum < sum) {
                maxSum = sum;
            }
            right++;
        }

        return (double) maxSum / k;
    }
}
