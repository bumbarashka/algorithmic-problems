package by.bogdan.leetcode;

/**
 * Solution for 'Longest Common Prefix' algorithmic problem.
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * @see <a href="https://leetcode.com/problems/roman-to-integer">14. Longest Common Prefix (on leetcode.com)</a>
 */
public class Solution014 {
    /**
     * Time is O(strs.length * max(strs[i].length). Memmory O(strs[0].length())
     * @param strs array of strings
     * @return longest common prefix string
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder(strs[0]);
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < result.length(); j++) {
                if (j >= strs[i].length() || result.charAt(j) != strs[i].charAt(j)) {
                    result.delete(j, result.length());
                    break;
                }
            }
            if (result.length() == 0) {
                return "";
            }
        }
        return result.toString();
    }
}
