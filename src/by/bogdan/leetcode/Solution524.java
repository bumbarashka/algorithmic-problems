package by.bogdan.leetcode;

import java.util.List;

/**
 * Solution for https://leetcode.com/problems/longest-word-in-dictionary-through-deleting
 */
public class Solution524 {
    public String findLongestWord(String s, List<String> d) {
        String result = "";
        int[] pointers = new int[d.size()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < d.size(); j++) {
                String term = d.get(j);
                if (pointers[j] >= 0 && c == term.charAt(pointers[j])) {
                    pointers[j]++;
                    if (pointers[j] == term.length()) {
                        pointers[j] = -1;
                        if (result.length() < term.length()) {
                            result = term;
                        } else if (result.length() == term.length() && result.compareTo(term) > 0) {
                            result = term;
                        }
                    }
                }
            }
        }
        return result;
    }
}
