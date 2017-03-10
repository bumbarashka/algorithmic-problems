package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/number-complement/
 */
public class Solution476 {
    public int findComplement(int num) {
        int mask = 0;
        int checker = num;
        while (checker > 0) {
            mask <<= 1;
            mask |= 1;
            checker = checker >> 1;
        }
        return (~num) & mask;
    }

    public int findComplementOneLine(int num) {
        if (num == 0) {
            return 0;
        }
        return (~num) & ((Integer.highestOneBit(num) << 1) - 1);
    }
}
