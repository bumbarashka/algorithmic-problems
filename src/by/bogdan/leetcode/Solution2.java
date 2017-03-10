package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.ListNode;

/**
 * Solution for https://leetcode.com/problems/add-two-numbers/
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        if (l1 != null) {
            sum += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            sum += l2.val;
            l2 = l2.next;
        }
        ListNode result = new ListNode(sum % 10);
        ListNode pointer = result;
        sum = sum / 10;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            pointer.next = new ListNode(sum % 10);
            pointer = pointer.next;
            sum = sum / 10;
        }
        if (sum > 0) {
            pointer.next = new ListNode(sum);
        }
        return result;
    }
}
