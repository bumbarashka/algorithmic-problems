package by.bogdan.leetcode;

import java.util.HashSet;

/**
 * Solution for https://leetcode.com/problems/happy-number
 */
public class Solution202 {
    public boolean isHappy(int n) {
        HashSet alreadyProcessed = new HashSet<>();
        while (n != 1) {
            if (alreadyProcessed.contains(n)) {
                return false;
            } else {
                alreadyProcessed.add(n);
            }
            n = getSumOfSquares(n);
        }
        return true;
    }

    private int getSumOfSquares(int n) {
        int sum = 0;
        while (n != 0) {
            sum += square(n % 10);
            n /= 10;
        }
        return sum;
    }

    private int square(int n) {
        return n * n;
    }
}
