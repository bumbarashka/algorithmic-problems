package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.Convertors;
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
        assertArrayEquals(new Integer[]{4, 7, 9, 6, 2, 3, 1},
                Convertors.toList(new Solution226().invertTree(root)).toArray(new Integer[7]));
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
        assertArrayEquals(new Integer[]{4, 7, 9, 6, 2, 3, 1},
                Convertors.toList(new Solution226().invertTreeNoneRecursive(root)).toArray(new Integer[7]));
    }
}