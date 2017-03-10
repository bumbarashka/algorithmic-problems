package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.TreeNode;

/**
 * Solution  for https://leetcode.com/problems/minimum-absolute-difference-in-bst
 */
public class Solution530 {
    public int getMinimumDifference(TreeNode root) {
        return recMinDiff(root, null, null);
    }

    public int getMinimumDifference2(TreeNode root) {
        return inorderTraversal(root, Integer.MAX_VALUE, new Integer[1]);
    }

    private int recMinDiff(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        int currentMin = Integer.MAX_VALUE;
        if (max != null) {
            currentMin = Math.min(max - node.val, currentMin);
        }
        if (min != null) {
            currentMin = Math.min(node.val - min, currentMin);
        }
        int left = recMinDiff(node.left, min, node.val);
        int right = recMinDiff(node.right, node.val, max);
        return Math.min(Math.min(left, right), currentMin);
    }

    private int inorderTraversal(TreeNode node, int min, Integer[] previous) {
        if (node == null) {
            return min;
        }
        min = inorderTraversal(node.left, min, previous);
        if (previous[0] != null) {
            min = Math.min(min, node.val - previous[0]);
        }
        previous[0] = node.val;
        return inorderTraversal(node.right, min, previous);
    }
}
