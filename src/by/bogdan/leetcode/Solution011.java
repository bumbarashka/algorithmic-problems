package by.bogdan.leetcode;

/**
 * Solution for 'Container With Most Water ' algorithmic problem.
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * <p>
 * Note: You may not slant the container and n is at least 2.
 * <p>
 * Subscribe to see which companies asked this question.
 *
 * @see <a href="https://leetcode.com/problems/container-with-most-water">11. Container With Most Water (on leetcode.com)</a>
 */
public class Solution011 {
    /**
     * Time complexity is O(n). Space complexity is O(1)
     * @param height n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0)
     * @return max area formed by two lines and x-axis
     */
    public int maxArea(int[] height) {
        int maxArea = 0;
        int low = 0;
        int hi = height.length - 1;
        while (low < hi) {
            maxArea = Math.max(maxArea, Math.min(height[low], height[hi]) * (hi - low));
            if (height[low] < height[hi]) {
                low++;
            } else {
                hi--;
            }
        }
        return maxArea;
    }
}
