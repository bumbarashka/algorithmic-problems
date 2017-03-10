package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/hamming-distance/
 */
public class Solution461 {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int result = 0;
        for (int i = 0; i < 31; i++) {
            result += xor & 1;
            xor = xor >> 1;
        }
        return result;
    }
}
