package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/palindrome-number/
 */
public class Solution009 {
    // TODO: solve it without additional memory
    public boolean isPalindrome(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0)) {
            return false;
        }
        int temp = 0;
        while (x > temp) {
            temp = temp * 10 + x % 10;
            x /= 10;
        }
        return x == temp || x == (temp / 10);
    }
}
