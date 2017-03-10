package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Solution for https://leetcode.com/problems/base-7/
 */
public class Solution504 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean minus = false;
        if (num < 0) {
            num = -1 * num;
            minus = true;
        }
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            result.append(num % 7);
            num = num / 7;
        }
        if (minus) {
            result.append("-");
        }
        return result.reverse().toString();
    }

    public String convertToBase7Simple(int num) {
        return Integer.toString(num, 7);
    }
}
