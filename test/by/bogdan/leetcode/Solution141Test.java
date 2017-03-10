package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution141Test {
    @Test
    public void hasCycle() throws Exception {
        assertFalse(new Solution141().hasCycle(null));
        assertFalse(new Solution141().hasCycle(new ListNode(1)));
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        assertFalse(new Solution141().hasCycle(root));
        root.next.next.next = root;
        assertTrue(new Solution141().hasCycle(root));
        ListNode newRoot = new ListNode(4);
        newRoot.next = root;
        assertTrue(new Solution141().hasCycle(newRoot));
    }
}