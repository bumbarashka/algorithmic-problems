package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Solution for https://leetcode.com/problems/find-bottom-left-tree-value/
 */
public class Solution513 {
    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        boolean isFound = false;
        TreeNode node = null;
        while (!isFound) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                node = queue.poll();
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
            }
            if (queue.size() == 0) {
                isFound = true;
            }
        }
        return node.val;
    }
}