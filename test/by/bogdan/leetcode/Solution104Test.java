package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution104Test {
    private TreeNode root;

    @Before
    public void setUp() throws Exception {
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(4);
        root.right = new TreeNode(5);
    }

    @Test
    public void maxDepth() throws Exception {
        assertEquals(4, new Solution104().maxDepth(root));
        assertEquals(1, new Solution104().maxDepth(new TreeNode(1)));
        assertEquals(0, new Solution104().maxDepth(null));
    }

    @Test
    public void maxDepthRecursive() throws Exception {
        assertEquals(4, new Solution104().maxDepthRecursive(root));
        assertEquals(1, new Solution104().maxDepthRecursive(new TreeNode(1)));
        assertEquals(0, new Solution104().maxDepthRecursive(null));
    }
}