package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

/**
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
 * Note:
 * <ul>
 *     <li>The range of node's value is in the range of 32-bit signed integer.</li>
 * </ul>
 *
 * @see <a href="https://leetcode.com/problems/sum-of-square-numbers">637. Average of Levels in Binary Tree (on leetcode.com)</a>
 */
public class Solution637 {
    /**
     * This methods finds average values of every tree's level. Complexity is O(n). Memory usage O(log(n)).
     * @param root root node of a tree
     * @return list of average values for every level of the tree
     */
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (queue.size() > 0) {
            double average = 0;
            for (int i = 0, size = queue.size(); i < size; i++) {
                TreeNode node = queue.poll();
                average += (double)node.val / size;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(average);
        }
        return result;
    }
}