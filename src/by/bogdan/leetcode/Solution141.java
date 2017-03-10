package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.ListNode;

/**
 * Solutino for https://leetcode.com/problems/linked-list-cycle
 */
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (slow != fast && fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                fast = null;
            }
        }
        return fast != null;
    }
}
