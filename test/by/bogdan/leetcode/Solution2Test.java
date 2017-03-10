package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.ListNode;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Solution2Test {
    @Test
    public void addTwoNumbers() throws Exception {
        Integer[] num1 = {3, 4, 2};
        Integer[] num2 = {4, 6, 5};
        ListNode l1 = arrayToList(num1);
        ListNode l2 = arrayToList(num2);

        assertArrayEquals(new Integer[]{7, 0, 8}, listToArray(new Solution2().addTwoNumbers(l1, l2)));

        num1 = new Integer[]{5, 8, 3, 3, 4, 8, 3, 8, 1, 1};
        num2 = new Integer[]{4, 4, 3, 8, 6, 3, 9, 8, 9};
        l1 = arrayToList(num1);
        l2 = arrayToList(num2);

        assertArrayEquals(new Integer[]{9, 2, 7, 1, 1, 2, 3, 7, 1, 2}, listToArray(new Solution2().addTwoNumbers(l1, l2)));

        num1 = new Integer[]{0, 2, 7, 5, 0, 8, 8, 9, 8};
        num2 = new Integer[]{0, 3, 1, 6, 4, 3, 3, 9, 2};
        l1 = arrayToList(num1);
        l2 = arrayToList(num2);

        assertArrayEquals(new Integer[]{0, 5, 8, 1, 5, 1, 2, 9, 1, 1}, listToArray(new Solution2().addTwoNumbers(l1, l2)));
    }

    private ListNode arrayToList(Integer[] nums) {
        ListNode result = new ListNode(nums[0]);
        ListNode pointer = result;
        for (int i = 1; i < nums.length; i++) {
            pointer.next = new ListNode(nums[i]);
            pointer = pointer.next;
        }
        return result;
    }

    private Integer[] listToArray(ListNode l) {
        ArrayList<Integer> result = new ArrayList<>();
        while (l != null) {
            result.add(l.val);
            l = l.next;
        }
        return result.toArray(new Integer[result.size()]);
    }
}