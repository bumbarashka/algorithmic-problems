package by.bogdan.leetcode;

/**
 * Solution for 'Roman to Integer' algorithmic problem.
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 * @see <a href="https://leetcode.com/problems/roman-to-integer">13. Roman to Integer (on leetcode.com)</a>
 */
public class Solution013 {
    /**
     * Time complexity is O(length). Space complexity is O(1).
     * @param s a roman numeral
     * @return an integer
     */
    public int romanToInt(String s) {
        if (s == null) {
            return 0;
        }
        s = s.toUpperCase();
        int pos = 0;
        int sum = 0;
        while (pos < s.length()) {
            char c = s.charAt(pos);
            pos++;
            switch (c) {
                case 'I':
                    if (pos < s.length()) {
                        char next = s.charAt(pos);
                        if (next == 'V') {
                            sum += 4;
                            pos++;
                        } else if (next == 'X') {
                            sum += 9;
                            pos++;
                        } else {
                            sum += 1;
                        }
                    } else {
                        sum += 1;
                    }
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if (pos < s.length()) {
                        char next = s.charAt(pos);
                        if (next == 'L') {
                            sum += 40;
                            pos++;
                        } else if (next == 'C') {
                            sum += 90;
                            pos++;
                        } else {
                            sum += 10;
                        }
                    } else {
                        sum += 10;
                    }
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if (pos < s.length()) {
                        char next = s.charAt(pos);
                        if (next == 'D') {
                            sum += 400;
                            pos++;
                        } else if (next == 'M') {
                            sum += 900;
                            pos++;
                        } else {
                            sum += 100;
                        }
                    } else {
                        sum += 100;
                    }
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }
        return sum;
    }
}
