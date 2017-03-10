package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Solution for https://leetcode.com/problems/invert-binary-tree
 */
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tempRight = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(tempRight);
        return root;
    }

    public TreeNode invertTreeNoneRecursive(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size() > 0) {
            TreeNode node = queue.poll();
            TreeNode tempRight = node.right;
            node.right = node.left;
            node.left = tempRight;
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return root;
    }
}
