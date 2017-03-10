package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/reverse-integer/
 */
public class Solution007 {
    public int reverse(int x) {
        Long result = 0l;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        if (result < Integer.MIN_VALUE || Integer.MAX_VALUE < result) {
            return 0;
        }
        return result.intValue();
    }
}
