package by.bogdan.leetcode;

/**
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving
 * whitespace and initial word order.
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 *
 * @see <a href="https://leetcode.com/problems/reverse-words-in-a-string-iii">557. Reverse Words in a String III (on leetcode.com)</a>
 */
public class Solution557 {
    /**
     * Time complexity is O(n). Memory usage is O(n)
     * @param s string to be reversed
     * @return reversed string
     */
    public String reverseWords(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (c == ' ') {
                for (int i = currentWord.length() - 1; i >= 0; i--) {
                    result.append(currentWord.charAt(i));
                }
                result.append(' ');
                currentWord = new StringBuilder();
            } else {
                currentWord.append(c);
            }
        }
        if (currentWord.length() > 0) {
            for (int i = currentWord.length() - 1; i >= 0; i--) {
                result.append(currentWord.charAt(i));
            }
        }
        return result.toString();
    }
}
