package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution515Test {
    @Test
    public void largestValues() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);
        assertArrayEquals(new Integer[]{1, 3, 9}, new Solution515().largestValues(root).toArray());

        assertArrayEquals(new Integer[0], new Solution515().largestValues(null).toArray());
    }
}