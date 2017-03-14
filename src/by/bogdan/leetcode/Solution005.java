package by.bogdan.leetcode;

/**
 * Solution for 'Longest Palindromic Substring' algorithmic problem.
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * @see <a href="https://leetcode.com/problems/longest-palindromic-substring">5. Longest Palindromic Substring (on leetcode.com)</a>
 */
public class Solution005 {
    /**
     * Time complexity is O(n*n). Space is O(1).
     *
     * @param s a string
     * @return the longest palindromic substring in s
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        char[] chars = s.toCharArray();
        int firstCharacter = 0;
        int length = 1;
        // start from middle, go to borders: middle -> middle - 1 -> middle + 1 -> middle - 2 -> middle + 2...
        for (int i = chars.length / 2, j = 0; i < chars.length - length / 2 && i >= length / 2; ++j, i = i + (j % 2 == 1 ? -1 : 1) * j) {
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length() && chars[left] == chars[right]) {
                right++;
                left--;
            }
            if (right - left - 1 > length) {
                firstCharacter = left + 1;
                length = right - left - 1;
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && chars[left] == chars[right]) {
                right++;
                left--;
            }
            if (right - left - 1 > length) {
                firstCharacter = left + 1;
                length = right - left - 1;
            }
        }
        return s.substring(firstCharacter, firstCharacter + length);
    }
}
