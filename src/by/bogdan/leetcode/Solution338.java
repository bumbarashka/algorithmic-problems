package by.bogdan.leetcode;

import java.util.Arrays;

/**
 * Solution for https://leetcode.com/problems/counting-bits/?tab=Description
 */
public class Solution338 {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        int i = 0;
        int currentPower = 0;
        int nextPower = 1;
        while (++i <= num) {
            if (i == nextPower) {
                currentPower = nextPower;
                nextPower *= 2;
            }
            result[i] = result[i - currentPower] + 1;
        }
        return result;
    }
}
