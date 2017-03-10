package by.bogdan.leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * Solution for https://leetcode.com/problems/next-greater-element-i/
 */
public class Solution496 {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        HashMap<Integer, Integer> elementsToGreater = new HashMap<>(1000);
        Stack<Integer> waitingElements = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!waitingElements.isEmpty() && waitingElements.peek() < nums[i]) {
                elementsToGreater.put(waitingElements.pop(), nums[i]);
            }
            waitingElements.push(nums[i]);
        }
        int[] result = new int[findNums.length];
        for (int i = 0; i < findNums.length; i++) {
            result[i] = elementsToGreater.getOrDefault(findNums[i], -1);
        }
        return result;
    }
}
