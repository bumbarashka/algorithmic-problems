package by.bogdan.leetcode.auxiliary;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ConvertorsTest {
    private TreeNode root1;
    private TreeNode root2;
    private TreeNode root3;

    @Before
    public void setUp() throws Exception {
        root1 = new TreeNode(4);
        root1.left = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(1);
        root1.right = new TreeNode(6);
        root1.right.left = new TreeNode(5);
        root1.right.right = new TreeNode(9);

        root2 = new TreeNode(4);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.right = new TreeNode(6);
        root2.right.left = new TreeNode(5);
        root2.right.right = new TreeNode(7);

        root3 = new TreeNode(5);
        root3.left = new TreeNode(4);
        root3.left.left = new TreeNode(2);
        root3.left.left.left = new TreeNode(1);
        root3.left.left.right = new TreeNode(3);
        root3.right = new TreeNode(8);
        root3.right.left = new TreeNode(6);
        root3.right.left.right = new TreeNode(9);
        root3.right.left.left = new TreeNode(7);
    }

    @Test
    public void toList() throws Exception {
        assertEquals(Arrays.asList(4, 2, 3, 1, 6, 5, 9), Convertors.toList(root1));
        assertEquals(Arrays.asList(4, 2, 3, 6, 5, 7), Convertors.toList(root2));
        assertEquals(Arrays.asList(5, 4, 2, 1, 3, 8, 6, 7, 9), Convertors.toList(root3));
        List<Integer> list = new ArrayList<>();
        List<Integer> result = Convertors.toList(new TreeNode(1), list);
        assertTrue(list == result);
        assertEquals(Arrays.asList(1), result);
    }
}