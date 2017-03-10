package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Solution for https://leetcode.com/problems/binary-tree-inorder-traversal
 * Binary Tree Inorder Traversal
 */
public class Solution094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode currentNode = root;
        while (currentNode != null || stack.size() > 0) {
            if (currentNode == null) {
                currentNode = stack.pop();
                list.add(currentNode.val);
                currentNode = currentNode.right;
            } else {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
        }
        return list;
    }
}
