package by.bogdan.leetcode;

import java.util.*;

/**
 * Solution for https://leetcode.com/problems/minimum-window-substring/
 */
public class Solution076 {
    public String minWindow(String s, String t) {
        if (t == null || t == "" || s == null || s == "") {
            return "";
        }
        HashMap<Character, Integer> repetitions = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            Integer repeatedTimes = repetitions.get(c);
            if (repeatedTimes == null) {
                repetitions.put(c, 1);
            } else {
                repetitions.put(c, repeatedTimes + 1);
            }
        }
        int minWindowLength = Integer.MAX_VALUE;
        int minWindowStart = 0;
        int start = 0;
        int end = 0;
        int counter = t.length();
        while (end < s.length()) {
            Character c = s.charAt(end++);
            Integer repeatedTimes = repetitions.get(c);
            if (repeatedTimes != null) {
                if (repeatedTimes > 0) {
                    counter--;
                }
                repetitions.put(c, --repeatedTimes);
            }
            while (counter == 0) {
                if ((end - start) < minWindowLength) {
                    minWindowLength = end - start;
                    minWindowStart = start;
                }
                c = s.charAt(start++);
                repeatedTimes = repetitions.get(c);
                if (repeatedTimes != null) {
                    if (repeatedTimes == 0) {
                        counter++;
                    }
                    repetitions.put(c, ++repeatedTimes);
                }
            }
        }
        return minWindowLength == Integer.MAX_VALUE ? "" : s.substring(minWindowStart, minWindowStart + minWindowLength);
    }
}
