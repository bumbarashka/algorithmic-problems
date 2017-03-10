package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/divide-two-integers
 */
public class Solution029 {
    public int divide(int dividend, int divisor) {
        if (divisor == dividend) {
            return 1;
        }
        switch (divisor) {
            case 0:
                return Integer.MAX_VALUE;
            case 1:
                return dividend;
            case -1:
                return (dividend == Integer.MIN_VALUE) ? Integer.MAX_VALUE : -dividend;
            case Integer.MIN_VALUE:
                return 0;
        }
        int counter = 0;
        if (dividend == Integer.MIN_VALUE) {
            if (divisor > 0) {
                dividend += divisor;
                counter++;
            } else {
                dividend += -divisor;
                counter++;
            }
        }

        int sign = 1;
        if (dividend < 0) {
            sign = -sign;
            dividend = -dividend;
        }
        if (divisor < 0) {
            sign = -sign;
            divisor = -divisor;
        }
        int fastDivisor = divisor;
        int fastCounter = 1;
        while (fastDivisor < Integer.MAX_VALUE >> 1 && dividend >= fastDivisor << 1) {
            fastDivisor <<= 1;
            fastCounter <<= 1;
        }
        while (fastDivisor >= divisor) {
            if (dividend >= fastDivisor) {
                dividend -= fastDivisor;
                counter += fastCounter;
            } else {
                fastDivisor >>= 1;
                fastCounter >>= 1;
            }
        }
        if (sign < 0) {
            counter = -counter;
        }
        return counter;
    }
}
