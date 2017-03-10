package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Solution94Test {
    @Test
    public void inorderTraversal() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        assertEquals(Arrays.asList(1, 3, 2), new Solution94().inorderTraversal(root));
    }

}