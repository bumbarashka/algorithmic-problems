package by.bogdan.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *  Given a list of positive integers, the adjacent integers will perform the float division. For example, [2,3,4] -> 2 / 3 / 4.
 *  However, you can add any number of parenthesis at any position to change the priority of operations.
 *  You should find out how to add parenthesis to get the maximum result, and return the corresponding expression in string format.
 *  Your expression should NOT contain redundant parenthesis.
 *  Note:
 *  <ul>
 *      <li>The length of the input array is [1, 10].</li>
 *      <li>Elements in the given array will be in range [2, 1000].</li>
 *      <li>There is only one optimal division for each test case.</li>
 *  </ul>
 *
 *  @see <a href="https://leetcode.com/problems/optimal-division">553. Optimal Division (on leetcode.com)</a>
 */
public class Solution553 {
    /**
     * Time complexity O(n). Space complexity is O(n)
     * @param nums arrays of ints
     * @return expression with maximum result
     */
    public String optimalDivision(int[] nums) {
        StringBuilder result = new StringBuilder();
        result.append(nums[0]);
        if (nums.length > 1) {
            result.append('/');
            if (nums.length > 2) {
                result.append('(');
            }
            result.append(nums[1]);
            for (int i = 2, max = nums.length; i < max; i++) {
                result.append('/').append(nums[i]);
            }
            if (nums.length > 2) {
                result.append(')');
            }
        }
        return result.toString();
    }
}
