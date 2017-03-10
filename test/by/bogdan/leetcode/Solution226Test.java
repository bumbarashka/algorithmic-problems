package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Solution226Test {
    @Test
    public void invertTree() throws Exception {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        assertArrayEquals(new Integer[]{4, 7, 9, 6, 2, 3, 1}, toList(new Solution226().invertTree(root), null).toArray(new Integer[7]));
    }

    @Test
    public void invertTreeNoneRecursive() throws Exception {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        assertArrayEquals(new Integer[]{4, 7, 9, 6, 2, 3, 1}, toList(new Solution226().invertTreeNoneRecursive(root), null).toArray(new Integer[7]));
    }

    private List toList(TreeNode root, List<Integer> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (root != null) {
            list.add(root.val);
            toList(root.left, list);
            toList(root.right, list);
        }
        return list;
    }
}