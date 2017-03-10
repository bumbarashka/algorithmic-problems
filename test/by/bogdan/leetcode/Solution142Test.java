package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution142Test {
    @Test
    public void detectCycle() throws Exception {
        assertTrue(null == new Solution142().detectCycle(null));
        assertTrue(null == new Solution142().detectCycle(new ListNode(1)));

        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        assertTrue(null == new Solution142().detectCycle(root));

        root.next.next.next = root;
        assertTrue(root == new Solution142().detectCycle(root));

        ListNode newRoot = new ListNode(4);
        newRoot.next = root;
        assertTrue(root == new Solution142().detectCycle(newRoot));
    }
}