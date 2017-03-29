package by.bogdan.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Solution for 'Letter Combinations of a Phone Number' algorithmic problem.
 * Given a digit string, return all possible letter combinations that the number could represent.
 * <p>
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 *
 * @see <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number">17. Letter Combinations of a Phone Number (on leetcode.com)</a>
 */
public class Solution017 {
    private final static char[][] letters = {
            {'0'},
            {'1'},
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
    };

    /**
     * Time complexity is O(4^n). Space Complexity is O(4^n)
     *
     * @param digits a digit string
     * @return all possible mapping of digit to letters
     */
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        Deque<StringBuilder> queue = new ArrayDeque<>();
        queue.add(new StringBuilder(digits.length()));
        for (int k = 0; k < digits.length() - 1; k++) {
            char[] lettersOfDigit = letters[digits.charAt(k) - '0'];
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                StringBuilder sb = queue.poll();
                for (int j = 0; j < lettersOfDigit.length - 1; j++) {
                    queue.add(new StringBuilder(sb).append(lettersOfDigit[j]));
                }
                queue.add(sb.append(lettersOfDigit[lettersOfDigit.length - 1]));
            }
        }
        char[] lettersOfDigit = letters[digits.charAt(digits.length() - 1) - '0'];
        List<String> list = new ArrayList<>(queue.size() * lettersOfDigit.length);
        while (queue.size() > 0) {
            String s = queue.poll().toString();
            for (int j = 0; j < lettersOfDigit.length; j++) {
                list.add(s + lettersOfDigit[j]);
            }
        }
        return list;
    }
}
