package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.Convertors;
import by.bogdan.leetcode.auxiliary.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Unit test for {@link Solution623}
 */
public class Solution623Test {
    @Test
    public void addOneRow() throws Exception {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(5);

        TreeNode resultRoot = new Solution623().addOneRow(root, 1, 2);

        assertThat(Convertors.toList(resultRoot), equalTo(Arrays.asList(4, 1, 2, 3, 1, 1, 6, 5)));
    }

    @Test
    public void addOneRowToTheLowestLevel() throws Exception {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(5);

        TreeNode resultRoot = new Solution623().addOneRow(root, 7, 4);

        assertThat(Convertors.toList(resultRoot), equalTo(Arrays.asList(4, 2, 3, 7, 7, 1, 7, 7, 6, 5, 7, 7)));
    }

    @Test
    public void addOneRowToTheFirstRow() throws Exception {
        TreeNode root = new TreeNode(4);
        TreeNode resultRoot = new Solution623().addOneRow(root, 7, 1);

        assertThat(Convertors.toList(resultRoot), equalTo(Arrays.asList(7, 4)));
    }
}