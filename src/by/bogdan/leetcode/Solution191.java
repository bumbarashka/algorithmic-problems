package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/number-of-1-bits
 */
public class Solution191 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }

    public int hammingWeight2(int n) {
        return Integer.bitCount(n);
    }

    public int hammingWeight3(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }
}
