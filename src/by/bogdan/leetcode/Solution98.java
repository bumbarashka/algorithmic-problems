package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.TreeNode;

/**
 * Solution for https://leetcode.com/problems/validate-binary-search-tree
 */
public class Solution98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isValidRecursive(root, null, null);
    }

    private boolean isValidRecursive(TreeNode node, Integer min, Integer max) {
        if (min != null && node.val <= min) {
            return false;
        }
        if (max != null && node.val >= max) {
            return false;
        }
        boolean leftValid = true;
        boolean rightValid = true;
        if (node.left != null) {
            leftValid = isValidRecursive(node.left, min, node.val);
        }
        if (node.right != null) {
            rightValid = isValidRecursive(node.right, node.val, max);
        }
        return leftValid && rightValid;
    }
}
