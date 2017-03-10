package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class Solution098Test {
    @Test
    public void isValidBST() throws Exception {
        StringBuilder sb = new StringBuilder("TEST");
        StringBuilder sb2 = new StringBuilder("TEST");
        String s = "TEST";
        Integer iv = 5;
        if (iv == 50L) {
            System.out.print("equals");
        }
        List<Integer> list = new ArrayList<>();
        Collections.sort(list, Comparator.comparingInt(a -> a));


        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        assertTrue(new Solution098().isValidBST(root));

        TreeNode ivalidTreeRoot = new TreeNode(1);
        ivalidTreeRoot.left = new TreeNode(2);
        ivalidTreeRoot.right = new TreeNode(3);
        assertFalse(new Solution098().isValidBST(ivalidTreeRoot));

        ivalidTreeRoot = new TreeNode(1);
        ivalidTreeRoot.left = new TreeNode(1);
        assertFalse(new Solution098().isValidBST(ivalidTreeRoot));

        ivalidTreeRoot = new TreeNode(1);
        ivalidTreeRoot.right = new TreeNode(1);
        assertFalse(new Solution098().isValidBST(ivalidTreeRoot));

        assertTrue(new Solution098().isValidBST(null));
    }

}