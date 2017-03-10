package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/reverse-string
 */
public class Solution344 {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
