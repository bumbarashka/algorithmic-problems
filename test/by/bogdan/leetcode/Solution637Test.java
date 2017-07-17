package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Unit test for {@link Solution637}
 */
public class Solution637Test {
    @Test
    public void averageOfLevels() throws Exception {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertThat(new Solution637().averageOfLevels(root), equalTo(Arrays.asList(3d, 14.5d, 11d)));
    }

    @Test
    public void averageOfLevelsForSingleNodeTree() throws Exception {
        TreeNode root = new TreeNode(3);
        assertThat(new Solution637().averageOfLevels(root), equalTo(Collections.singletonList(3d)));
    }

}