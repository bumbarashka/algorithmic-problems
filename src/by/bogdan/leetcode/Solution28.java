package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/implement-strstr
 */
public class Solution28 {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        int i = 0; // Position in haystack
        int j = 0; // Position in needle
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
                if (i + needle.length() > haystack.length()) {
                    return -1;
                }
            }
        }
        if (j == needle.length()) {
            return i - j;
        } else {
            return -1;
        }
    }
}
