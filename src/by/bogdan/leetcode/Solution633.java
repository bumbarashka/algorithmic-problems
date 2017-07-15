package by.bogdan.leetcode;

import java.util.Map;

/**
 * Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a^2 + b^2 = c.
 *
 * @see <a href="https://leetcode.com/problems/sum-of-square-numbers">633. Sum of Square Numbers  (on leetcode.com)</a>
 */
public class Solution633 {

    /**
     * This methods solves the problem for O(sqrt(c) * log(c)) time. It uses binary search to find the second value.
     * @param c non-negative integer c
     * @return true if there're two integers a and b such that a^2 + b^2 = c, or false otherwise
     */
    public boolean judgeSquareSum(int c) {
        int a = 0;
        while ((long)a * a <= c) {
            int restOfC = c - a * a;
            int b = findB(a, restOfC);
            if (b >= 0) {
                return true;
            }
            a += 1;
        }
        return false;
    }

    private int findB(int left, int restOfC) {
        if (left == 0) {
            if (restOfC == 0) {
                return 0;
            } else {
                left = 1;
            }
        }
        int right = restOfC;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (middle < restOfC / middle) {
                left = middle + 1;
            } else if (middle > restOfC / middle) {
                right = middle - 1;
            } else {
                if (restOfC % middle == 0) {
                    return middle;
                } else {
                    left = middle + 1;
                }
            }
        }
        if (left == right && left == restOfC / right && restOfC % right == 0) {
            return left;
        } else {
            return -1;
        }
    }
}
