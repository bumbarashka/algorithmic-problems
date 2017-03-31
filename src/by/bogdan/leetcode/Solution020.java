package by.bogdan.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 * @see <a href="https://leetcode.com/problems/valid-parentheses">20. Valid Parentheses (on leetcode.com)</a>
 */
public class Solution020 {
    /**
     * Time complexity is O(n). Space complexity is O(n).
     *
     * @param s a string containing just the characters '(', ')', '{', '}', '[' and ']'
     * @return <code>true</code> if the input string is valid, otherwise <code>false</code>
     */
    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
        for (Character c : s.toCharArray()) {
            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                default:
                    if (stack.isEmpty() || c != stack.pop()) {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}
