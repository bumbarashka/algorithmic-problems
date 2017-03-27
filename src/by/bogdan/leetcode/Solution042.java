package by.bogdan.leetcode;

/**
 * Solution for 'Trapping Rain Water' algorithmic problem.
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 *
 * @see <a href="https://leetcode.com/problems/trapping-rain-water">42. Trapping Rain Water (on leetcode.com)</a>
 */
public class Solution042 {
    /**
     * Time is O(n). Space is O(1)
     * @param height non-negative integers representing an elevation map
     * @return how much water it is able to trap after raining
     */
    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }
        int volume = 0;
        int leftIndex = 0;
        int rightIndex = height.length - 1;

        int leftHeight = height[0];
        int rightHeight = height[height.length - 1];

        while (leftIndex + 1 < rightIndex) {
            if (leftHeight <= rightHeight) {
                leftIndex++;
                int rowVolume = leftHeight - height[leftIndex];
                if (rowVolume > 0) {
                    volume += rowVolume;
                } else {
                    leftHeight = height[leftIndex];
                }
            } else {
                rightIndex--;
                int rowVolume = rightHeight - height[rightIndex];
                if (rowVolume > 0) {
                    volume += rowVolume;
                } else {
                    rightHeight = height[rightIndex];
                }
            }
        }
        return volume;
    }
}
