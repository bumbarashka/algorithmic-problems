package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/largest-palindrome-product/
 */
public class Solution479 {
    public int largestPalindrome(int n) {
        if (n == 1) {
            return 9;
        }
        long upperBoundary = (long) Math.pow(10, n);
        long lowerBoundary = upperBoundary / 10;
        long leftPart = upperBoundary - 2;
        long palindrome = 0;
        boolean found = false;
        while (!found && leftPart > lowerBoundary) {
            palindrome = leftPart * upperBoundary + getRightPart(leftPart);
            long minDivider = palindrome / (upperBoundary - 1) + (palindrome % (upperBoundary - 1) == 0 ? 0 : 1);
            for (long i = upperBoundary - 1; i >= minDivider; i--) {
                if (palindrome % i == 0) {
                    found = true;
                    break;
                }
            }
            leftPart--;
        }
        return (int) (palindrome % 1337);
    }

    private long getRightPart(long leftPart) {
        long rightPart = 0;
        while (leftPart != 0) {
            rightPart = rightPart * 10 + (leftPart % 10);
            leftPart = leftPart / 10;
        }
        return rightPart;
    }
}
