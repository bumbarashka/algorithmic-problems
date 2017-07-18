package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Given the root of a binary tree, then value v and depth d, you need to add a row of nodes with value v at the given depth d.
 * The root node is at depth 1.
 * The adding rule is: given a positive integer depth d, for each NOT null tree nodes N in depth d-1, create two tree
 * nodes with value v as N's left subtree root and right subtree root. And N's original left subtree should be the left
 * subtree of the new left subtree root, its original right subtree should be the right subtree of the new right subtree root.
 * If depth d is 1 that means there is no depth d-1 at all, then create a tree node with value v as the new root of the
 * whole original tree, and the original tree is the new root's left subtree.
 * Note:
 * <ul>
 *     <li>The given d is in range [1, maximum depth of the given tree + 1]</li>
 *     <li>The given binary tree has at least one tree node.</li>
 * </ul>
 *
 * @see <a href="https://leetcode.com/problems/add-one-row-to-tree">623. Add One Row to Tree (on leetcode.com)</a>
 */
public class Solution623 {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode newRoot = new TreeNode(v);
            newRoot.left = root;
            return newRoot;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int currentDepth = 1;
        while (currentDepth != d - 1) {
            for (int i = 0, size = queue.size(); i < size; i++ ) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            currentDepth++;
        }
        while (queue.size() > 0) {
            TreeNode node = queue.poll();
            TreeNode left = node.left;
            TreeNode right = node.right;
            node.left = new TreeNode(v);
            node.left.left = left;
            node.right = new TreeNode(v);
            node.right.right = right;
        }
        return root;
    }
}
