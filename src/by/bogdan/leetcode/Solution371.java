package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/sum-of-two-integers/
 */
public class Solution371 {
    public int getSum(int a, int b) {
        int carry = (a & b) << 1;
        int result = a ^ b;
        while (carry != 0) {
            int prevCarry = carry;
            carry = (result & carry) << 1;
            result = result ^ prevCarry;
        }
        return result;
    }

    public int getSumRecursive(int a, int b) {
        return b == 0 ? a : getSumRecursive(a ^ b, (a & b) << 1);
    }
}
