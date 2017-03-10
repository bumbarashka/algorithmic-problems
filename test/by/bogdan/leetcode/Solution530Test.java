package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution530Test {
    @Test
    public void testSomething() throws Exception {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        assertEquals(1, new Solution530().getMinimumDifference(root));
    }

    @Test
    public void testSomething2() throws Exception {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        assertEquals(1, new Solution530().getMinimumDifference2(root));
    }
}