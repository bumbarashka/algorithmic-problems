package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/min-stack
 * MinStack in the original description was replace with Solution155
 */
public class Solution155 {
    private StackNode root;

    private class StackNode {
        private int val;
        private int min;
        private StackNode next;

        StackNode(int val, StackNode node) {
            this.next = node;
            this.val = val;
            this.min = val;
            if (node != null && node.min < this.min) {
                this.min = node.min;
            }
        }
    }

    public Solution155() {
        root = null;
    }

    public void push(int x) {
        root = new StackNode(x, root);
    }

    public void pop() {
        if (root != null) {
            root = root.next;
        }
    }

    public int top() {
        return root.val;
    }

    public int getMin() {
        return root.min;
    }
}
