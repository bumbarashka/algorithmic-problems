package by.bogdan.leetcode;

import java.util.HashMap;

/**
 * Solution for https://leetcode.com/problems/longest-substring-without-repeating-characters/?tab=Description
 */
public class Solution003 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        HashMap<Character, Integer> indexByChar = new HashMap<>();
        int i = 0;
        int maxLength = 0;
        int currentLength = 0;
        for (char c : s.toCharArray()) {
            if (indexByChar.containsKey(c)) {
                int index = indexByChar.get(c);
                if (i - currentLength > index) {
                    currentLength++;
                } else {
                    if (maxLength < currentLength) {
                        maxLength = currentLength;
                    }
                    currentLength = i - index;
                }
            } else {
                currentLength++;
            }
            indexByChar.put(c, i);
            i++;
        }
        if (maxLength < currentLength) {
            maxLength = currentLength;
        }
        return maxLength;
    }
}
