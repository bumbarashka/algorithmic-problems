package by.bogdan.leetcode;

/**
 * Solution for 'Minimum Time Difference' algorithmic problem.
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the
 * start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but
 * greater than or equal to k characters, then reverse the first k characters and left the other as original.
 * Note:
 * <ul>
 * <li>The string consists of lower English letters only.</li>
 * <li>Length of the given string and k will in the range [1, 10000]</li>
 * </ul>
 *
 * @see <a href="https://leetcode.com/problems/reverse-string-ii/">541. Reverse String II  (on leetcode.com)</a>
 */
public class Solution541 {
    /**
     * Efficiency is O(length). Memory usage is O(length).
     * @param s a string
     * @param k an integer
     * @return result of reverse the first k characters for every 2k characters counting from the
     * start of the string
     */
    public String reverseStr(String s, int k) {
        int doubleK = k * 2;
        StringBuilder builder = new StringBuilder();
        int upperBoundary = (s.length() / doubleK) * doubleK;
        boolean processTail = true;
        if (s.length() - upperBoundary >= k) {
            upperBoundary = s.length();
            processTail = false;
        }
        for (int i = 0; i < upperBoundary; i++) {
            int mod = i % doubleK;
            int div = i / doubleK;
            if (mod < k) {
                builder.append(s.charAt(div * doubleK + k - 1 - mod));
            } else {
                builder.append(s.charAt(i));
            }
        }
        if (processTail) {
            k = s.length() - upperBoundary;
            while (k > 0) {
                builder.append(s.charAt(upperBoundary + k - 1));
                k--;
            }
        }
        return builder.toString();
    }
}
