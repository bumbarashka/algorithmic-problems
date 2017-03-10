package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution513Test {
    @Test
    public void findBottomLeftValue() throws Exception {
        TreeNode root = new TreeNode(2);
        assertEquals(2, new Solution513().findBottomLeftValue(root));

        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        assertEquals(1, new Solution513().findBottomLeftValue(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        assertEquals(7, new Solution513().findBottomLeftValue(root));
    }
}