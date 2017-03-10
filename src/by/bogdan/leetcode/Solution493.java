package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/reverse-pairs/
 */
public class Solution493 {

    class TreeNode {
        int value;
        int count;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
            count = 1;
        }
    }

    public int reversePairs(int[] nums) {
        int result = 0;
        if (nums == null || nums.length < 2) {
            return result;
        }
        TreeNode root = insertNode(null, nums[0] / 2 + (nums[0] > 0 ? nums[0] % 2 : 0));
        for (int i = 1; i < nums.length; i++) {
            result += howManyPairs(root, nums[i]);
            insertNode(root, nums[i] / 2 + (nums[i] > 0 ? nums[i] % 2 : 0));
        }
        return result;
    }

    public int howManyPairs(TreeNode node, int value) {
        if (node == null) {
            return 0;
        }
        if (node.value <= value) {
            return howManyPairs(node.right, value);
        } else {
            return node.count + howManyPairs(node.left, value);
        }
    }

    public TreeNode insertNode(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (node.value == value) {
            node.count++;
        } else if (node.value < value) {
            node.count++;
            node.right = insertNode(node.right, value);
        } else {
            node.left = insertNode(node.left, value);
        }
        return node;
    }
}
